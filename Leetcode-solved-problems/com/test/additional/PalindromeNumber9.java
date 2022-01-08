package com.test.additional;

public class PalindromeNumber9 {

	public static void main(String[] args) {
		PalindromeNumber9 sol = new PalindromeNumber9();
		System.out.println(sol.isPalindrome(121));
	}

	public boolean isPalindrome(int a) {

		int ans = 0;
		int x = a;
		while (x > 0) {
			int rem = x % 10;
			ans = (ans * 10) + rem;
			x = x / 10;
		}

		return a == ans;
	}

}
