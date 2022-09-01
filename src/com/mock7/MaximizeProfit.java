/*26th AUGUST 2022

Given an array arr[] of size N, the task is to find the price of the item such that the profit earned by selling the item among N buyers is maximum possible consisting of budgets of N buyers. An item can be sold to any buyer if the budget of the buyer is greater than or equal to the price of the item. 

Examples: 

Input: arr[] = {34, 78, 90, 15, 67} 

Output: 67 

Explanation: For the item with price 67, the number of buyers who can buy the item is 3. Therefore, the profit earned is 67 * 3 = 201, which is maximum. 

Input: arr[] = {300, 50, 32, 43, 42} 

Output: 300 */


package com.mock7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximizeProfit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[] =new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		
		int maxProfit=0;
		int price=0;
		for(int i=0;i<N;i++) {
			
				int temp=arr[i]*(N-i);
				if(maxProfit<temp) {
					maxProfit=temp;
					price=arr[i];
				}
				
			
		}
		

		System.out.println(price);
	}

}
