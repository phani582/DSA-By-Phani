package com.test;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {

	public static void main(String[] args) {

		CombinationSum39 sol = new CombinationSum39();

		List<List<Integer>> combinationSum = sol.combinationSum(new int[] { 2, 3, 6, 7 }, 7);

		for (List<Integer> res : combinationSum) {
			System.out.println(res);
		}

		System.out.println("================");

		List<List<Integer>> combinationSum1 = sol.combinationSum(new int[] { 2, 3, 5 }, 8);

		for (List<Integer> res : combinationSum1) {
			System.out.println(res);
		}

		System.out.println("================");

		List<List<Integer>> combinationSum2 = sol.combinationSum(new int[] { 2}, 1);

		for (List<Integer> res : combinationSum2) {
			System.out.println(res);
		}

	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		helper(candidates, res, new ArrayList<Integer>(), target, 0);
		return res;
	}

	private void helper(int[] candidates, List<List<Integer>> res, ArrayList<Integer> currRes, int target, int index) {

		if (target == 0) {
			res.add(new ArrayList<Integer>(currRes));
			return;
		}

		for (int i = index; i < candidates.length; i++) {
			if (candidates[i] <= target) {
				currRes.add(candidates[i]);
				helper(candidates, res, currRes, target - candidates[i], i);
				currRes.remove(currRes.size() - 1);
			}
		}

	}

}
