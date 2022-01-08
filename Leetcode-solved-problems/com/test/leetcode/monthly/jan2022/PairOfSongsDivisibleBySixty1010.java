package com.test.leetcode.monthly.jan2022;

public class PairOfSongsDivisibleBySixty1010 {

	public static void main(String[] args) {
		PairOfSongsDivisibleBySixty1010 sol = new PairOfSongsDivisibleBySixty1010();
		System.out.println(sol.numPairsDivisibleBy60(new int[] { 60, 60, 60 }));
	}

	// naive approach
	public int numPairsDivisibleByNaive60(int[] time) {
		int ans = 0;

		for (int i = 0; i < time.length; i++) {
			for (int j = i + 1; j < time.length; j++) {
				if ((time[i] + time[j]) % 60 == 0) {
					ans = ans + 1;
				}
			}
		}

		return ans;
	}

	public int numPairsDivisibleBy60(int[] time) {

		int ans = 0;

		int[] remainderMap = new int[60];
		for (int songTime : time) {
			int remainder = songTime % 60;
			remainderMap[remainder]++;
		}

		for (int i = 1; i < 30; i++) {
			ans = ans + (remainderMap[i] * remainderMap[60 - i]);
		}
		
		// cover 0 case
		if(remainderMap[0] > 0) {
			ans = ans + (remainderMap[0] * (remainderMap[0]-1))/2;
		}

		// cover 30 case
		if(remainderMap[30] > 0) {
			ans = ans + (remainderMap[30] * (remainderMap[30]-1))/2;
		}

		return ans;
	}
}
