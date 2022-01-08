package com.test.studyplan.algo1.day3;

import java.util.Arrays;

public class MoveZeros283 {
	public static void main(String[] args) {
		MoveZeros283 sol = new MoveZeros283();
		int[] input = new int[] { 0, 1, 0, 3, 12 };
		sol.moveZeroes(input);
		System.out.println(Arrays.toString(input));
	}

	public void moveZeroes(int[] nums) {

		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int tmp = nums[index];
				nums[index] = nums[i];
				nums[i] = tmp;
				index++;
			}
		}
	}

}
