package com.day4;

import java.util.Scanner;

public class FindRotationCountInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int min = arr[0];
		int minIndex = 0;
		for (int i = 1; i < N; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		System.out.println(minIndex);

	}

}
//7, 9, 11, 12, 5
