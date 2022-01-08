package com.test.studyplan.algo1.day1;

public class FirstBadVersion278 {

	int ans = -1;

	public static void main(String[] args) {

	}

	public int firstBadVersion(int n) {

		int l = 1;
		int r = n;

		while (l < r) {
			int mid = r + (r - l) / 2;
			if (isBadVersion(mid)) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}

		return l;
	}

	public int firstBadVersionIterative(int n) {
		binarySearch(1, n);
		return ans;
	}

	public int binarySearch(int start, int end) {
		if (start > end)
			return -1;

		int mid = start + (end-start) / 2;

		if (isBadVersion(mid)) {
			ans = mid;
			return binarySearch(start, mid - 1);
		}

		return binarySearch(mid + 1, end);
	}

	boolean isBadVersion(int version) {
		return true;
	}

}
