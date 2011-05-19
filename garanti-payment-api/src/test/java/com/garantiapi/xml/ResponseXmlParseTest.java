package com.garantiapi.xml;
import java.io.File;

import noNamespace.GVPSResponseDocument;
import noNamespace.HostMsgListType;
import noNamespace.OrderInqResultType;
import noNamespace.ResponseOrderType;
import noNamespace.ResponseTransactionType;
import noNamespace.ResponseType;

import com.garantiapi.util.TestConstants;


public class ResponseXmlParseTest {

	public static void readTest(String fileName) {
		try {
			
			File responseFile = new File(fileName); 
			
			GVPSResponseDocument responseDocument = (GVPSResponseDocument) GVPSResponseDocument.Factory.parse(responseFile);
			
			System.out.println("****************************************Response Read Test :" + fileName);
			System.out.println("Mode : "+responseDocument.getGVPSResponse().getMode());
			
			ResponseOrderType orderType = responseDocument.getGVPSResponse().getOrder();
			if(orderType != null){
				System.out.println("Order_OrderID : "+orderType.getOrderID());
				OrderInqResultType orderInqResultType = orderType.getOrderInqResult();
				if(orderInqResultType != null){
					System.out.println("Order_OrderInqResultType_ChargeType : "+orderInqResultType.getChargeType());
					System.out.println("Order_OrderInqResultType_PreAuthAmount : "+orderInqResultType.getPreAuthAmount());
					System.out.println("Order_OrderInqResultType_PreAuthDate : "+orderInqResultType.getPreAuthDate());
					System.out.println("Order_OrderInqResultType_AuthAmount : "+orderInqResultType.getAuthAmount());
					System.out.println("Order_OrderInqResultType_AuthDate : "+orderInqResultType.getAuthDate());
				}
				
			}
			
			ResponseTransactionType responseTransactionType = responseDocument.getGVPSResponse().getTransaction();
			if(responseTransactionType != null) {
				ResponseType responseType = responseTransactionType.getResponse();
				if(responseType != null){
					System.out.println("Transaction_Response_Source : "+responseType.getSource());
					System.out.println("Transaction_Response_Code : "+responseType.getCode());
					System.out.println("Transaction_Response_ReasonCode : "+responseType.getReasonCode());
					System.out.println("Transaction_Response_Message : "+responseType.getMessage());
					System.out.println("Transaction_Response_ErrorMsg : "+responseType.getErrorMsg());
					System.out.println("Transaction_Response_SysErrMsg : "+responseType.getSysErrMsg());
				}

				System.out.println("Transaction_RetrefNum : "+responseTransactionType.getRetrefNum());
				System.out.println("Transaction_AuthCode : "+responseTransactionType.getAuthCode());
				System.out.println("Transaction_BatchNum : "+responseTransactionType.getBatchNum());
				System.out.println("Transaction_SequenceNum : "+responseTransactionType.getSequenceNum());
				System.out.println("Transaction_ProvDate : "+responseTransactionType.getProvDate());
				
				HostMsgListType hostMsgListType = responseTransactionType.getHostMsgList();
				if(hostMsgListType != null){
					for (int i = 0; i < hostMsgListType.getHostMsgArray().length; i++) {
						String hostMsg  = hostMsgListType.getHostMsgArray()[i];
						System.out.println("HostMsgList_HostMsg["+i+"] : "+hostMsg);
					}
				}
				
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ResponseXmlParseTest.readTest(TestConstants.XSD_PATH + "response.xml");
		ResponseXmlParseTest.readTest(TestConstants.XSD_PATH + "response_satis.xml");
		ResponseXmlParseTest.readTest(TestConstants.XSD_PATH + "response_iptal.xml");
		ResponseXmlParseTest.readTest(TestConstants.XSD_PATH + "response_iade.xml");
	}
	
}
