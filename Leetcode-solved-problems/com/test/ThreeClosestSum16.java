package com.test;

import java.util.Arrays;

public class ThreeClosestSum16 {
	public static void main(String[] args) {
		ThreeClosestSum16 sol = new ThreeClosestSum16();
		int[] input = new int[] { 1, 1, -1, -1, 3 };
		int target = 3;
		System.out.println(sol.threeSumClosest(input, target));

	}

	public int threeSumClosest(int[] nums, int target) {
		if (nums.length < 3)
			return 0;

		int closestSum = nums[0] + nums[1] + nums[2];
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1, right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum >= target) {
					right--;
				} else {
					left++;
				}

				if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
					closestSum = sum;
				}
			}
		}

		return closestSum;
	}

}
