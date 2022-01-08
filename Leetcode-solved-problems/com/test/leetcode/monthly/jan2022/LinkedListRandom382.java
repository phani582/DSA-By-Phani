package com.test.leetcode.monthly.jan2022;

import java.util.Random;

public class LinkedListRandom382 {

	public static void main(String[] args) {

	}

	int[] arr = new int[10004];
	int count = 0;

	public LinkedListRandom382(ListNode head) {
		ListNode itr = head;
		int i = 0;
		while (head != null) {
			arr[i++] = itr.val;
			itr = itr.next;
			count++;
		}
	}

	public int getRandom() {
		int rnd = new Random().nextInt(count);
		return arr[rnd];
	}
}
