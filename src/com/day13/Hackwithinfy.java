package com.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hackwithinfy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> al=new ArrayList<>();
		int i=0;
		
		while(i<arr.length) {
			int a=arr[i];
			int b=0;
			int c=0;
			int j=i+1;
			while(j<arr.length) {
				if(a<arr[j]) {
					b=arr[j];
					int k=j+1;
					while(k<arr.length) {
						if(b<arr[k]) {
							c=arr[k];
							break;
						}else {
							k++;
						}
					}
					break;
				}
				else {
					j++;
				}
				
				
			}
			
			if(b!=0&&c!=0) {
				al.add(a+b+c);
			}
			i++;
			
		}
		Collections.sort(al);
		System.out.println(al.get(al.size()-1));
	}

}
