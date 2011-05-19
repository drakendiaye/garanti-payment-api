package com.gittigidiyor.payment.garanti.api;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sun.misc.BASE64Encoder;

/**
 * @author Hakan ERDOGAN
 * hakan.erdogan@gittigidiyor.com
 * http://www.jroller.com/hakan/
 * Created on 21.Kas.2007 23:03:33
 */
class StringUtil {

	/**
	 * Returns a trimmed value of the given string. 
	 *
	 * @param  str  given string
	 * @return      trimmed value of the given string
	 */
	public static String trim(String str) {
		if(str != null) {
			str = str.trim();
		}
		return str;
	}
    
	
	/**
	 * Returns a trimmed value of the given string or null if the trimmed value is empty. 
	 *
	 * @param  str  given string
	 * @return      trimmed value of the given string or null if the trimmed value is empty
	 */
    public static String trimAndSetNullIfBlank(String str) {
		if(str != null) {
			str = str.trim();
            if(str.length() == 0) {
                str = null;
            }
		}
		return str;
	}
	  
	public static void trimAndSetNullIfBlank(String[] str) {
		if(str != null) {
			for(int i=0; i<str.length; i++) {
				str[i] = trimAndSetNullIfBlank(str[i]);
            }
		}
	}
        
	public static boolean isNullOrZeroLength(String str) {
		if(str == null || str.trim().length() == 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Checks elements whether they are all null or zero length.
	 * 
	 * @param strArray
	 * @return true if all elements of specified array are null or zero length
	 * 			if strArray is null or zero length, returns true. 
	 */
	public static boolean areNullOrZeroLength(String... strArray) {
		if(strArray != null && strArray.length > 0) {
    		for(String str : strArray) {
    			if(!isNullOrZeroLength(str)) {
    				return false;
    			}
    		}
    	}
    	return true;
	}
	
	/**
	 * Checks array whether it has null or zero length element.
	 * 
	 * @param strArray
	 * @return true if string array has null or zero length element 
	 * 			and returns false if strArray is null or zero length 
	 */
	public static boolean hasNullOrZeroLengthElement(String... strArray) {
		if(strArray != null && strArray.length > 0) {
			for(String str : strArray) {
				if(isNullOrZeroLength(str)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static String getSHA1Text(String text) throws Exception {
		MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
		
		String hash = (new BASE64Encoder()).encode(sha1.digest(text.getBytes()));

		return hash;
	}

	/*
	 * 	\u011F g
	 *	\u011E G
	 *	\u00FC u
	 *	\u00DC U
	 *	\u015F s
	 *	\u015E S
	 *	\u00F6 o
	 *	\u00D6 O
	 *	\u00E7 c
	 *	\u00C7 C
	 *	\u0131 i
	 *	\u0130 I
	 */	
	public static String toHtmlAscii(String str) {
		if(! isNullOrZeroLength(str)) {
			str = str.replaceAll("\u011F", "&#287;");
			str = str.replaceAll("\u011E", "&#286;");
			str = str.replaceAll("\u00FC", "&#252;");
			str = str.replaceAll("\u00DC", "&#220;");
			str = str.replaceAll("\u015F", "&#351;");
			str = str.replaceAll("\u015E", "&#350;");
			str = str.replaceAll("\u00F6", "&#246;");
			str = str.replaceAll("\u00D6", "&#214;");
			str = str.replaceAll("\u00E7", "&#231;");
			str = str.replaceAll("\u00C7", "&#199;");
			str = str.replaceAll("\u0131", "&#305;");
			str = str.replaceAll("\u0130", "&#304;");
		}
		return str;
	}

	public static String toAscii(String str) {
		if(! isNullOrZeroLength(str)) {
			str = str.replaceAll("\u011F", "g");
			str = str.replaceAll("\u011E", "G");
			str = str.replaceAll("\u00FC", "u");
			str = str.replaceAll("\u00DC", "U");
			str = str.replaceAll("\u015F", "s");
			str = str.replaceAll("\u015E", "S");
			str = str.replaceAll("\u00F6", "o");
			str = str.replaceAll("\u00D6", "O");
			str = str.replaceAll("\u00E7", "c");
			str = str.replaceAll("\u00C7", "C");
			str = str.replaceAll("\u0131", "i");
			str = str.replaceAll("\u0130", "I");
		}
		return str;
	}

	public static String shortenLength(String str, int length) {
        if(str != null && str.length() > length) {
            str = str.substring(0, length);
        }
        return str;
    }
	
	private static List<Double> removeNotNumbersAndGetAsList(String[] strArray) {
		List<Double> list = new ArrayList<Double>();
		
		if(strArray != null && strArray.length > 0) {
			for(String str : strArray) {
				if(! isNullOrZeroLength(str)) {
					try {
						double number = Double.parseDouble(str);
						list.add(number);
					}catch(NumberFormatException e) {
						// do nothing
					}
				}
			}
		}
		
		return list;
	}
	
	public static Double[] getAsDoubleArray(String[] strArray) {
		Double[] array = null;
		
		List<Double> list = removeNotNumbersAndGetAsList(strArray);
		
		if(list != null && list.size() > 0) {
			array = new Double[list.size()];
			list.toArray(array);
		}
		
		return array;
	}
	
	public static Integer[] getAsIntegerArray(String[] strArray) {
		Integer[] array = null;
		
		List<Double> list = removeNotNumbersAndGetAsList(strArray);
		
		if(list != null && list.size() > 0) {
			array = new Integer[list.size()];
			for(int i=0; i<list.size(); i++) {
				array[i] = ((Double) list.get(i)).intValue();
			}
		}

		return array;
	}
	
	
	public static int[] getAsIntArray(String[] strArray) {
		int[] array = null;
		
		List<Double> list = removeNotNumbersAndGetAsList(strArray);
		
		if(list != null && list.size() > 0) {
			array = new int[list.size()];
			for(int i=0; i<list.size(); i++) {
				array[i] = ((Double) list.get(i)).intValue();
			}
		}

		return array;
	}
	
	public static Long[] getAsLongArray(String[] strArray) {
		Long[] array = null;
		
		List<Double> list = removeNotNumbersAndGetAsList(strArray);
		
		if(list != null && list.size() > 0) {
			array = new Long[list.size()];
			for(int i=0; i<list.size(); i++) {
				array[i] = ((Double) list.get(i)).longValue();
			}
		}

		return array;
	}
		
	public static int[] getAsIntArray(String diyezSeparatedString, String separator) {
		if(diyezSeparatedString != null) {
			String[] strArray = diyezSeparatedString.split(separator);
			return getAsIntArray(strArray);
		}
		return null;
	}
	
	public static Integer[] getAsIntegerArray(String diyezSeparatedString, String separator) {
		if(diyezSeparatedString != null) {
			String[] strArray = diyezSeparatedString.split(separator);
			return getAsIntegerArray(strArray);
		}
		return null;
	}
	
	public static Long[] getAsLongArray(String diyezSeparatedString, String separator) {
		if(diyezSeparatedString != null) {
			String[] strArray = diyezSeparatedString.split(separator);
			return getAsLongArray(strArray);
		}
		return null;
	}
		
	public static Double[] getAsDoubleArray(String diyezSeperatedString, String separator) {
		if(diyezSeperatedString != null) {
			String[] strArray = diyezSeperatedString.split(separator);
			return getAsDoubleArray(strArray);
		}
		return null;
	}
	
	public static String[] getAsStringArray(String diyezSeperatedString, String separator) {
		if(diyezSeperatedString != null) {
			return diyezSeperatedString.split(separator);
		}
		return null;
	}
	
	public static String getAsCommaSeperatedString(List<String> list) {
		if(list != null && !list.isEmpty()) {
			return list.toString().replace("[", "").replace("]", "");
		}
		return null;
	}
	
	public static String getServerIpAddress() {
		String address = "";
		
		try {
			address = InetAddress.getLocalHost().getHostAddress();
		} catch(UnknownHostException e) {			
		}
		
		return address;
	}
	
	public static String maskCreditCardNumber(String ccNumber) {
		StringBuffer mask = new StringBuffer();
		
		ccNumber = trimAndSetNullIfBlank(ccNumber);
		
		if(ccNumber != null && ccNumber.length() >=15 && ccNumber.length() <= 16) {
			mask.append(ccNumber.substring(0, 6));
			for(int i=0; i<ccNumber.length()-10; i++) {
				mask.append("*");
			}
			mask.append(ccNumber.substring(ccNumber.length()-4));
		}else {
			mask.append(ccNumber);
		}
		
		return mask.toString();
	}
	
	public static String[] generateRandomAlphaNumericStrings(int numberOfSamples, int strLength) {
		if(numberOfSamples < 0 || strLength < 0) {
			throw new IllegalArgumentException("numberOfSamples:"+numberOfSamples+" or strLength:"+strLength+" is negative!");
		}
		
		String[] array = new String[numberOfSamples];
		
		Set<String> sampleSet = new HashSet<String>();
		Random random = new Random(System.currentTimeMillis() * 121);
		
		while(sampleSet.size() < numberOfSamples) {
			StringBuffer buffer = new StringBuffer();
			
			String alphaNumericCurrentTime = Long.toString(System.currentTimeMillis(), 32).toUpperCase(Locale.ENGLISH);
			if(alphaNumericCurrentTime.length() < strLength) {
				buffer.append(alphaNumericCurrentTime);
			}
			
			while(buffer.length() < strLength) {
				char ch = Character.forDigit(random.nextInt() % Character.MAX_RADIX, Character.MAX_RADIX);
				if(Character.isLetterOrDigit(ch)) {
					buffer.append(ch);
				}
			}
			if(buffer.toString().trim().length() != 0) {
				sampleSet.add(buffer.toString().toUpperCase());
			}
		}
		
		sampleSet.toArray(array);
		
		return array;
	}
	
	public static String[] slice(String str, int maxLength) {
		Pattern p = Pattern.compile(".{1," + maxLength + "}");
		Matcher m = p.matcher(str);
		List<String> result = new ArrayList<String>();
		
		while (m.find()) {
			result.add(m.group());
		}
	
		return result.toArray(new String[result.size()]);
	}
	
	public static String getNameOrSurnameAsFilteredText(String nameOrSurname) {
		StringBuffer buffer = new StringBuffer();
		
		nameOrSurname = nameOrSurname.replaceAll("[^a-zA-Z&&[^ ]&&[^\u011F\u011E\u00FC\u00DC\u015F\u015E\u00F6\u00D6\u00E7\u00C7\u0131\u0130]]", "");
		
		String[] strings = nameOrSurname.split(" ");
		for(String string : strings) {
			if(! StringUtil.isNullOrZeroLength(string)) {
				buffer.append(Character.toUpperCase(string.charAt(0)));
				if(string.length() > 1) {
					buffer.append(string.substring(1).toLowerCase());
				}else {
					buffer.append(".");
				}
				buffer.append(" ");
			}
		}
		
		return buffer.toString().trim();
	}
	
	public static String trimCapitalizeFirstLettersAndSetNullIfBlank(String str, Locale locale) {
		str = trimAndSetNullIfBlank(str);
		if(str != null && str.length() > 0) {
			StringBuffer buffer = new StringBuffer();
			
			String[] split = str.split(" ");
			for(String string : split) {
				buffer.append(string.substring(0,1).toUpperCase(locale) + string.substring(1).toLowerCase());
				buffer.append(" ");
			}
			
			str = buffer.toString().trim();
		}
		return str;
	}
	
	public static String trimCapitalizeFirstLettersAndSetNullIfBlank(String str) {
		return trimCapitalizeFirstLettersAndSetNullIfBlank(str, new Locale("tr"));
	}
}