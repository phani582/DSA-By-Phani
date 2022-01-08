package com.test.leetcode.monthly.jan2022;

public class FindTheTownJudge997 {

	public static void main(String[] args) {

		FindTheTownJudge997 sol = new FindTheTownJudge997();
		System.out.println(sol.findJudge(2, new int[][] { { 1, 2 } }));
		System.out.println(sol.findJudge(3, new int[][] { { 1, 3 }, { 2, 3 } }));
		System.out.println(sol.findJudge(3, new int[][] { { 1, 3 }, { 2, 3 }, { 3, 1} }));
		System.out.println(sol.findJudge(3, new int[][] { { 1, 2 }, { 2, 3 } }));

	}

	// calculate the indegree and outdgree of each noode
	public int findJudge(int n, int[][] trust) {
		int[] inDegree = new int[n + 1];
		int[] outDegree = new int[n + 1];

		for (int i = 0; i < trust.length; i++) {
			int outCount = outDegree[trust[i][0]];
			outDegree[trust[i][0]] = outCount + 1;
			int inCount = inDegree[trust[i][1]];
			inDegree[trust[i][1]] = inCount + 1;
		}

		for (int i = 1; i <= n; i++) {
			if (outDegree[i] == 0 && inDegree[i] == n - 1) {
				return i;
			}
		}

		return -1;
	}

	// Wrong approach
	public int findJudge1(int n, int[][] trust) {

		int[] arr = new int[n + 1];
		int ans = -1;
		for (int i = 1; i <= n; i++) {
			arr[i] = 0;
		}

		for (int[] ele : trust) {
			arr[ele[0]] = -1;
			if (arr[ele[1]] != -1)
				arr[ele[1]] = arr[ele[1]] + 1;
		}

		for (int i = 1; i <= n; i++) {
			if (arr[i] != -1 && arr[i] == i - 1) {
				ans = i;
				break;
			}
		}
		return ans;
	}

}
