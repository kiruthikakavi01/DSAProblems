package com.Day2;

import java.util.Scanner;

public class GoldMineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println(max(mat, n, m));

	}

	public static int collect(int[][] mat, int p, int q, int n, int m) {

		if ((p < 0) || (p == n) || (q == m)) {
			return 0;
		}
		int rightUp = collect(mat, p - 1, q + 1, n, m);
		int right = collect(mat, p, q + 1, n, m);
		int rightDown = collect(mat, p + 1, q + 1, n, m);

		int max = mat[p][q] + Math.max(Math.max(rightUp, rightDown), right);

		return max;

	}

	public static int max(int[][] mat, int n, int m) {
		int goldMax = mat[0][0];
		int maxRi = 0;
		int maxCi = 0;
		for (int i = 0; i < n; i++) {
			int j = 0;
			if (mat[i][j] > goldMax) {
				maxRi = i;
				maxCi = j;
			}
		}

		for (int i = 0; i < n; i++) {
			int goldCollect = collect(mat, i, 1, n, m);
			goldMax = Math.max(goldMax, goldCollect);
			
		}
       
		return mat[maxRi][maxCi] + goldMax;
	}

}
//1 3 3
//2 1 4
//0 6 4

//1, 3, 1, 5},
//{2, 2, 4, 1},
//{5, 0, 2, 3},
//{0, 6, 1, 2
//

//      {{10, 33, 13, 15},
//		 {22, 21, 04, 1},
//		 {5, 0, 2, 3},
//		 {0, 6, 14, 2}}