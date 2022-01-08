package com.test.additional;

public class ReverseAnInteger7 {

	public static void main(String[] args) {
		ReverseAnInteger7 sol = new ReverseAnInteger7();
		System.out.println(sol.reverse(-123));
	}

	public int reverse(int a) {
		int ans = 0;
		int x = a;
		if(x < 0) x = x *-1;
		while (x > 0) {
			int rem = x % 10;
			ans = (ans * 10) + rem;
			x = x / 10;
		}

		return  a < 0 ? -ans: ans;
	}

}
