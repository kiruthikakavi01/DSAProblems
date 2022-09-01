package com.day12;

import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] dictionary = new String[N];
		for (int i = 0; i < N; i++) {
			dictionary[i] = sc.next();
		}
		int R = sc.nextInt();
		int C = sc.nextInt();
		ArrayList<ArrayList<Character>> adj = new ArrayList<>();
		for (int i = 0; i < R; i++) {
			ArrayList<Character> arr = new ArrayList<>();
			adj.add(arr);
			for (int j = 0; j < C; j++) {
				adj.get(i).add(sc.next().charAt(0));
			}
		}

		ArrayList<String> al = new ArrayList<>();
		for (int i = 0; i < dictionary.length; i++) {
			String temp = dictionary[i];
			int count = 0;

			for (int k = 0; k < temp.length(); k++) {
				for (int l = 0; l < adj.size(); l++) {
					for (int m = 0; m < adj.get(l).size(); m++) {
						if (temp.charAt(k) == adj.get(l).get(m)) {

							count++;
							adj.get(l).remove(m);

						}
					}

				}
				if (count == temp.length()) {
					al.add(temp);

				}
			}

		}

		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}

	}

}
