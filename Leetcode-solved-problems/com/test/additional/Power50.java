package com.test.additional;

public class Power50 {

	public static void main(String[] args) {
		Power50 sol = new Power50();
		//System.out.println(sol.myPow(2, 4));
		//System.out.println(2.000 % 2);
		System.out.println(sol.myPow(2.00000, -2));
	}

	public int myPow1(int base, int power) {
		int res = 1;

		while (power > 0) {
			if (power % 2 == 0) {
				base = base * base;
				power = power / 2;
			} else {
				res = res * base;
				power--;
			}
		}

		return res;
	}

	public double myPow(double x, int n) {

		double res = 1.00000;

		long tmp = n;
		
		if(tmp < 0) tmp *=-1;

		while (tmp > 0) {

			if (tmp % 2 == 0) {
				x *= x;
				tmp = tmp / 2;
			} else {
				res *= x;
				tmp--;
			}
		}
		return n >= 0 ? res : 1 / res;
	}

}
