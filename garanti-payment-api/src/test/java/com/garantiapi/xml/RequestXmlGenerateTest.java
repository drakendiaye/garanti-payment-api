package com.garantiapi.xml;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import noNamespace.Card;
import noNamespace.CommentListType;
import noNamespace.CommentType;
import noNamespace.Customer;
import noNamespace.GVPSRequestDocument;
import noNamespace.RequestOrder;
import noNamespace.RequestTransaction;
import noNamespace.Secure3D;
import noNamespace.Terminal;
import noNamespace.GVPSRequestDocument.GVPSRequest;

public class RequestXmlGenerateTest {

	public static void main(String[] args) {
		
		try {
			GVPSRequestDocument requestDocument = GVPSRequestDocument.Factory.newInstance();
			
			GVPSRequest request = requestDocument.addNewGVPSRequest();
			request.setMode("New Mode");
			request.setVersion("Nev Version");
			
			Terminal terminal = request.addNewTerminal();
			terminal.setProvUserID("New ProvUserID");
			terminal.setHashData("New HashData");
			terminal.setUserID("New UserID");
			terminal.setID("New ID");
			terminal.setMerchantID("New MerchantID");
						
			Customer customer = request.addNewCustomer();
			customer.setIPAddress("New IPAddress");
			
			Card card = request.addNewCard();
			card.setNumber("New Number");
			card.setExpireDate("New ExpireDate");
			card.setCVV2("New cvv2");
			
			RequestOrder order = request.addNewOrder(); 
			order.setOrderID("New OrderID");
			
			CommentListType commentList = order.addNewCommentList();
			CommentType commentType = commentList.addNewComment();
			commentType.setNumber(1);
			commentType.setText("new comment");			
			
			RequestTransaction requestTransaction = request.addNewTransaction();
			requestTransaction.setType("New Type");
			requestTransaction.setInstallmentCnt("New InstallmentCnt");
			requestTransaction.setAmount("New Amount");
			requestTransaction.setCurrencyCode("New CurrencyCode");
			requestTransaction.setCardholderPresentCode("New CardholderPresentCode");
			requestTransaction.setMotoInd("New MotoInd");
			
			Secure3D secure3D = requestTransaction.addNewSecure3D();
			secure3D.setAuthenticationCode("New AuthenticationCode");
			secure3D.setSecurityLevel("New SecurityLevel");
			secure3D.setTxnID("New TxnID");
			secure3D.setMd("New Md");
			
//			requestDocument.save(new File(TestConstants.XSD_PATH + "request_new.xml"));
			Writer writer = new StringWriter();
			requestDocument.save(writer);
			System.out.println(writer.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
