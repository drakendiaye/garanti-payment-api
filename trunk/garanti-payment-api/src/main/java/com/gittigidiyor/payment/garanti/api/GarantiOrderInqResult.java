package com.gittigidiyor.payment.garanti.api;

public class GarantiOrderInqResult {
	
	private String chargeType;
	private String preAuthAmount;
	private String preAuthDate;
	private String authAmount;
	private String authDate;
	
	public GarantiOrderInqResult() {
		super();
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getPreAuthAmount() {
		return preAuthAmount;
	}

	public void setPreAuthAmount(String preAuthAmount) {
		this.preAuthAmount = preAuthAmount;
	}

	public String getPreAuthDate() {
		return preAuthDate;
	}

	public void setPreAuthDate(String preAuthDate) {
		this.preAuthDate = preAuthDate;
	}

	public String getAuthAmount() {
		return authAmount;
	}

	public void setAuthAmount(String authAmount) {
		this.authAmount = authAmount;
	}

	public String getAuthDate() {
		return authDate;
	}

	public void setAuthDate(String authDate) {
		this.authDate = authDate;
	}

}
