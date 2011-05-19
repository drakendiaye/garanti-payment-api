package com.garantiapi.payment;

import com.gittigidiyor.payment.garanti.api.GarantiApiRequest;
import com.gittigidiyor.payment.garanti.api.GarantiApiResponse;
import com.gittigidiyor.payment.garanti.api.GarantiOrder;

public class PaymentServiceTest {

	public static final String[] SEVGI_USLU_SANAL				= {"x","x","x"};
	public static final String[] GITTI_GIDIYOR_GARANTI_BONUS 	= {"x","x","x"};


	private GarantiApiRequest createGarantiPaymentRequest(
			String type, String orderId, Double amount, Integer installment, 
			String[] cardInfo, String provUserId, String provisionPassword){
		GarantiApiRequest garantiApiRequest= new GarantiApiRequest();
		
		garantiApiRequest.setMode("PROD");
		garantiApiRequest.setProvUserId(provUserId);
		garantiApiRequest.setProvisionPassword(provisionPassword);
		garantiApiRequest.setUserId("prodtest");	
		garantiApiRequest.setTerminalId("10000039");
		garantiApiRequest.setMerchantId("3409000");
		garantiApiRequest.setIp("192.168.1.1");
	
		garantiApiRequest.setOrderId(orderId);
		garantiApiRequest.getCommentList().add(orderId);	
		garantiApiRequest.setType(type);
		garantiApiRequest.setInstallment(installment);
		garantiApiRequest.setAmount(amount);
		garantiApiRequest.setCurrencyCode("949");
		garantiApiRequest.setHostAddress("https://sanalposprov.garanti.com.tr/VPServlet");

		if(cardInfo != null){
			garantiApiRequest.setCcNumber(cardInfo[0]);
			garantiApiRequest.setExpireDate(cardInfo[1]);
			garantiApiRequest.setCvv2(cardInfo[2]);
		}

		return garantiApiRequest;
	}
	
	private void printResponse(GarantiApiResponse garantiApiResponse){
		System.out.println("apiException : "+garantiApiResponse.getApiException());
		System.out.println("orderId : "+garantiApiResponse.getOrderId());
		System.out.println("source : "+garantiApiResponse.getSource());
		System.out.println("code : "+garantiApiResponse.getResponseCode());
		System.out.println("reasonCode : "+garantiApiResponse.getReasonCode());
		System.out.println("message : "+garantiApiResponse.getResponseMessage());
		System.out.println("errorMsg : "+garantiApiResponse.getErrorMsg());
		System.out.println("sysErrMsg : "+garantiApiResponse.getSysErrMsg());
		System.out.println("retrefNum : "+garantiApiResponse.getRetRefNum());
		System.out.println("authCode : "+garantiApiResponse.getAuthCode());
		System.out.println("batchNum : "+garantiApiResponse.getBatchNum());
		System.out.println("sequenceNum : "+garantiApiResponse.getSequenceNum());
		System.out.println("provDate : "+garantiApiResponse.getProvDate());
		
		if(garantiApiResponse.getOrderInqResult() != null){
			System.out.println("chargeType : "+garantiApiResponse.getOrderInqResult().getChargeType());
			System.out.println("preAuthAmount : "+garantiApiResponse.getOrderInqResult().getPreAuthAmount());
			System.out.println("preAuthDate : "+garantiApiResponse.getOrderInqResult().getPreAuthDate());
			System.out.println("authAmount : "+garantiApiResponse.getOrderInqResult().getAuthAmount());
			System.out.println("authDate : "+garantiApiResponse.getOrderInqResult().getAuthDate());
		}
	}
	
	private void testPreauth(String orderId, Double amount, Integer installment, String[] cardInfo){
		GarantiApiRequest garantiApiRequest = createGarantiPaymentRequest("preauth", orderId, amount, installment, cardInfo, "PROVAUT", "provAUT123");
		GarantiOrder garantiOrder = new GarantiOrder(garantiApiRequest);
		garantiOrder.processTransaction();
		printResponse(garantiOrder.getResponse());
	}
	
	private void testPostauth(String orderId, Double amount){
		GarantiApiRequest garantiApiRequest = createGarantiPaymentRequest("postauth", orderId, amount, null, null, "PROVAUT", "provAUT123");
		GarantiOrder garantiOrder = new GarantiOrder(garantiApiRequest);
		garantiOrder.processTransaction();
		printResponse(garantiOrder.getResponse());
	}
	
	private void testPayment(String orderId, Double amount, Integer installment, String[] cardInfo){
		GarantiApiRequest garantiApiRequest = createGarantiPaymentRequest("sales", orderId, amount, installment, cardInfo, "PROVAUT", "provAUT123");
		GarantiOrder garantiOrder = new GarantiOrder(garantiApiRequest);
		garantiOrder.processTransaction();
		printResponse(garantiOrder.getResponse());
	}
	
	private void testReturnPayment(String orderId, Double amount){
		GarantiApiRequest garantiApiRequest = createGarantiPaymentRequest("refund", orderId, amount, null, null, "PROVRFN", "provRFN123");
		GarantiOrder garantiOrder = new GarantiOrder(garantiApiRequest);
		garantiOrder.processTransaction();
		printResponse(garantiOrder.getResponse());
	}
	
	private void testCancelPayment(String orderId){
		GarantiApiRequest garantiApiRequest = createGarantiPaymentRequest("void", orderId, null, null, null, "PROVRFN", "provRFN123");
		GarantiOrder garantiOrder = new GarantiOrder(garantiApiRequest);
		garantiOrder.processTransaction();
		printResponse(garantiOrder.getResponse());
	}
	
	private void testOrderInquiry(String orderId){
		GarantiApiRequest garantiApiRequest = createGarantiPaymentRequest("orderinq", orderId, null, null, null, "PROVAUT", "provAUT123");
		GarantiOrder garantiOrder = new GarantiOrder(garantiApiRequest);
		garantiOrder.processTransaction();
		printResponse(garantiOrder.getResponse());
	}
	
	public static void main(String[] args) {
		String orderId = "GgTest-20110221002";
		PaymentServiceTest paymentServiceTest = new PaymentServiceTest();
//		paymentServiceTest.testPreauth(orderId, 0.5, 1, PaymentServiceTest.SEVGI_USLU_SANAL);
//		paymentServiceTest.testPostauth(orderId, 0.5);
		paymentServiceTest.testPayment(orderId, 0.5, 1, PaymentServiceTest.SEVGI_USLU_SANAL);
//		paymentServiceTest.testReturnPayment(orderId, 0.5);
//		paymentServiceTest.testCancelPayment(orderId);
		paymentServiceTest.testOrderInquiry(orderId);
	}
}
