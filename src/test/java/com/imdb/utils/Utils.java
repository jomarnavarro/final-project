package com.imdb.utils;

public class Utils {
	
	public static String getUser(String credentials) {
		String[] creds = credentials.split(":");
		return creds[0];
	}
	
	public static String getPassword(String credentials) {
		String[] creds = credentials.split(":");
		return creds[1];
	}

}
