package com.test.studyplan.algo1.day1;

public class SearchInsertPosition35 {

	public static void main(String[] args) {

		SearchInsertPosition35 sol = new SearchInsertPosition35();
		System.out.println(sol.searchInsert(new int[] { 1,3,5,6}, 2));

	}

	public int searchInsert(int[] nums, int target) {

		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid-1;
			} else {
				left = mid + 1;
			}
		}

		if (left == 0) {
			return nums[0] >= target ? 0 : 1;
		}

		if (nums[right] > target) {
			return right;
		} else {
			return right + 1;
		}

	}

}
