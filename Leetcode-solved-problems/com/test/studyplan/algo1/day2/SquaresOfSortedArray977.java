package com.test.studyplan.algo1.day2;

import java.util.Arrays;

public class SquaresOfSortedArray977 {

	public static void main(String[] args) {

		SquaresOfSortedArray977 sol = new SquaresOfSortedArray977();
		System.out.println(Arrays.toString(sol.sortedSquares(new int[] { -4, -1, 0, 3, 10 })));
		System.out.println(Arrays.toString(sol.sortedSquares(new int[] { -7, -3, 2, 3, 11 })));

	}

	public int[] sortedSquares(int[] nums) {
		int size = nums.length;
		int[] res = new int[size];

		int i = 0, j = size - 1, k = size - 1;

		while (i <= j) {
			if (nums[i] * nums[i] < nums[j] * nums[j]) {
				res[k] = nums[j] * nums[j];
				j--;
			} else {
				res[k] = nums[i] * nums[i];
				i++;
			}

			k--;
		}

		return res;
	}

}
