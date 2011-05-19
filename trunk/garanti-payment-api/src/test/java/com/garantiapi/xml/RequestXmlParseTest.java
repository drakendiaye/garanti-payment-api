package com.garantiapi.xml;
import java.io.File;

import noNamespace.Card;
import noNamespace.Customer;
import noNamespace.GVPSRequestDocument;
import noNamespace.RequestOrder;
import noNamespace.RequestTransaction;
import noNamespace.Secure3D;
import noNamespace.Terminal;

import com.garantiapi.util.TestConstants;


public class RequestXmlParseTest {
	
	public static void readTest(String fileName) {
		try {
			
			File requestFile = new File(fileName); 
			
			GVPSRequestDocument requestDocument = (GVPSRequestDocument) GVPSRequestDocument.Factory.parse(requestFile);
			
			System.out.println("****************************************Request Read Test : " + fileName);
			System.out.println("Mode : "+requestDocument.getGVPSRequest().getMode());
			System.out.println("Version : "+requestDocument.getGVPSRequest().getVersion());

			Terminal terminal = requestDocument.getGVPSRequest().getTerminal();
			if(terminal != null){
				System.out.println("Terminal_ProvUserID : "+terminal.getProvUserID());
				System.out.println("Terminal_HashData : "+terminal.getHashData());
				System.out.println("Terminal_UserID : "+terminal.getUserID());
				System.out.println("Terminal_ID : "+terminal.getID());
				System.out.println("Terminal_MerchantID : "+terminal.getMerchantID());
			}
			
			Customer customer = requestDocument.getGVPSRequest().getCustomer();
			if(customer != null){
				System.out.println("Customer_IPAddress : "+customer.getIPAddress());
			}
			
			Card card = requestDocument.getGVPSRequest().getCard();
			if(card != null){
				System.out.println("Card_Number : "+card.getNumber());
				System.out.println("Card_ExpireDate : "+card.getExpireDate());
				System.out.println("Card_CVV2 : "+card.getCVV2());
			}		
			
			RequestOrder requestOrder = requestDocument.getGVPSRequest().getOrder();
			if(requestOrder != null){
				System.out.println("Order_OrderID : "+requestOrder.getOrderID());
			}	
			
			RequestTransaction requestTransaction = requestDocument.getGVPSRequest().getTransaction();
			if(requestTransaction != null){
				System.out.println("Transaction_Type : "+requestTransaction.getType());
				System.out.println("Transaction_InstallmentCnt : "+requestTransaction.getInstallmentCnt());
				System.out.println("Transaction_Amount : "+requestTransaction.getAmount());
				System.out.println("Transaction_CurrencyCode : "+requestTransaction.getCurrencyCode());
				System.out.println("Transaction_CardholderPresentCode : "+requestTransaction.getCardholderPresentCode());
				System.out.println("Transaction_MotoInd : "+requestTransaction.getMotoInd());
				
				Secure3D secure3D = requestTransaction.getSecure3D(); 
				if(secure3D != null){
					System.out.println("Transaction_Secure3D_AuthenticationCode : "+secure3D.getAuthenticationCode());
					System.out.println("Transaction_Secure3D_SecurityLevel : "+secure3D.getSecurityLevel());
					System.out.println("Transaction_Secure3D_TxnID : "+secure3D.getTxnID());
					System.out.println("Transaction_Secure3D_Md : "+secure3D.getMd());
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		RequestXmlParseTest.readTest(TestConstants.XSD_PATH + "request.xml");
		RequestXmlParseTest.readTest(TestConstants.XSD_PATH + "request_satis.xml");
		RequestXmlParseTest.readTest(TestConstants.XSD_PATH + "request_iptal.xml");
		RequestXmlParseTest.readTest(TestConstants.XSD_PATH + "request_iade.xml");
	}
	
}
