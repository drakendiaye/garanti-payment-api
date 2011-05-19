package com.gittigidiyor.payment.garanti.api;

public class GarantiApiThreeDRequestInfo {
	
    private String hash;
    private String apiVersion;
    private String amount;
    private String installmentStr;
    private String errorMessage;
    
    public GarantiApiThreeDRequestInfo() {
		super();
	}

	public GarantiApiThreeDRequestInfo(String hash, String apiVersion, String amount, String installmentStr) {
		super();
		this.hash = hash;
		this.apiVersion = apiVersion;
		this.amount = amount;
		this.installmentStr = installmentStr;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getInstallmentStr() {
		return installmentStr;
	}

	public void setInstallmentStr(String installmentStr) {
		this.installmentStr = installmentStr;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
    
}
