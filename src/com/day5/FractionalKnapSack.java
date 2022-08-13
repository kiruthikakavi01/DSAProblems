package com.day5;

import java.util.Arrays;

import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapSack {

	private static double maxValue(int[] weight, int[] values, int W)

	{

		ItemValue[] iv = new ItemValue[weight.length];

		for (int i = 0; i < weight.length; i++) {

			iv[i] = new ItemValue(weight[i], values[i], i);

		}
		Arrays.sort(iv, new Comparator<ItemValue>() {

			public int compare(ItemValue o1, ItemValue o2) {

				return o2.cost.compareTo(o1.cost);

			}

		});

		double totalValue = 0;

		for (ItemValue i : iv) {

			int curWt = (int) i.wt;

			int curVal = (int) i.val;

			if (W - curWt >= 0) {
				W = W - curWt;

				totalValue += curVal;

			}

			else {

				double fraction = ((double) W / (double) curWt);

				totalValue += (curVal * fraction);

				W = (int) (W - (curWt * fraction));

				break;

			}

		}

		return totalValue;

	}

	static class ItemValue {

		Double cost;

		double wt, val, ind;

		ItemValue(int weight, int value, int ind)

		{

			this.wt = weight;

			this.val = value;

			this.ind = ind;

			cost = (double) (val / weight);

		}
	}

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int N = sc.nextInt();
		System.out.println("Enter the Capacity(W): ");
		int W = sc.nextInt();

		int[] values = new int[N];
		int[] weight = new int[N];
		System.out.println("Enter the " + N + " value: ");
		for (int i = 0; i < N; i++) {
			values[i] = sc.nextInt();
		}
		System.out.println("Enter the " + N + " weight: ");

		for (int i = 0; i < N; i++) {
			weight[i] = sc.nextInt();
		}

		double maxValue = maxValue(weight, values, W);

		System.out.println(maxValue);

	}

}
