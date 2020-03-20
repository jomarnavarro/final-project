package com.imdb.utils;

public class Utils {
	
	public static String getUser(String credentials) {
		try {
			return getCredentials(credentials)[0];
		} catch(ArrayIndexOutOfBoundsException ex) {}
		finally {
			return "";
		}
	}
	
	public static String getPassword(String credentials) {
		try {
			return getCredentials(credentials)[1];
		} catch(ArrayIndexOutOfBoundsException ex) {}
		finally {
			return "";
		}
	}

	public static String[] getCredentials(String creds) {
		return creds.split(":");
	}
}
