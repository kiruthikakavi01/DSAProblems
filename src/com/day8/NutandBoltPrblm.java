package com.day8;

import java.util.Scanner;

public class NutandBoltPrblm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nut[] = new String[n];
		String bolt[] = new String[n];
		for (int i = 0; i < n; i++) {
			nut[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			bolt[i] = sc.next();
		}
		matchPair(nut, bolt, n);
		printArray(nut);
		printArray(bolt);

	}

	public static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}

	public static void matchPair(String[] a, String[] b, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[j].equalsIgnoreCase(b[i])) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}

}