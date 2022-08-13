package com.day1;

import java.util.Scanner;

public class BiggestMeatball {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();
		int A[] = new int[N];

		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();

		for (int j = 0; j < N; j++) {

			A[j] = (A[j] - D);

		}

		int m = 0, max = 0;

		for (int i = 0; i < N; i++) {
			if (A[i] >= m) {
				m = A[i];
				max = i;

			}
		}

		System.out.println(max + 1);

	}
}
