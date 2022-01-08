package com.test.studyplan.algo1.day1;

public class BinarySearch704 {

	public static void main(String[] args) {
		BinarySearch704 sol = new BinarySearch704();
		int[] input = new int[] { -1, 0, 3, 5, 9, 12 };
		System.out.println(sol.binarySearch(input, 0, input.length - 1, 9));
	}

	public int search(int[] nums, int target) {
		return binarySearch(nums, 0, nums.length - 1, target);
	}

	public int binarySearch(int[] nums, int start, int end, int target) {
		if (start > end)
			return -1;

		int mid = (start+ end) / 2;

		if (nums[mid] == target)
			return mid;

		else if (nums[mid] > target)
			return binarySearch(nums, start, mid - 1, target);

		return binarySearch(nums, mid + 1, end, target);
	}

}
