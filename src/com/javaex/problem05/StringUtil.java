package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] strArray) {
    	
    	String sum = "";
    	
    	for(int i=0; i<strArray.length; i++) {
    		sum = sum + strArray[i];
    	}
    	return sum;
    }

}
