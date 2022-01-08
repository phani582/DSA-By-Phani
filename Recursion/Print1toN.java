package com.test;

public class Print1toN {

	public static void main(String[] args) {
		printBoth(5);
	}

	public static void printRev(int n) {
		if (n == 0)
			return;

		System.out.println(n);
		printRev(n - 1);
	}

	public static void print(int n) {
		if (n == 0)
			return;

		print(n - 1);
		System.out.println(n);
	}

	public static void printBoth(int n) {
		if (n == 0)
			return;

		System.out.println(n);
		printBoth(n - 1);
		System.out.println(n);
	}

}
