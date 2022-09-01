package com.mock;

import java.util.ArrayList;
import java.util.Scanner;

public class Government {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfMLA=sc.nextInt();
		int numberOfPairs=sc.nextInt();
		
		int arr[][]=new int[numberOfPairs][2];
		for(int i=0;i<numberOfPairs;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		
//		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
//		ArrayList<Integer> arr1=new ArrayList<>();
//		arr1.add(1);
//		arr1.add(2);
//		arr1.add(3);
//		arr1.add(4);
//		
//		al.add(arr1);
//		System.out.println(al);
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		ArrayList<Integer> arr1=new ArrayList<>();
		int count=0;
		int i=0;
		
		while(count!=(numberOfPairs*2)) {
		while(i<numberOfPairs) {
			for(int j=0;j<2;j++) {
				
				if(arr1.isEmpty()) {
				     arr1.add(arr[i][j]);
				count++;
				}
				else {
					if(arr1.contains(arr[i][j-1])&&!arr1.contains(arr[i][j])) {
						arr1.add(arr[i][j]);
						count++;
					}
				}
			}
			i++;
			
		}
		
		al.add(arr1);
		System.out.println(arr1);
		arr1.removeAll(arr1);
		}
		
		System.out.println(al);
		
		
		

	}

}
