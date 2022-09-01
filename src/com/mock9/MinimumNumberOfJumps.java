/*
 * 30th AUGUST 2022

Q1.

PROBLEM STATEMENT:

Minimum number of jumps to reach end

Difficulty Level: Medium

Given an array of integers where each element represents the max number of steps that can be made forward from that element. Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, they cannot move through that element. If the end isn’t reachable, return -1.

Examples:

Input: 

11

1 3 5 8 9 2 6 7 6 8 9

Output: 

3*/

package com.mock9;

import java.util.Scanner;

public class MinimumNumberOfJumps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int start = arr[0];
		int step = 0;
		int jump = 0;
		int i = 0;
		while ((n - 1) != i) {
			if (start == 0) {
				System.out.println("-1");
				break;
			}
			while (start != jump && i != n - 1) {

				jump++;
				i++;
			}

			start = arr[i];
			jump = 0;
			step++;
			if (i == n - 1) {
				System.out.println(step);
				break;
			}
		}

	}

}
