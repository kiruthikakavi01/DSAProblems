package com.day1;

import java.util.Arrays;

import java.util.Scanner;

public class IndicesOfSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int val = sc.nextInt();

//		int[] arr= {1, 2, 5, 2, 3};
//		int val=6;
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == val) {
				count++;
			}

		}

		if (count > 0) {
			for (int i = 0; i < arr[val]; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			System.out.println("[]");
		}

	}

}
