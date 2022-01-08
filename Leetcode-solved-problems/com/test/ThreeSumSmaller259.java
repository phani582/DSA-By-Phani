package com.test;

import java.util.Arrays;

public class ThreeSumSmaller259 {

	public static void main(String[] args) {

		ThreeSumSmaller259 sol = new ThreeSumSmaller259();
		int[] input = new int[] { 0, 0 , 0 };
		int target = 0;
		System.out.println(sol.threeSumSmaller(input, target));
	}

	public int threeSumSmaller(int[] nums, int target) {
		int ans = 0;

		if (nums.length < 3)
			return 0;

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 1; i++) {
			int left = i + 1, right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum <=target && sum!=0) {
					ans = ans + 1;
					right--;
				} else {
					left++;
				}
			}
		}

		return ans;
	}

}
