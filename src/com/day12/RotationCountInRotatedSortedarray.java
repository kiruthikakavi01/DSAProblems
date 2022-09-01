package com.day12;

import java.util.ArrayList;
import java.util.Scanner;

public class RotationCountInRotatedSortedarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<N;i++) {
	        al.add(sc.nextInt());
		}
		int count=0;
		while(al.get(0)>al.get(al.size()-1)) {
			int a=al.get(0);
			al.remove(0);
			al.add(a);
			count++;
		}
		System.out.println(count);
		
		
	}

}
