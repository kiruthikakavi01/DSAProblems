package com.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Gym {
     
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		int  E=sc.nextInt();
		int N=sc.nextInt();
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<N;i++) {
			al.add(sc.nextInt());
		}
		Collections.sort(al,Collections.reverseOrder());
		minExercises(al,N,E);

	}
	public static void minExercises(ArrayList<Integer> al,int N,int E) {
        int count=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++) {
				if(E>=al.get(i)) {
					E-=al.get(i);
					count++;
				}else {
					break;
				}
			}
			
		}
		if(E<=0) {
			System.out.println(count);
		}else {
			System.out.println("-1");
		}

	}

}
