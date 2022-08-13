package com.day7;

import java.util.ArrayList;


public class TravelingSalesManProblem {

	public static void main(String[] args) {

		
		int V = 4;
		int[][] graph = { { 0, 10, 15, 20 }, 
						  { 10, 0, 35, 25 },
						  { 15, 35, 0, 30 },
						  { 20, 25, 30, 0 } };

		int s = 1;
		System.out.println(travellingSaleManProb(graph,s,V));
	}

	public static int travellingSaleManProb(int[][] graph, int s, int V) {

		ArrayList<Integer> vertex = new ArrayList<Integer>();

		for (int i = 0; i < V; i++)
			if (i != s)
				vertex.add(i);

		int minPath = Integer.MAX_VALUE;
		do {
			int pathWeight = 0;
			int k = s;

			for (int i = 0; i < vertex.size(); i++) {
				pathWeight += graph[k][vertex.get(i)];
				k = vertex.get(i);
			}
			pathWeight += graph[k][s];
			minPath = Math.min(minPath, pathWeight);

		} while (findNext(vertex));

		return minPath;
	}

	public static boolean findNext(ArrayList<Integer> data) {
		if (data.size() <= 1)
			return false;

		int last = data.size() - 2;
		while (last >= 0) {
			if (data.get(last) < data.get(last + 1)) {
				break;
			}
			last--;
		}
		if (last < 0)
			return false;

		int nextGreater = data.size() - 1;
		for (int i = data.size() - 1; i > last; i--) {
			if (data.get(i) > data.get(last)) {
				nextGreater = i;
				break;
			}
		}
		data = swap(data, nextGreater, last);
		data = reverse(data, last + 1, data.size() - 1);
		return true;
	}

	public static ArrayList<Integer> reverse(ArrayList<Integer> data, int left, int right) {
		while (left < right) {
			int temp = data.get(left);
			data.set(left++, data.get(right));
			data.set(right--, temp);
		}
		return data;
	}
	public static ArrayList<Integer> swap(ArrayList<Integer> data, int left, int right) {
		int temp = data.get(left);
		data.set(left, data.get(right));
		data.set(right, temp);
		return data;
	}

	

}