package com.test;

import java.util.Arrays;

public class ValidTriangle611 {

	public static void main(String[] args) {
		ValidTriangle611 sol = new ValidTriangle611();
		int[] input = new int[] { 48, 66, 61, 46, 94, 75 };
		System.out.println(sol.triangleNumber(input));
	}

	public int triangleNumber(int[] nums) {
		int ans = 0;

		if (nums.length < 3)
			return 0;

		Arrays.sort(nums);

		for (int i = 2; i < nums.length; i++) {
			int left = 0, right = i - 1;

			while (left < right) {

				if (nums[left] + nums[right] > nums[i]) {
					ans = ans + (right - left);
					right--;
				} else {
					left++;
				}
			}

		}

		return ans;
	}
}
