package com.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class SumofDependenciesGraph {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();

		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i = 0; i < v; i++) {
			ArrayList<Integer> arr = new ArrayList<>();
			adj.add(arr);
		}
		for (int i = 0; i < e; i++) {
			adj.get(sc.nextInt()).add(sc.nextInt());
		}

		int res = findSumofDependencies(adj, v);
		System.out.println(res);

	}

	public static int findSumofDependencies(ArrayList<ArrayList<Integer>> adj, int v) {

		int sum = 0;
		for (int i = 0; i < v; i++) {
			sum += adj.get(i).size();
		}
		return sum;

	}
}
