package com.assessment17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AndyProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<M;i++) {
			arr.add(sc.nextInt());
		}
		
		
		Collections.sort(arr);
		
		
		if(M>K) {
			for(int i=0;i<M;i++) {
				if(K>0) {
					arr.remove(0);
					K--;
				}
			}
		}
		ArrayList<Integer> days=new ArrayList<>();
		ArrayList<Integer> count=new ArrayList<>();
		
		for(int i=1;i<=N;i++) {
			
			if(!arr.contains(i)) {
				days.add(i);
				
			}else {
				int temp=days.size();
				count.add(temp);
				days.removeAll(days);
				
			}		
		}
		count.add(days.size());
		Collections.sort(count);
		
		System.out.println(count.get(count.size()-1));
		

	}

}
