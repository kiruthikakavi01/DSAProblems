package com.day8;

import java.util.ArrayList;
import java.util.Scanner;

class Node {

	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class FindMinimumNumInBST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < t; i++) {

			int n = sc.nextInt();
			int rootdata = sc.nextInt();
			Node rootNode = new Node(rootdata);
			for (int j = 0; j < n - 1; j++) {
				int data = sc.nextInt();
				Node nodeToInsert = new Node(data);
				insertNode(nodeToInsert, rootNode);
			}

			al.add(findMin(rootNode));

		}

		for (int k = 0; k < al.size(); k++)
			System.out.println(al.get(k));

	}

	public static void insertNode(Node nodeToInsert, Node rootNode) {
		if (nodeToInsert.data>0) {
			if (nodeToInsert.data < rootNode.data) {
				if (rootNode.left == null) {
					rootNode.left = nodeToInsert;
				} else {
					insertNode(nodeToInsert, rootNode.left);
				}
			} else {
				if (rootNode.right == null) {
					rootNode.right = nodeToInsert;
				} else {
					insertNode(nodeToInsert, rootNode.right);
				}

			}
		}
	}

	public static int findMin(Node rootNode) {

		int min = 0;
		if (rootNode.left == null) {
			min = rootNode.data;

		} else if (rootNode.left != null)
			min = findMin(rootNode.left);
		return min;

	}
}
