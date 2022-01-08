package com.test.leetcode.monthly.jan2021;

public class MergeTwoSortedList21 {

	public static void main(String[] args) {

	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;

		if (list2 == null)
			return list1;

		ListNode dummy = new ListNode(-1);
		dummy.next = list1;
		ListNode it = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				it.next = list1;
				list1 = list1.next;
			} else {
				it.next = list2;
				list2 = list2.next;
			}
		}

		if (list1 != null)
			it.next = list1;

		if (list2 != null)
			it.next = list2;

		return dummy.next;
	}

}
