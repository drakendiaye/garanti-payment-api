package com.gittigidiyor.payment.garanti.api;

import java.util.List;

class RequestData {
	
	// Base Data
	private String mode;
	private String version;	
	// Terminal Data
	private String provUserId;
	private String provisionPassword;
	private String userId;	
	private String terminalId;
	private String merchantId;
	private String securityData;
	private String hashData;
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
	private String installment;
	private String amountStr;
	private String currencyCode;	
	private String originalRetrefNum;	
	private String cardholderPresentCode;
	private String motoInd;
	// ThreeD data
	private String md;
	private String txnId;
	private String securityLevel;
	private String authenticationCode;
	
	public RequestData() {
		super();
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
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

	public String getSecurityData() {
		return securityData;
	}

	public void setSecurityData(String securityData) {
		this.securityData = securityData;
	}

	public String getHashData() {
		return hashData;
	}

	public void setHashData(String hashData) {
		this.hashData = hashData;
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

	public String getInstallment() {
		return installment;
	}

	public void setInstallment(String installment) {
		this.installment = installment;
	}

	public String getAmountStr() {
		return amountStr;
	}

	public void setAmountStr(String amountStr) {
		this.amountStr = amountStr;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getOriginalRetrefNum() {
		return originalRetrefNum;
	}

	public void setOriginalRetrefNum(String originalRetrefNum) {
		this.originalRetrefNum = originalRetrefNum;
	}

	public String getCardholderPresentCode() {
		return cardholderPresentCode;
	}

	public void setCardholderPresentCode(String cardholderPresentCode) {
		this.cardholderPresentCode = cardholderPresentCode;
	}

	public String getMotoInd() {
		return motoInd;
	}

	public void setMotoInd(String motoInd) {
		this.motoInd = motoInd;
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

	private void populateData(GarantiApiRequest garantiApiRequest) throws GarantiApiException{

		this.setVersion(GarantiApiConstants.API_VERSION_DEFAULT);	
		
		this.setMode(GarantiApiUtil.getDefaultModeIfNecessary(garantiApiRequest.getMode()));
		
		this.setProvUserId(garantiApiRequest.getProvUserId());
		
		this.setProvisionPassword(garantiApiRequest.getProvisionPassword());
		
		this.setUserId(garantiApiRequest.getUserId());	
		
		this.setTerminalId(garantiApiRequest.getTerminalId());
		
		this.setMerchantId(garantiApiRequest.getMerchantId());
		
		this.setEmailAddress(garantiApiRequest.getEmailAddress() == null ? "" :garantiApiRequest.getEmailAddress());
		
		this.setIp(StringUtil.isNullOrZeroLength(garantiApiRequest.getIp()) ? GarantiApiConstants.IP_DEFAULT : garantiApiRequest.getIp());
		
		this.setCcNumber(garantiApiRequest.getCcNumber() == null ? "" : garantiApiRequest.getCcNumber());
		
		this.setExpireDate(garantiApiRequest.getExpireDate() == null ? "" : garantiApiRequest.getExpireDate());
		
		this.setCvv2(garantiApiRequest.getCvv2() == null ? "" : garantiApiRequest.getCvv2());
		
		this.setOrderId(garantiApiRequest.getOrderId() == null ? "" : garantiApiRequest.getOrderId());
		
		this.setGroupId(garantiApiRequest.getGroupId() == null ? "" : garantiApiRequest.getGroupId());
		
		this.setCommentList(GarantiApiUtil.arrangeCommenList(garantiApiRequest.getCommentList()));
		
		this.setType(garantiApiRequest.getType());
		
		this.setInstallment(GarantiApiUtil.getInstallmentAsString(garantiApiRequest.getInstallment()));
		
		this.setCurrencyCode(garantiApiRequest.getCurrencyCode());
		
		this.setOriginalRetrefNum(garantiApiRequest.getOriginalRetRefNum() == null ? "" : garantiApiRequest.getOriginalRetRefNum());
		
		this.setAmountStr(GarantiApiUtil.getAmountAsString(garantiApiRequest.getAmount()));

		this.setMotoInd(garantiApiRequest.isMailOrder() ? GarantiApiConstants.MOTO_IND_YES : GarantiApiConstants.MOTO_IND_NO);

	}
	
	private void populateHashData() throws GarantiApiException {
		try {
			this.setSecurityData(GarantiApiUtil.calculateHashAsDefaultAndUpperCase(
					this.getProvisionPassword() + 
					GarantiApiUtil.getArrangedTerminalId(getTerminalId())));
			
			this.setHashData(GarantiApiUtil.calculateHashAsDefaultAndUpperCase(
					this.getOrderId() + 
					this.getTerminalId() + 
					this.getCcNumber() + 
					this.getAmountStr() + 
					this.getSecurityData()));
		} catch (Exception e) {
			throw new GarantiApiException("Error Occured During Request Hash Calculation", e.getCause());
		}
	}

	public void populate(GarantiApiRequest garantiApiRequest) throws GarantiApiException{
		
		this.populateData(garantiApiRequest);

		if(garantiApiRequest.isThreeD()){			
			this.setCardholderPresentCode(GarantiApiConstants.CARD_HODLDER_CODE_3D);
			
			this.setMd(garantiApiRequest.getMd() == null ? "" : garantiApiRequest.getMd());
			
			this.setTxnId(garantiApiRequest.getTxnId() == null ? "" : garantiApiRequest.getTxnId());
			
			this.setSecurityLevel(garantiApiRequest.getSecurityLevel() == null ? "" : garantiApiRequest.getSecurityLevel());
			
			this.setAuthenticationCode(garantiApiRequest.getAuthenticationCode() == null ? "" : garantiApiRequest.getAuthenticationCode());			
		}else{
			this.setCardholderPresentCode(GarantiApiConstants.CARD_HODLDER_CODE);
		}
		
		this.populateHashData();		
	}
//	
//	private void populateHashDataForThreeD(GarantiApiRequest garantiApiRequest) throws GarantiApiException {
//		try {
//			this.setSecurityData(GarantiApiUtil.calculateHashAsDefaultAndUpperCase(
//					this.getProvisionPassword() + 
//					GarantiApiUtil.getArrangedTerminalId(getTerminalId())));
//			
//			this.setHashData(GarantiApiUtil.calculateHashAsDefaultAndUpperCase(
//					this.getTerminalId() + 
//					this.getOrderId() + 
//					this.getAmountStr() + 
//					garantiApiRequest.getSuccessUrl() + 
//					garantiApiRequest.getFailureUrl() + 
//					this.getType() + 
//					this.getInstallment() + 
//					garantiApiRequest.getStoreKey() + 
//					this.getSecurityData()));
//		} catch (Exception e) {
//			throw new GarantiApiException("Error Occured During Request Hash Calculation", e.getCause());
//		}
//	}
//
//	public void populateForThreeDPost(GarantiApiRequest garantiApiRequest) throws GarantiApiException{
//		
//		this.populateData(garantiApiRequest);
//		
//		this.populateHashDataForThreeD(garantiApiRequest);
//		
//	}
	
}
