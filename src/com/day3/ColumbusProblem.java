package com.day3;

import java.util.Scanner;

public class ColumbusProblem {
static int f[] = new int[1000];

public static int Fact(int n) {
if (f[n] == 1) {
return f[n];
}
return f[n] = n * Fact(n - 1);
}

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int m = sc.nextInt();
int x = sc.nextInt();
int y = sc.nextInt();
n -= 1;
m -= 1;
x -= 1;
y -= 1;
f[0] = f[0] = 1;
int p = (Fact(m + n) / Fact(m) * Fact(n));
int imp = ((Fact(x + y) / (Fact(x) * Fact(y))) * (Fact(m - x + n - y) / (Fact(m - x) * Fact(n - y))));
System.out.println(p - imp);

}

}
