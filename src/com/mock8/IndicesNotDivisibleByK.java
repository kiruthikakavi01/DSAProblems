/*29th AUGUST 2022



Find the array element from indices not divisible by K having largest composite product of digits

Difficulty Level: Easy

Given an array arr[] and an integer K, the task is to find the array element from indices not divisible by K whose product of digits is a composite number.

The first line contains array size N.

The second line contains array elements.

The third line contains the value of K.

Sample Input:

10 

233 144 89 71 13 21 11 34 55 23 

3

Sample Output: 

89*/


package com.mock8;

import java.util.Scanner;

public class IndicesNotDivisibleByK {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int k=sc.nextInt();
		
		int maxValue=0;
		int maxProductValue=0;
		for(int i=0;i<n;i++) {
			if(i%k!=0) {
				
				String temp=String.valueOf(arr[i]);
				char ch[]=temp.toCharArray();
				
				int m=1;
				for(int j=0;j<ch.length;j++) {
					m*=Character.getNumericValue(ch[j]);
				
				}
				
					if(maxProductValue<m) {
						maxProductValue=m;
						
						maxValue=arr[i];
					}		
			}
		}
		
		
		System.out.println(maxValue);
		
		
	}

}
