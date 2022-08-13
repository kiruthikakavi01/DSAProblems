package com.Day2;

import java.util.Scanner;

public class ComTwoStringsAfterOneRemoval{

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int length = s1.length();
		
		System.out.println(removal(s1, s2, length));

	}

	public static int removal(String S1, String S2, int length) {
		int count = 2;
		int s= 0;
		int e= 0;

		for (int i = 0; i < length; ++i) {
			if (S1.charAt(i) != S2.charAt(i)) {
				s = i;
				break;
			}
		}
		for (int i = length - 1; i >= 0; i--) {
			if (S1.charAt(i) != S2.charAt(i)) {
				e = i;
				break;
			}
		}
		if (e < s) {
			count = 26 * (length + 1);
			return count;
		} else if (s== e) {
			return count;
		} else {
			for (int i = s + 1; i <= e; i++) {
				if (S1.charAt(i) != S2.charAt(i - 1)) {
					count--;
					break;
				}
			}
			for (int i = s + 1; i <= e; i++) {
				if (S1.charAt(i - 1) != S2.charAt(i)) {
					count--;
					break;
				}
			}
			return count;
		}
	}

}
