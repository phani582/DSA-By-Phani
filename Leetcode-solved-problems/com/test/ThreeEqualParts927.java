package com.test;

public class ThreeEqualParts927 {

	public static void main(String[] args) {
		
		ThreeEqualParts927 sol = new ThreeEqualParts927();
		int[] input = new int[] { 1, 0, 1, 0, 1 };
		System.out.println(sol.threeEqualParts(input));
		
	}

	public int[] threeEqualParts(int[] arr) {
		int[] ans = new int[] { -1, -1 };

		// identify number of 1's
		int numberOf1s = 0;
		for (int i : arr) {
			numberOf1s += i;
		}

		if (numberOf1s == 0) {
			return new int[] { 0, 2 };
		}
		
		if(numberOf1s%3!=0) {
			return ans;
		}
		
		int numberOfOnesInEachPart = numberOf1s/3;
		int indexofFirstInPart0 = -1;
		int indexofFirstInPart1 = -1;
		int indexofFirstInPart2 = -1;
		

		return ans;
	}

}
