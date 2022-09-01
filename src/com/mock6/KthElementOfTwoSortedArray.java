package com.mock6;

import java.util.Arrays;
import java.util.Scanner;

public class KthElementOfTwoSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int arr1[] = new int[m];
		int arr2[] = new int[n];

		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		int k = sc.nextInt();

		int finalArray[] = new int[m + n];

		for (int i = 0; i < m; i++) {
			finalArray[i] = arr1[i];
		}

		for (int i = 0; i < n; i++) {

			finalArray[m + i] = arr2[i];
		}

		Arrays.sort(finalArray);

		System.out.println(finalArray[k - 1]);

	}
}