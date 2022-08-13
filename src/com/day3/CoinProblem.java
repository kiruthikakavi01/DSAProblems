package com.day3;

import java.util.Scanner;

public class CoinProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] coin = new int[n];
		for (int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();
		}
		int v = sc.nextInt();

		System.out.println(coinCnt(coin, v));
	}

	private static int coinCnt(int[] coin, int v) {
		
		int res = 0;
		for (int i = 0; i < coin.length; i++) {
			int count = 1;
			int amt = coin[i];
			for (int j = i + 1; j < coin.length; j++) {
				if (amt < v) {
					amt += coin[j];
					count++;
					if (amt > v) {
						amt -= coin[j];
						count--;
					} else if (amt == v) {
						res = count;
						break;
					}

				} else if (amt == v) {
					res = count;
					break;
				}
			}
		}
		if (res == 0) {
			return -1;
		} else
			return res;

	}

}
