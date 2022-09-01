package com.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Rearrange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<String> res = new ArrayList<>();

		Arrays.sort(arr);

		for (int i = 0; i <= N / 2; i++) {
			String s = String.valueOf(arr[i]);
			res.add(s);
			res.add(" ");

		}
		res.remove(res.size() - 1);
		int j = (N / 2) + 1;
		for (int i = res.size() - 1; i >= 0; i--) {

			if (res.get(i) == " ") {
				String s = String.valueOf(arr[j]);
				res.remove(i);
				res.add(i, s);
				j++;

			}

		}

		Collections.reverse(res);
		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i) + " ");
		}
	}

}