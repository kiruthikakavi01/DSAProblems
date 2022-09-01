
/*
 * 30th AUGUST 2022
 * Find the parent node of maximum product Siblings in given Binary Tree

Given a binary tree, the task is to find the node whose children have maximum Sibling product in the given Binary Tree. If there are multiple such nodes, return the node which has the maximum value.

Examples:

Input: 

4 5 3 6 -1 -1 12 -1 -1 1 -1 -1 2 -1 -1*/

package com.mock9;

import java.util.ArrayList;
import java.util.Scanner;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class MaximumProductSiblingsInBinaryTree {
	static ArrayList<Integer> minusNode = new ArrayList<>();
	static ArrayList<Integer> maxProductSiblings = new ArrayList<>();
	static int maxProductParentNode = 0;
	static ArrayList<Node> leftRootNode = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rootData = sc.nextInt();
		Node rootNode = new Node(rootData);
		for (int i = 0; i < n - 1; i++) {
			int data = sc.nextInt();
			Node nodeToInsert = new Node(data);
			insertNode(nodeToInsert, rootNode);
		}
		maxProduct(rootNode);
		System.out.println(maxProductParentNode);
	}

	public static void insertNode(Node nodeToInsert, Node rootNode) {
		if (nodeToInsert.data != -1 && minusNode.isEmpty()) {
			if (rootNode.left == null) {
				rootNode.left = nodeToInsert;
				leftRootNode.add(rootNode);
			} else {
				insertNode(nodeToInsert, rootNode.left);
			}
		} else {
			if (nodeToInsert.data == -1)
				minusNode.add(nodeToInsert.data);
			else {
				insertRight(nodeToInsert, leftRootNode);
			}
		}
	}

	public static void insertRight(Node nodeToInsert, ArrayList<Node> rootNode) {
		Node s = rootNode.get(leftRootNode.size() - 1);
		if (s.right == null) {
			s.right = nodeToInsert;
			leftRootNode.remove(rootNode.size() - 1);
		}
	}

	public static void maxProduct(Node rootNode) {
		if (rootNode == null)
			return;
		if (rootNode.left != null && rootNode.right != null) {

			if (maxProductSiblings.isEmpty())
				maxProductSiblings.add(rootNode.left.data * rootNode.right.data);
			else {
				int temp = rootNode.left.data * rootNode.right.data;
				if (maxProductSiblings.get(0) < temp) {
					maxProductSiblings.remove(0);
					maxProductSiblings.add(temp);
					maxProductParentNode = rootNode.data;
				}
			}
		}
		maxProduct(rootNode.left);
		maxProduct(rootNode.right);

	}

}
