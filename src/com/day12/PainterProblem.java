package com.day12;

import java.util.Scanner;

public class PainterProblem {

	public static int sum(int arr[], int from, int to) {
		int total = 0;
		for (int i = from; i <= to; i++)
			total += arr[i];
		return total;
	}

	public static int partition(int arr[], int n, int k) {

		if (k == 1)
			return sum(arr, 0, n - 1);
		if (n == 1)
			return arr[0];

		int best = Integer.MAX_VALUE;

		for (int i = 1; i <= n; i++)
			best = Math.min(best, Math.max(partition(arr, i, k - 1), sum(arr, i, n - 1)));

		return best;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(partition(arr, n, k));
	}
}