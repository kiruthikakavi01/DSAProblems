package com.day6;

import java.util.*;

public class MonsterGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int exp = sc.nextInt();
		int[] monster = new int[n];
		for (int i = 0; i < n; i++) {
			monster[i] = sc.nextInt();
		}
		int[] bonus = new int[n];
		for (int i = 0; i < n; i++) {
			bonus[i] = sc.nextInt();
		}

		boolean[] b = new boolean[n];
		for (int i = 0; i < n; i++) {
			b[i] = true;
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (exp >= monster[j] && b[j] == true) {
					exp += bonus[j];
					b[j] = false;
					count++;
					break;
				} else if (exp < monster[j] && b[j] == true) {
					continue;
				}
			}
		}

		System.out.println(count);
	}
}
