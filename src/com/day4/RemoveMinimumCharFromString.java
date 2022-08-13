package com.day4;

import java.util.Scanner;

public class RemoveMinimumCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String Str = sc.next();


		int n = Str.length();

		int[] prefa = new int[n + 1];
		int[] prefb = new int[n + 1];
		int[] prefc = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			prefa[i] = prefa[i - 1] + (int) ((Str.charAt(i - 1) == 'a') ? 1 : 0);

			prefb[i] = prefb[i - 1] + (int) ((Str.charAt(i - 1) == 'b') ? 1 : 0);

			prefc[i] = prefc[i - 1] + (int) ((Str.charAt(i - 1) == 'c') ? 1 : 0);
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				max = Math.max(max, (prefa[i] + (prefb[j] - prefb[i]) + (prefc[n] - prefc[j])));
			}
		}

		System.out.println((n - max));

	}

}
