package com.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DecryptMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] str = new String[2];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}

		for (int i = 0; i < str.length; i++) {
			ArrayList<Integer> al = new ArrayList<>();
			String s = str[i];
			ArrayList<Character> aTOz = new ArrayList<>();
			for (int j = 0; j < s.length() - 1; j++) {
				
				int count = 0;
				if(!aTOz.contains(s.charAt(j))) {
				for (int k = 0; k < s.length() - 1; k++) {
					
					if (s.charAt(j) == s.charAt(k)) {
						count++;
					}

				}
				aTOz.add(s.charAt(j));
				al.add(count);
				}
			}
			
			Collections.sort(al);
			System.out.print(al.get(al.size() - 1) - al.get(0) + " ");

			if (s.charAt(s.length() - 1) == 'w') {
				System.out.print("West" + " ");
			} else if (s.charAt(s.length() - 1) == 's') {
				System.out.print("South" + " ");
			} else if (s.charAt(s.length() - 1) == 'n') {
				System.out.print("North" + " ");
			} else if (s.charAt(s.length() - 1) == 'e') {
				System.out.print("East" + " ");
			}
		}
	}

}
