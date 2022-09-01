package com.mock;

import java.util.ArrayList;
import java.util.Scanner;

public class BirthdayCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();

		ArrayList<String> newsWord = new ArrayList<>();
		ArrayList<String> birthCardWord = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			newsWord.add(sc.next());
		}
		for (int i = 0; i < b; i++) {
			birthCardWord.add(sc.next());
		}
		int count = 0;
		for (int i = 0; i < birthCardWord.size(); i++) {
			for (int j = 0; j < newsWord.size(); j++) {
				String str = birthCardWord.get(i);
				if (newsWord.contains(str)) {
					newsWord.remove(str);
					count++;
					break;
				}
			}
		}

		if (count == birthCardWord.size()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}