package com.test.leetcode.monthly.jan2021;

public class BeautifulArrangement526 {

	private int count = 0;

	public static void main(String[] args) {
		BeautifulArrangement526 sol = new BeautifulArrangement526();
		System.out.println(sol.countArrangement(10));
	}

	public int countArrangement(int n) {
		if (n <= 0) {
			return count;
		}

		boolean[] visited = new boolean[n + 1];
		helper(visited, 1, n);
		return count;
	}

	private void helper(boolean[] visited, int valOrIndex, int n) {
		if (valOrIndex > n) {
			count++;
			return;
		}

		for (int i = 1; i <= n; i++) {
			if (!visited[i] && (valOrIndex % i == 0 || i % valOrIndex == 0)) {
				visited[i] = true;
				helper(visited, valOrIndex + 1, n);
				visited[i] = false;
			}
		}
	}

}
