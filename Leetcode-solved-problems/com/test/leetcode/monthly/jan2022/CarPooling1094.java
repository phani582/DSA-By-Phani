package com.test.leetcode.monthly.jan2022;

public class CarPooling1094 {

	public static void main(String[] args) {
		CarPooling1094 sol = new CarPooling1094();
		System.out.println(sol.carPooling(new int[][] { { 2, 1, 5 }, { 3, 3, 7 } }, 4));
		System.out.println(sol.carPooling(new int[][] { { 2, 1, 5 }, { 3, 3, 7 } }, 5));
	}

	public boolean carPooling(int[][] trips, int capacity) {
		int[] occupancy = new int[1001];

		for (int i = 0; i < trips.length; i++) {
			occupancy[trips[i][1]] += trips[i][0];
			occupancy[trips[i][2]] -= trips[i][0];
		}

		int currCapacity = 0;

		for (int currOccupancy : occupancy) {
			currCapacity += currOccupancy;

			if (currCapacity > capacity) {
				return false;
			}
		}
		return true;
	}

}
