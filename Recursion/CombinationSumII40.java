package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CombinationSumII40 {

	HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();

	public static void main(String[] args) {

		CombinationSumII40 sol = new CombinationSumII40();
		int[] input = new int[] { 3, 1, 3, 5, 1, 1 };
		Arrays.sort(input);
		List<List<Integer>> combinationSum = sol.combinationSum2(input, 8);
		for (List<Integer> res : combinationSum) {
			System.out.println(res);
		}

	}

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for (int ele : candidates) {
			int count = countMap.get(ele) == null ? 1 : countMap.get(ele) + 1;
			countMap.put(ele, count);
		}
		if (candidates.length == 1) {
			ArrayList<Integer> response = new ArrayList<Integer>();

			if (candidates[0] == target) {
				response.add(candidates[0]);
			}
			res.add(response);
			return res;
		}
		helper(candidates, res, new ArrayList<Integer>(), target, 0);
		return res;
	}

	private void helper(int[] candidates, List<List<Integer>> res, ArrayList<Integer> currRes, int target, int index) {

		if (target == 0) {
			res.add(new ArrayList<Integer>(currRes));
			return;
		}

		if (candidates.length - 1 != index) {
			while (candidates.length - 1 > index && candidates[index] == candidates[index + 1]) {
				index = index + 1;
			}
		}

		for (int i = index; i < candidates.length; i++) {
			
				if(i != candidates.length-1) {
					while(candidates[index] == candidates[index + 1]) {
						continue;
					}
				}else {
					
				}
			
			if (candidates[i] <= target) {
				currRes.add(candidates[i]);
				countMap.put(candidates[i], countMap.get(candidates[i]) - 1);
				if (countMap.get(candidates[i]) == 0) {
					helper(candidates, res, currRes, target - candidates[i], i + 1);
				} else {
					helper(candidates, res, currRes, target - candidates[i], i);
				}
				countMap.put(candidates[i], countMap.get(candidates[i]) + 1);
				currRes.remove(currRes.size() - 1);
			}
		}
	}

}
