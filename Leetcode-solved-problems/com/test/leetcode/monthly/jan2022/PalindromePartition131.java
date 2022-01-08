package com.test.leetcode.monthly.jan2022;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition131 {

	public static void main(String[] args) {
		PalindromePartition131 sol = new PalindromePartition131();
		System.out.println(sol.partition("aab"));
	}

	public List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<List<String>>();

		helper(res, new ArrayList<String>(), s);
		return res;
	}

	public void helper(List<List<String>> res, ArrayList<String> currentRes, String s) {
		if (s== null || s.length() == 0) {
			res.add(new ArrayList<String>(currentRes));
			return;
		}

		// standard template for back tracking logic
		for (int i = 0; i < s.length(); i++) {
			String firstPart = s.substring(0, i+1);
			if (isPalindrome(firstPart)) {
				currentRes.add(firstPart); // add to the list
				String secondPart = s.substring(i + 1);
				helper(res, currentRes, secondPart);
				currentRes.remove(currentRes.size() - 1); // remove from the list
			}
		}

	}

	private boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;

		while (left <= right) {
			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} else {
				return false;
			}
		}

		return true;
	}

}
