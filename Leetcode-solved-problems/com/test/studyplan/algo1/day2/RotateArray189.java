package com.test.studyplan.algo1.day2;

import java.util.Arrays;

public class RotateArray189 {

	public static void main(String[] args) {

		RotateArray189 sol = new RotateArray189();
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		sol.rotate(input, 3);
		System.out.println(Arrays.toString(input));

		int[] input1 = new int[] { -1, -100, 3, 99 };
		sol.rotate(input1, 2);
		System.out.println(Arrays.toString(input1));

		int[] input2 = new int[] { 1, 2 };
		sol.rotate(input2, 2);
		System.out.println(Arrays.toString(input2));

		int[] input4 = new int[] { -1, -100, 3, 99 };
		sol.rotate(input4, 3);
		System.out.println(Arrays.toString(input4));

		int[] input5 = new int[] { 2147483647, -2147483648, 33, 219, 0 };
		sol.rotate(input5, 4);
		System.out.println(Arrays.toString(input5));
	}
	
	public void rotateWithSpace(int[] nums, int k) {
		int n = nums.length;
		int[] tmp = new int[n];
		
		for(int i=0;i<n;i++) {
			tmp[(i+k)%n] = nums[i];
		}
		
		for(int i=0;i<n;i++) {
			nums[i] = tmp[i];
		}
	}

	public void rotate(int[] nums, int k) {

		if (nums.length <= 1) {
			return;
		}

		// we can also reduce number of rotations
		int length = nums.length;

		int iterations = k % length;

		if (iterations == 0)
			return;
		int l = 0, r = nums.length - 1;
		int len = iterations;
		while (len > 0 && l < r) {
			swap(nums, l, r);
			l++;
			r--;
			len--;
		}

		r = nums.length - 1;

		while (l <= r) {
			swap(nums, l, r);
			l++;
			r--;
		}

		l = 0;
		r = iterations - 1;

		while (l < r) {
			swap(nums, l, r);
			l++;
			r--;
		}

		l = 0;
		r = nums.length - 1;

		while (len > 0) {
			swap(nums, l, r);
			l++;
			r--;
			len--;
		}

	}

	private void swap(int[] nums, int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
}
