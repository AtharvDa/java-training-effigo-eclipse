package com.effigo.java_training_effigo.encoding_decoding;

import java.util.Base64;

public class EncodingDecoding {
	public static void main(String [] args) {
		
		String userName = "Atharv Darunkar";
		String password = "12345678";
		
		String encodedPassword = encodePassword(password);
		
		System.out.println("Encoded Password: " + encodedPassword);
		
		boolean isAuthenticated = isAuthenticatedUser(userName, password, encodedPassword);
		
		if(isAuthenticated) {
			System.out.println("SuccessFully Login !");
		}else {
			System.out.println("Invalid Password!");
		}
	}

	private static boolean isAuthenticatedUser(String userName, String enteredPassword, String storedPassword) {
		
		String enteredEncodedPassword = encodePassword(enteredPassword);
		return enteredEncodedPassword.equals(storedPassword);
	}

	private static String encodePassword(String password) {
		
		byte[] passwordBytes = password.getBytes();
		byte[] encodedBytes = Base64.getEncoder().encode(passwordBytes);
		return new String(encodedBytes);


	}
}
