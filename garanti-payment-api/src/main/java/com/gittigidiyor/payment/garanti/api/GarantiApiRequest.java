package com.gittigidiyor.payment.garanti.api;

import java.util.ArrayList;
import java.util.List;


public class GarantiApiRequest {
	
	private String mode;
	private boolean mailOrder;
	// Terminal Data
	private String provUserId;
	private String provisionPassword;
	private String userId;	
	private String terminalId;
	private String merchantId;
	// Customer Data
	private String emailAddress;
	private String ip;
	// Card Data
	private String ccNumber;
	private String expireDate;
	private String cvv2;
	// Order Data
	private String orderId;
	private String groupId;
	private List<String> commentList;	
	// Transaction Data
	private String type;
	private Integer installment;
	private Double amount;
	private String currencyCode;
	private String originalRetRefNum;	
	// ThreeD data
	private boolean threeD;
	private String successUrl;
	private String failureUrl;
	private String storeKey;
	private String md;
	private String txnId;
	private String securityLevel;
	private String authenticationCode;

	private String hostAddress;
	
	public GarantiApiRequest() {
		super();
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public boolean isMailOrder() {
		return mailOrder;
	}

	public void setMailOrder(boolean mailOrder) {
		this.mailOrder = mailOrder;
	}

	public String getProvUserId() {
		return provUserId;
	}

	public void setProvUserId(String provUserId) {
		this.provUserId = provUserId;
	}

	public String getProvisionPassword() {
		return provisionPassword;
	}

	public void setProvisionPassword(String provisionPassword) {
		this.provisionPassword = provisionPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getCvv2() {
		return cvv2;
	}

	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<String> getCommentList() {
		if(commentList == null){
			commentList = new ArrayList<String>();
		}
		return commentList;
	}

	public void setCommentList(List<String> commentList) {
		this.commentList = commentList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getInstallment() {
		return installment;
	}

	public void setInstallment(Integer installment) {
		this.installment = installment;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getOriginalRetRefNum() {
		return originalRetRefNum;
	}

	public void setOriginalRetRefNum(String originalRetRefNum) {
		this.originalRetRefNum = originalRetRefNum;
	}

	public String getHostAddress() {
		return hostAddress;
	}

	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}

	public boolean isThreeD() {
		return threeD;
	}

	public void setThreeD(boolean threeD) {
		this.threeD = threeD;
	}

	public String getSuccessUrl() {
		return successUrl;
	}

	public void setSuccessUrl(String successUrl) {
		this.successUrl = successUrl;
	}

	public String getFailureUrl() {
		return failureUrl;
	}

	public void setFailureUrl(String failureUrl) {
		this.failureUrl = failureUrl;
	}

	public String getStoreKey() {
		return storeKey;
	}

	public void setStoreKey(String storeKey) {
		this.storeKey = storeKey;
	}

	public String getMd() {
		return md;
	}

	public void setMd(String md) {
		this.md = md;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getSecurityLevel() {
		return securityLevel;
	}

	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}

	public String getAuthenticationCode() {
		return authenticationCode;
	}

	public void setAuthenticationCode(String authenticationCode) {
		this.authenticationCode = authenticationCode;
	}
	
}