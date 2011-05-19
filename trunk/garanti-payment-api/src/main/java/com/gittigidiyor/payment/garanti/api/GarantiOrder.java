package com.gittigidiyor.payment.garanti.api;

public class GarantiOrder {
	
	private GarantiApiRequest request;
	private GarantiApiResponse response;
	private GarantiApiThreeDRequestInfo threeDRequestInfo;

	public GarantiOrder() {
		super();
	}

	public GarantiOrder(GarantiApiRequest request) {
		super();
		this.request = request;
	}

	public GarantiApiRequest getRequest() {
		return request;
	}

	public void setRequest(GarantiApiRequest request) {
		this.request = request;
	}

	public GarantiApiResponse getResponse() {
		return response;
	}

	public void setResponse(GarantiApiResponse response) {
		this.response = response;
	}

	public GarantiApiThreeDRequestInfo getThreeDRequestInfo() {
		return threeDRequestInfo;
	}

	public void setThreeDRequestInfo(GarantiApiThreeDRequestInfo threeDRequestInfo) {
		this.threeDRequestInfo = threeDRequestInfo;
	}

	public boolean processTransaction(){	
		boolean success = false;
		
		try {
			response = PaymentService.processTransaction(request);
			success = true;
		} catch (Exception e) {
			e.printStackTrace();
			response = new GarantiApiResponse();
			response.setApiException(e.getMessage() + e.getCause());
		}
		
		return success;
	}

	public boolean createThreeDPostInfo(){	
		boolean success = false;
		
		try {
			threeDRequestInfo = PaymentService.getThreeDRequestInfo(request);
			success = true;
		} catch (Exception e) {
			e.printStackTrace();
			threeDRequestInfo = new GarantiApiThreeDRequestInfo();
			threeDRequestInfo.setErrorMessage(e.getMessage());
		}
		
		return success;
	}
	
}
