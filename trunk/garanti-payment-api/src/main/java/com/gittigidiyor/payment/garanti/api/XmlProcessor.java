package com.gittigidiyor.payment.garanti.api;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;

import noNamespace.Card;
import noNamespace.CommentListType;
import noNamespace.CommentType;
import noNamespace.Customer;
import noNamespace.GVPSRequestDocument;
import noNamespace.GVPSResponseDocument;
import noNamespace.HostMsgListType;
import noNamespace.OrderInqResultType;
import noNamespace.RequestOrder;
import noNamespace.RequestTransaction;
import noNamespace.ResponseOrderType;
import noNamespace.ResponseTransactionType;
import noNamespace.ResponseType;
import noNamespace.Secure3D;
import noNamespace.Terminal;
import noNamespace.GVPSRequestDocument.GVPSRequest;

import org.apache.xmlbeans.XmlException;




class XmlProcessor {

	public static String getRequestXml(RequestData requestXmlData) throws GarantiApiException {
		String requestXml = null;
		
		try {		
			GVPSRequestDocument requestDocument = GVPSRequestDocument.Factory.newInstance();
		
			GVPSRequest request = requestDocument.addNewGVPSRequest();
			request.setMode(requestXmlData.getMode().trim());
			request.setVersion(requestXmlData.getVersion().trim());
			
			Terminal terminal = request.addNewTerminal();
			terminal.setProvUserID(requestXmlData.getProvUserId().trim());
			terminal.setHashData(requestXmlData.getHashData().trim());
			terminal.setUserID(requestXmlData.getUserId().trim());
			terminal.setID(requestXmlData.getTerminalId().trim());
			terminal.setMerchantID(requestXmlData.getMerchantId().trim());
			
			Customer customer = request.addNewCustomer();
			customer.setIPAddress(requestXmlData.getIp().trim());
			
			Card card = request.addNewCard();
			card.setNumber(requestXmlData.getCcNumber().trim());
			card.setExpireDate(requestXmlData.getExpireDate().trim());
			card.setCVV2(requestXmlData.getCvv2().trim());
			
			RequestOrder order = request.addNewOrder(); 
			order.setOrderID(requestXmlData.getOrderId().trim());
			order.setGroupID(requestXmlData.getGroupId().trim());
			
			if(requestXmlData.getCommentList() !=  null && !requestXmlData.getCommentList().isEmpty()){
				CommentListType commentList = order.addNewCommentList();
				for (String commentStr : requestXmlData.getCommentList()) {
					CommentType comment = commentList.addNewComment();
					comment.setNumber(1);
					comment.setText(commentStr);
				}
			}
			
			RequestTransaction requestTransaction = request.addNewTransaction();
			requestTransaction.setType(requestXmlData.getType().trim());
			requestTransaction.setInstallmentCnt(requestXmlData.getInstallment());
			requestTransaction.setAmount(requestXmlData.getAmountStr().trim());
			requestTransaction.setCurrencyCode(requestXmlData.getCurrencyCode().trim());
			requestTransaction.setOriginalRetrefNum(requestXmlData.getOriginalRetrefNum());
			requestTransaction.setCardholderPresentCode(requestXmlData.getCardholderPresentCode().trim());
			requestTransaction.setMotoInd(requestXmlData.getMotoInd().trim());
			
			if(GarantiApiConstants.CARD_HODLDER_CODE_3D.equals(requestXmlData.getCardholderPresentCode())){
				Secure3D secure3D = Secure3D.Factory.newInstance();
				secure3D.setSecurityLevel(requestXmlData.getSecurityLevel());
				secure3D.setTxnID(requestXmlData.getTxnId());
				secure3D.setAuthenticationCode(requestXmlData.getAuthenticationCode());
				secure3D.setMd(requestXmlData.getMd());
				requestTransaction.setSecure3D(secure3D);
			}

			Writer writer = new StringWriter();
			requestDocument.save(writer);
			requestXml = writer.toString();
		} catch (IOException e) {
			throw new GarantiApiException("An error occured while generating requestXml.", e.getCause());
		}
		
		return requestXml;
	}

	public static GarantiApiResponse parseResponseXml(String responseXml) throws GarantiApiException {
		GarantiApiResponse garantiApiResponse = new GarantiApiResponse();
		
		try {
			GVPSResponseDocument responseDocument = (GVPSResponseDocument) GVPSResponseDocument.Factory.parse(responseXml);
			
			ResponseTransactionType responseTransactionType = responseDocument.getGVPSResponse().getTransaction();
			if(responseTransactionType != null) {
				garantiApiResponse.setRetRefNum(responseTransactionType.getRetrefNum());
				garantiApiResponse.setAuthCode(responseTransactionType.getAuthCode());
				garantiApiResponse.setBatchNum(responseTransactionType.getBatchNum());
				garantiApiResponse.setSequenceNum(responseTransactionType.getSequenceNum());
				garantiApiResponse.setProvDate(responseTransactionType.getProvDate());
				
				ResponseType responseType = responseTransactionType.getResponse();
				if(responseType != null){
					garantiApiResponse.setSource(responseType.getSource());
					garantiApiResponse.setResponseCode(responseType.getCode());
					garantiApiResponse.setReasonCode(responseType.getReasonCode());
					garantiApiResponse.setResponseMessage(responseType.getMessage());
					garantiApiResponse.setErrorMsg(responseType.getErrorMsg());
					garantiApiResponse.setSysErrMsg(responseType.getSysErrMsg());
				}
				
				HostMsgListType hostMsgListType = responseTransactionType.getHostMsgList();
				if(hostMsgListType != null &&  hostMsgListType.getHostMsgArray().length > 0){
					garantiApiResponse.setHostMsgList(new ArrayList<String>());
					for (String hostMsg : hostMsgListType.getHostMsgArray()) {
						garantiApiResponse.getHostMsgList().add(hostMsg);
					}
				}
				
			}
			
			ResponseOrderType orderType = responseDocument.getGVPSResponse().getOrder();
			if(orderType != null){
				garantiApiResponse.setOrderId(orderType.getOrderID());
				
				OrderInqResultType orderInqResultType = orderType.getOrderInqResult();
				if(orderInqResultType != null){
					GarantiOrderInqResult orderInqResult = new GarantiOrderInqResult();
					orderInqResult.setChargeType(orderInqResultType.getChargeType());
					orderInqResult.setPreAuthAmount(orderInqResultType.getPreAuthAmount());
					orderInqResult.setPreAuthDate(orderInqResultType.getPreAuthDate());
					orderInqResult.setAuthAmount(orderInqResultType.getAuthAmount());
					orderInqResult.setAuthDate(orderInqResultType.getAuthDate());
					garantiApiResponse.setOrderInqResult(orderInqResult);
				}
			}
		} catch (XmlException e) {
			throw new GarantiApiException("An error occured while parsing responseXml.", e.getCause());
		}
		
		return garantiApiResponse;
	}

}
