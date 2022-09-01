/*29th AUGUST 2022

K-th Largest Sum Contiguous Subarray

Difficulty Level: Medium

Given an array of integers. Write a program to find the K-th largest sum of contiguous subarray within the array of numbers which has negative and positive numbers.

The first line contains array size N.

The second line contains array elements.

The third line contains the value of K.

 Sample Input:

3 

20 -5 -1

3

Sample Output: 

14*/



package com.mock8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KthlargestsumInSubarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
		int k=sc.nextInt();
			Arrays.sort(arr);
			ArrayList<Integer> al=new ArrayList<>();
			
			
			for(int i=0;i<n;i++) {
				for(int j=i;j<n;j++) {
					int sum=0;
					for(int l=i;l<=j;l++) {
						sum+=arr[l];
					}
					
					al.add(sum);
				}
			}
			Collections.sort(al);
			System.out.println(al.get(al.size()-k));
	}
	

}
