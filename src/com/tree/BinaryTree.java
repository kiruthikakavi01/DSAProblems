package com.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

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

public class BinaryTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rootData=sc.nextInt();
		Node root=new Node(rootData);
		for(int i=0;i<n-1;i++) {
			int data=sc.nextInt();
			Node nodeToInsert=new Node(data);
			insertNode(nodeToInsert,root);
		}
		
//		Node root = new Node(1);
//		root.left = new Node(2);
//		root.right = new Node(3);
//		root.left.left = new Node(4);
//		root.left.right = new Node(5);
//		root.right.left = new Node(6);
//		root.right.right = new Node(7);

		System.out.println("InOrder traversal: ");
		inOrder(root);

		System.out.println("\n" + "PostOrder traversal: ");
		postOrder(root);

		System.out.println("\n" + "PreOrder traversal: ");
		preOrder(root);

		System.out.println("\n" + "level Order: ");
		levelOrder(root);
		System.out.println("\n" + "Depth Order: ");
		depth(root);
		System.out.println("Max value in BT: " + findMax(root));
		System.out.println("Min value in BT: " + findMin(root));

	}

	public static void inOrder(Node rootNode) {
		if (rootNode == null)
			return;
		inOrder(rootNode.left);
		System.out.print(rootNode.data + " ");
		inOrder(rootNode.right);
	}

	public static void postOrder(Node rootNode) {
		if (rootNode == null)
			return;

		postOrder(rootNode.left);
		postOrder(rootNode.right);
		System.out.print(rootNode.data + " ");
	}

	public static void preOrder(Node rootNode) {
		if (rootNode == null)
			return;
		System.out.print(rootNode.data + " ");
		preOrder(rootNode.left);
		preOrder(rootNode.right);

	}

	public static void levelOrder(Node root) {
		if (root == null)
			return;
		// Queue<Node> q=new LinkedList<>();
		ArrayDeque<Node> q = new ArrayDeque<>();
		q.addLast(root);// offer(root);
		while (!q.isEmpty()) {
			Node temp = q.removeFirst();// poll();
			System.out.println(temp.data + " ");
			if (temp.left != null)
				q.addLast(temp.left);
			if (temp.right != null)
				q.addLast(temp.right);
		}

	}
	
	public static void depth(Node root) {
		if (root == null)
			return;
				Stack<Node> q = new Stack<>();
		q.push(root);
		while (!q.isEmpty()) {
			Node temp = q.pop();
			System.out.println(temp.data + " ");
			
			if (temp.right != null)
				q.push(temp.right);
			if (temp.left != null)
				q.push(temp.left);
		}

	}


	public static int findMax(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;
		
		
		int result = root.data;
		
		int left = findMax(root.left);
		
		int right = findMax(root.right);
		
		if (left > result)
			result = left;
		if (right > result)
			result = right;
		
		return result;

	}
	
	public static int findMin(Node root) {
		if (root == null)
			return Integer.MAX_VALUE;
		
		
		int result = root.data;
		
		int left = findMin(root.left);
		
		int right = findMin(root.right);
		
		if (left < result)
			result = left;
		if (right < result)
			result = right;
		
		
		
		
		return result;

	}
	public static void insertNode(Node nodeToInsert,Node rootNode) {
		
		if(rootNode.left==null) {
			rootNode.left=nodeToInsert;
			System.out.println(nodeToInsert.data+" left "+rootNode.data);
		}else if(rootNode.right==null) {
			rootNode.right=nodeToInsert;
			System.out.println(nodeToInsert.data+" right "+rootNode.data);
		}else if(rootNode.left!=null) {
			insertNode(nodeToInsert,rootNode.left);
		}else {
			insertNode(nodeToInsert,rootNode.right);
		}
		
		
	}

}
