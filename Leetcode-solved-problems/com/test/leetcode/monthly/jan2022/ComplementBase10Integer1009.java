package com.test.leetcode.monthly.jan2022;

public class ComplementBase10Integer1009 {

	public static void main(String[] args) {

		ComplementBase10Integer1009 sol = new ComplementBase10Integer1009();
		System.out.println(sol.bitwiseComplement(7));

	}

	public int bitwiseComplement(int n) {

		int ans = 0;
		int multiply = 1;

		while (n > 0) {
			int bit = n % 2 == 0 ? 1 : 0;
			n = n / 2;

			ans = ans + bit * multiply;
			multiply = multiply * 2;
		}
		return ans;
	}

}
