package com.test;

import java.util.Arrays;

public class ValidTriangle611 {

	public static void main(String[] args) {
		ValidTriangle611 sol = new ValidTriangle611();
		int[] input = new int[] { 48, 66, 61, 46, 94, 75 };
		System.out.println(sol.triangleNumber1(input));
	}

	public int triangleNumber(int[] nums) {
		int ans = 0;

		if (nums.length < 3)
			return 0;

		Arrays.sort(nums);

		for (int i = 2; i < nums.length; i++) {
			int left = 0, right = i - 1;

			// two pointer approach
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

	// this approach should not work - because every element you are fixing is always smaller than the next elements
	// because array is sorted.  so array should be sorted and fix the highest element first and find elements before to it.
	public int triangleNumber1(int[] nums) {
		int ans = 0;

		if (nums.length < 3)
			return ans;

		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length - 2; i++) {

			int left = i + 1, right = nums.length - 1;

			// two pointer approach
			while (left < right) {
				int sum = nums[left] + nums[right];
				if (sum > nums[i]) {
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
