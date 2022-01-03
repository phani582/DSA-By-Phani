package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {

	public static void main(String[] args) {
		FourSum18 sol = new FourSum18();
		int[] input = new int[] { 2, 2, 2, 2, 2 };
		int target = 8;
		System.out.println(sol.fourSum(input, target));

	}

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if (nums.length < 4)
			return ans;
		int size = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < size - 3; i++) {

			// check for duplicate elements
			if (i != 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			for (int j = i + 1; j <= size - 2; j++) {

				// check for duplicate elements
				if (j != i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}

				int left = j + 1, right = nums.length - 1;
				while (left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (sum == target) {
						List<Integer> tmp = new ArrayList<Integer>();
						tmp.add(nums[i]);
						tmp.add(nums[j]);
						tmp.add(nums[left]);
						tmp.add(nums[right]);
						ans.add(tmp);
						left++;
						right--;

						// check for duplicates
						while (left < right && nums[left] == nums[left - 1]) {
							left++;
						}

						while (left < right && nums[left] == nums[left - 1]) {
							left++;
						}
					} else if (sum > target) {
						right--;
					} else {
						left++;
					}
				}
			}

		}
		return ans;
	}
}
