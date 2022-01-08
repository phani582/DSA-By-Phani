package com.test.studyplan.algo1.day3;

import java.util.Arrays;

public class TwoSum167 {

	public static void main(String[] args) {
		TwoSum167 sol = new TwoSum167();
		System.out.println(Arrays.toString(sol.twoSum(new int[] { 2, 7, 11, 15 }, 9)));
	}

	public int[] twoSum(int[] numbers, int target) {
		int left = 0, right = numbers.length - 1;

		while (left < right) {
			int sum = numbers[left] + numbers[right];

			if (sum == target) {
				return new int[] { left+1, right+1 };
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}
		}
		return new int[] { -1, -1 };
	}

}
