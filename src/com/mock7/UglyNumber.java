/*26th AUGUST 2022

The numbers whose only prime factors are 2, 3 or 5 is known as Ugly Number. 

The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included. 

Given a number n, the task is to find n’th Ugly number. 

Examples: 

Input: n = 7 

Output: 8 

Input: n = 8 

Output: 9 

Sample Input 

134 

Sample Output 

3888*/


package com.mock7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UglyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> uglyNum = new ArrayList<>();
		int i = 1;
		while (uglyNum.size() != n) {
			if (i == 1 || i == 2 || i == 3 || i == 5) {
				uglyNum.add(i);
			} else {
				int count = uglyNumOrNot(i);

				if (count == 0) {
					uglyNum.add(i);
				}
			}
			i++;

		}

		Collections.sort(uglyNum);
		System.out.println(uglyNum.get(uglyNum.size() - 1));

	}

	public static int uglyNumOrNot(int i) {

		int count = 0;
		while (i != 1) {
			if (i % 5 == 0) {
				i /= 5;
			} else if (i % 3 == 0) {
				i /= 3;
			} else if (i % 2 == 0) {
				i /= 2;
			} else {
				count = 1;
				break;
			}

		}

		return count;

	}

}
