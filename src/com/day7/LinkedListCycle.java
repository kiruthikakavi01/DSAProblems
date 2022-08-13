package com.day7;

import java.util.ArrayList;
import java.util.Scanner;

class Node {
	static int data;
	static Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListCycle {
	static Node node;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Node> nodes = new ArrayList<>();
		Node head = null;
		for (int i = 0; i < n; i++) {
			head = insert(head, sc.nextInt());
			nodes.add(head);
		}
		int pos = sc.nextInt();
		try {
			nodes.add(head.next = (nodes.get(pos)));
			int count = search(nodes, head);
			if (count == 0) {
				System.out.println("false");
			} else {
				System.out.println("true");
			}
		} catch (Exception e) {
			System.out.println("false");
		}
	}

	private static int search(ArrayList<Node> nodes, Node head) {
		int count = 0;
		for (Node node : nodes) {
			if (node == head.next) {
				count++;
			}
		}
		return count;

	}

	private static Node insert(Node head, int data) {
		if (head == null) {
			head = new Node(data);
			return head;
		} else {
			head = insert(head.next, data);
		}
		return head;
	}
}