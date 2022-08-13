package com.day1;

import java.util.Scanner;

public class AddTwoBinary {

	public static void main(String[] args) {
		

		String a = "11";
		String b = "1";
		
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {

		//int length = a.length() >= b.length() ? a.length() : b.length();

		String binary = "";
		char carry = '0';

		int i = a.length() - 1,j=b.length()-1;
		while (i >= 0||j>=0) {
			if (a.charAt(i) == '0' && b.charAt(j) == '0') {

				if (carry == '1') 
					binary=addBinary("0", "1")+binary;
				 else 
					binary = '0' + binary;
		
			} else if ((a.charAt(i) == '0' && b.charAt(j) == '1') || (a.charAt(i) == '1' && b.charAt(j) == '0')) {

				if (carry == '1') 
					binary=addBinary("1", "1")+binary;
				 else 
					binary = '1' + binary;
				

			} else if (a.charAt(i) == '1' && b.charAt(j) == '1') {
				if (carry == '1') 
					binary=addBinary("0", "1")+binary;
				 else {
					binary = '0' + binary;
					carry = '1';
				}
			}

			i--;
			j--;
		}
        if(carry=='1')
		binary = carry + binary;
		
		return binary;

	}

}
