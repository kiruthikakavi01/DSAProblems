package com.mock9;

import java.util.Arrays;
import java.util.Scanner;

public class GCDOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {arr[i]=sc.nextInt();}
		Arrays.sort(arr);
		int min=arr[0];
		
		for(int i=min;i>=1;i--
				) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[j]%i==0) {
					count++;
				}
			}
			
			if(count==n) {
				System.out.println(i);
				break;
			}
		}
	}

}
