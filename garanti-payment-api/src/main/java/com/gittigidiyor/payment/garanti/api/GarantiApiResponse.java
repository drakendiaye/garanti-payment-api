package com.gittigidiyor.payment.garanti.api;

import java.util.List;



public class GarantiApiResponse {

	private String apiException;
	private String orderId;
	private String source;
	private String responseCode;
	private String reasonCode;
	private String responseMessage;
	private String errorMsg;
	private String sysErrMsg;
	private String retRefNum;
	private String authCode;
	private String batchNum;
	private String sequenceNum;
	private String provDate;
	private List<String> hostMsgList;
	private GarantiOrderInqResult orderInqResult;
	
	public GarantiApiResponse() {
		super();
	}

	public String getApiException() {
		return apiException;
	}

	public void setApiException(String apiException) {
		this.apiException = apiException;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getSysErrMsg() {
		return sysErrMsg;
	}

	public void setSysErrMsg(String sysErrMsg) {
		this.sysErrMsg = sysErrMsg;
	}

	public String getRetRefNum() {
		return retRefNum;
	}

	public void setRetRefNum(String retRefNum) {
		this.retRefNum = retRefNum;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public String getSequenceNum() {
		return sequenceNum;
	}

	public void setSequenceNum(String sequenceNum) {
		this.sequenceNum = sequenceNum;
	}

	public String getProvDate() {
		return provDate;
	}

	public void setProvDate(String provDate) {
		this.provDate = provDate;
	}

	public List<String> getHostMsgList() {
		return hostMsgList;
	}

	public void setHostMsgList(List<String> hostMsgList) {
		this.hostMsgList = hostMsgList;
	}

	public GarantiOrderInqResult getOrderInqResult() {
		return orderInqResult;
	}

	public void setOrderInqResult(GarantiOrderInqResult orderInqResult) {
		this.orderInqResult = orderInqResult;
	}
	
}