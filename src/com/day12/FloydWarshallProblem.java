package com.day12;

import java.util.Scanner;

public class FloydWarshallProblem {

	
	static int INF=99999;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int q=sc.nextInt();
		
		

		int graph[][]=new int[n][n];
		
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			graph[a-1][b-1]=c;
			graph[b-1][a-1]=c;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)
					graph[i][j]=0;
				else if(graph[i][j]==0) {
					graph[i][j]=INF;
				}
			}
		}
		int[][] queries=new int[q][2];
		for(int i=0;i<q;i++) {
			for(int j=0;j<2;j++) {
				queries[i][j]=sc.nextInt();
			}
		}
		
		
		
		
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(graph[i][j]>graph[i][k]+graph[k][j]) 
						graph[i][j]=graph[i][k]+graph[k][j];
					
					
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(graph[i][j]==INF) {
					graph[i][j]=-1;
				}
			}
		}
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<2-1;j++) {
	
		           System.out.println(graph[queries[i][j]-1][queries[i][j+1]-1]);
			}
		}
		
		
		
		

	}

}
