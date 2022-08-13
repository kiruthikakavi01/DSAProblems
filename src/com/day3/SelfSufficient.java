package com.day3;

import java.util.Scanner;

public class SelfSufficient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] EarnArr = new int[N];
		int[] CostArr = new int[N];

		for (int i = 0; i < N; i++) {
			EarnArr[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			CostArr[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {

			EarnArr[i] -= CostArr[i];

		}

		for (int i = 0; i < N; i++) {
			if (EarnArr[i] < 0) {
				EarnArr[i] = -EarnArr[i];
			} else {
				EarnArr[i] = -EarnArr[i];
			}
		}
		int need = 0;
		for (int i = 0; i < N; i++) {
			need += EarnArr[i];

		}

		System.out.println(need);

	}

}
//3
//[3 4 2]
//[5 3 4]
