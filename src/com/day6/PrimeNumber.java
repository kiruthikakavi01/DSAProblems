package com.day6;


import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean[] primeNum = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			primeNum[i] = true;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			for (int j = i + 1; j <= n; j++) {
				if (j % i == 0) {
					primeNum[j] = false;
				}
			}
		}
		for (int i = 0; i <=n; i++) {
			if (primeNum[i] == true) {
				System.out.print(i + " ");
			}
		}
		
	}

}// 2 3 5 7 11 13 17 19
//2 3 5 7 11 13 17 19 23 29// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47.
