package com.day4;

public class LongestPalindromeSubsequence {

	public static void main(String[] args) {
		String str = "bbabcbcab";
		int n = str.length();
		System.out.println(lps(str.toCharArray(), 0, n - 1));
	}

	public static int lps(char str[], int i, int j) {
		if (i == j) {
			return 1;
		}
		if (str[i] == str[j] && i + 1 == j) {
			return 2;
		}
		if (str[i] == str[j]) {
			return lps(str, i + 1, j - 1) + 2;
		}
		return max(lps(str, i, j - 1), lps(str, i + 1, j));
	}

	
	public static int max(int x, int y) {
		return (x > y) ? x : y;
	}

}
