package com.day1;

import java.util.Arrays;
import java.util.Scanner;

public class GetMaximumInGeneratedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N + 1];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 1; i <=N/2;i++) {
            
			arr[2 * i] = arr[i];

			arr[2 * i + 1] = arr[i] + arr[i + 1];
			

		}
		System.out.println(Arrays.toString(arr));

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
//0,1,1,2,1,3,2,3