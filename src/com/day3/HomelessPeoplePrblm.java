package com.day3;

import java.util.Scanner;

public class HomelessPeoplePrblm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] people = new int[n];
		int[] house = new int[n];

		for (int i = 0; i < n; i++) {
			people[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			house[i] = sc.nextInt();
		}
		int count = 0;
		int needToAllot;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (people[i] < house[j]) {
					count++;
					house[j] = 0;
					break;
				}
			}
		}

		needToAllot = n - count;

		System.out.println(needToAllot);
	}

}
