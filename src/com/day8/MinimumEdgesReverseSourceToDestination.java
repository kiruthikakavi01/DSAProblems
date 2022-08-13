package com.day8;


public class MinimumEdgesReverseSourceToDestination {

	public static void main(String[] args) {
		int V = 7;
		int edges[][] = { { 0, 1 }, { 2, 1 }, { 2, 3 }, { 6, 3 }, { 6, 4 }, { 4, 5 }, { 5, 1 } };

		int source = 0;
		int destination = 6;
		reverse(edges, source, destination);

	}

	private static void reverse(int[][] edges, int source, int destination) {
		int reverse = 0;
		int temp = edges[source][source + 1];
		
		for (int i = source + 1; i < edges.length; i++) {

			for (int j = 0; j < 2; j++) {

				if (temp != edges[i][j]) {
					continue;
				} else if (temp == edges[i][j]) {
					if (j == 0) {
						temp=edges[i][j+1];
						break;
					} else {
						int temp1 = edges[i][j];

						edges[i][j] = edges[i][j - 1];
						edges[i][j - 1] = temp1;
						temp = edges[i][j];
						reverse++;
					
					    break;
					}

				}
			}
			if (temp == destination) {

				break;
			}
		}
		System.out.println("reverse--->"+reverse+"\n");
		
		for (int i = 0; i < edges.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(edges[i][j]+" ");
			}
			System.out.println();
		}
	}

}
