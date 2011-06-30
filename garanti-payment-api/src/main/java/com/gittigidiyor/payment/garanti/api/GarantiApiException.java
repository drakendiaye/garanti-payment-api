package com.gittigidiyor.payment.garanti.api;

class GarantiApiException extends Exception{

	private static final long serialVersionUID = -4168433266927085056L;

	public GarantiApiException() {
		super();
	}

	public GarantiApiException(String message, Throwable cause) {
		super(message, cause);
	}

	public GarantiApiException(String message) {
		super(message);
	}

	public GarantiApiException(Throwable cause) {
		super(cause);
	}

}
