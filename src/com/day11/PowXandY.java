package com.day11;

import java.util.Scanner;

public class PowXandY {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println(pow(x, y));

	}

	public static int pow(int x, int y) {
		int res = 1;
		for (int i = y; i > 0; i /= 2) {
			if (i % 2 == 1)
				res *= x;
			x = x * x;
		}

		return res;
	}
}
