package com.day13;

import java.util.Scanner;

public class TripletProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=3;
		int triplets[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				triplets[i][j]=sc.nextInt();
			}
		}
		int target[]=new int[3];
		for(int i=0;i<3;i++) {
			target[i]=sc.nextInt();
		}
		
		int count=0;
		int col=0;
		while(col<target.length) {
			int row=0;
			while(row<r) {
				if(target[col]==triplets[row][col]) {
					count++;
					break;
				}
					row++;
				
			}
			col++;
			
		}
		if(count==target.length) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
