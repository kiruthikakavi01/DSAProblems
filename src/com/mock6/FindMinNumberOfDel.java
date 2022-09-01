package com.mock6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMinNumberOfDel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		int min = Collections.min(arr);
		int max = Collections.max(arr);

		ArrayList<Integer> maxLength = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {
				ArrayList<Integer> res = new ArrayList<>();

				int length = 0;
				for (int k = i; k <= j; k++) {

					res.add(arr.get(k));
					length++;
				}

				if (!res.contains(min) && !res.contains(max)) {

					if (maxLength.isEmpty()) {
						maxLength.add(length);
					} else {
						if (maxLength.get(0) < length) {
							maxLength.remove(0);
							maxLength.add(length);
						}
					}
				}
			}
		}
		if (arr.size() == 2 || arr.size() == 1)
			System.out.println(arr.size());
		else
			System.out.println(arr.size() - maxLength.get(0));

	}

}
