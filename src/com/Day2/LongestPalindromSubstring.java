package com.Day2;

public class LongestPalindromSubstring {

	static int longestPalindromeSubStr(String str) {
		int n = str.length();
		if (n < 2)
			return n;

		int maxLength = 1;
		int start = 0;
		int l, h;
		for (int i = 0; i < n; i++) {
			l = i - 1;
			h = i + 1;

			while (h < n && str.charAt(h) == str.charAt(i))
				h++;
			while (l >= 0 && str.charAt(l) == str.charAt(i))
				l--;
			while (l >= 0 && h < n && str.charAt(l) == str.charAt(h)) {
				l--;
				h++;
			}
			int length = h - l - 1;
			if (maxLength < length) {
				maxLength = length;
				start = l + 1;
			}
		}
		System.out.print("Longest palindrome substring is: ");
		System.out.println(str.substring(start, start + maxLength));
		return maxLength;

	}

	public static void main(String[] args) {
		String s1 = "Geeks";
		System.out.println("Length is: " + longestPalindromeSubStr(s1));
	}

}
