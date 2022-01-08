package com.test.additional;

public class SingleElementInSortedArray540 {

	public static void main(String[] args) {
		SingleElementInSortedArray540 sol = new SingleElementInSortedArray540();
		System.out.println(sol.singleNonDuplicate(new int[] { 3, 3, 7, 7, 10, 11, 11 }));
	}

	public int singleNonDuplicate(int[] nums) {
		int ans = 0;

		for (int n : nums) {
			ans = ans ^ n;
		}

		return ans;
	}

}
