
/*30th AUGUST 2022

Q2.

PROBLEM STATEMENT:

 

Ron has 'N' soccer players in his team whose weights are given in an array.

Rick has 'M' soccer players in his team whose weights are given in an array.

They want to choose one player from each squad to represent their college in Soccer Tournament. The Managing Committee has asked them to send two players such that absolute difference in their weights is minimum.

Help them find the minimum weight difference they can achieve if they choose one player from each team.

Note: Both the arrays are given in a non-decreasing manner.

 

Sample Input:

4 3

71 62 55 67

55 68 60

Sample Output:

0*/


package com.mock9;

import java.util.Arrays;
import java.util.Scanner;

public class SoccerPlayers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int team1[]=new int[N];
		int team2[]=new int[M];
		for(int i=0;i<N;i++) {
			team1[i]=sc.nextInt();
		}
		for(int i=0;i<M;i++) {
			team2[i]=sc.nextInt();
		}
		
		Arrays.sort(team1);
		Arrays.sort(team2);
		if(team1[0]<team2[0]) {
			System.out.println(team2[0]-team1[0]);
		}else {
			System.out.println(team1[0]-team2[0]);
		}
		
		

	}

}
