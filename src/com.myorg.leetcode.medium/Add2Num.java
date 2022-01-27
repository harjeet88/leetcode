package com.myorg.leetcode.medium;

import com.myorg.leetcode.beans.ListNode;

public class Add2Num {
	
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode result=null;//new ListNode(0);
	ListNode head=null;
	int carry =0;
	ListNode f=l1;
	ListNode s=l2;

	while(f !=null && s !=null) {
		ListNode node=new ListNode(0);

		int sum=f.val+s.val+carry;
		if((sum-10) >= 0) {
			carry =1;
			sum = sum - 10;
		}
		node.val = sum;
		System.out.println(head);
		if(head == null) {
			result=node;
			head=node;
		}else {
			//result=node;
			result.next=node;
			result=result.next;
		}
		f=f.next;
		s=s.next;
		
	}
	while(f == null && s !=null) {
		result.next=new ListNode(s.val);
		result = result.next;
	}
	
	while(f != null && s == null) {
		result.next=new ListNode(f.val);
		result = result.next;
	}

	System.out.println(head.val + ", "+head.next.val +", "+head.next.next.val);
	return head;        
}

public static void main(String[] args) {
	///int[] a=
	//new Add2Num().addTwoNumbers({2,4,3}, {5,6,4});
	ListNode f=new ListNode(2);
	f.next=new ListNode(4);
	f.next.next=new ListNode(3);
	
	ListNode s=new ListNode(5);
	s.next=new ListNode(6);
	s.next.next=new ListNode(4);
	
	new Add2Num().addTwoNumbers(f,s);
}

}
