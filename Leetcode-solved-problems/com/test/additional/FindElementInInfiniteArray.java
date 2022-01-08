package com.test.additional;

public class FindElementInInfiniteArray {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
		FindElementInInfiniteArray sol = new FindElementInInfiniteArray();
		System.out.println(sol.find(arr, 10));
	}

	public int find(int[] arr, int target) {

		int left = 0, right = 1;

		// this is how we will find out start end end index in sorted infinite array
		while (arr[right] < target) {
			left = right;
			right = right * 2;
		}

		return binarySearch(arr, left, right, target);
	}

	public int binarySearch(int[] arr, int start, int end, int target) {

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;

	}

}
