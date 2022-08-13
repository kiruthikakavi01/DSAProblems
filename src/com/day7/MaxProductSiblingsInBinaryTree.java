package com.day7;

import java.util.ArrayList;

class Node1 {

	int data;
	Node1 left;
	Node1 right;

	public Node1(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class MaxProductSiblingsInBinaryTree {
	int val;
	int res;

	MaxProductSiblingsInBinaryTree(int val, int res2) {
		this.val = val;
		this.res = res2;
	}

	static ArrayList<MaxProductSiblingsInBinaryTree> list = new ArrayList<>();

	public static void main(String[] args) {
		Node1 root = new Node1(1);
		root.left = new Node1(3);
		root.right = new Node1(5);
		root.left.left = new Node1(6);
		root.left.right = new Node1(9);
		root.right.left = new Node1(4);
		root.right.right = new Node1(8);

		maxproduct(root);
		System.out.println(result());
	}

	private static void maxproduct(Node1 root) {
		if (root.left != null) {
			maxproduct(root.left);
		}
		if (root.right != null) {
			maxproduct(root.right);
		}
		if (root.left != null && root.right != null) {
			int res = root.left.data * root.right.data;
			MaxProductSiblingsInBinaryTree nodes = new MaxProductSiblingsInBinaryTree(root.data, res);
			list.add(nodes);
		}

	}

	private static int result() {
		int max = 0;
		int res = 0;
		for (MaxProductSiblingsInBinaryTree node : list) {
			if (res < node.res) {
				res = node.res;
				max = node.val;
			}
		}

		return max;
	}

}
