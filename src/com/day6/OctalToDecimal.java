package com.day6;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int octal = sc.nextInt();
		String octStr = String.valueOf(octal);
		int decimal = 0;
		int pow = 0;
		for (int i = octStr.length() - 1; i >= 0; i--) {
			int digit = Character.getNumericValue(octStr.charAt(i));
			decimal += digit * Math.pow(8, pow);
			pow++;
		}
		System.out.println(decimal);
	}

}
