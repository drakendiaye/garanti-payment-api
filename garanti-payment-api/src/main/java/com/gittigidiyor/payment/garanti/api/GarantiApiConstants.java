package com.gittigidiyor.payment.garanti.api;

import java.util.Arrays;
import java.util.List;

class GarantiApiConstants {

	public static final String API_VERSION_DEFAULT	= "v0.01";
	
	public static final Integer TERMINAL_ID_LENGTH	= 9;
	
	public static final Integer COMMENT_TEXT_LENGTH_MAX	= 20;
	public static final Integer COMMENT_LIST_SIZE_MAX	= 10;


	public static final Integer INSTALLMENT_MIN	= 1;
	public static final Integer INSTALLMENT_MAX	= 12;

	public static List<String> MODE_LIST		= Arrays.asList(new String[]{"PROD", "TEST"});
	public static String MODE_DEFAULT			= "PROD";

	public static List<String> REQUEST_TYPE_LIST= Arrays.asList(new String[]{"sales", "void", "refund"});
	public static String REQUEST_TYPE_SALES		= "sales";
	public static String REQUEST_TYPE_VOID		= "void";
	public static String REQUEST_TYPE_REFUND	= "refund";

	public static String IP_DEFAULT				= "0.0.0.0";
	
	public static String CARD_HODLDER_CODE		= "0";
	public static String CARD_HODLDER_CODE_3D	= "13";
	
	public static String MOTO_IND_YES			= "Y";
	public static String MOTO_IND_NO			= "N";
	
}
