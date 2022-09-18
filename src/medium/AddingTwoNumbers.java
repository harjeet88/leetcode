/*
https://leetcode.com/problems/add-two-numbers/
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode result=null;//new ListNode(0);
	ListNode head=null;
	int carry =0;
	ListNode f=l1;
	ListNode s=l2;

	while(f !=null && s !=null) {
		ListNode node=new ListNode(0);

		int sum=f.val+s.val+carry;
		carry= sum/10;
        node.val =sum%10;
		
		//System.out.println(head);
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
	if(f != null && s ==null) {
        while(f !=null){
            ListNode node=new ListNode(0);
            node.val= (f.val+carry)%10;
            carry= (f.val+carry)/10;
            result.next=node;
            result=result.next;
            f=f.next;
        }
	}
	
	if(f == null && s != null) {
		while(s !=null){
            ListNode node=new ListNode(0);
            node.val= (s.val+carry)%10;
            carry= (s.val+carry)/10;
            result.next=node;
            result=result.next;
            s=s.next;
        }
	}
    if(carry == 1){
       ListNode node=new ListNode(0);
        node.val=carry;
        result.next=node;
    }

	//System.out.println(head.val + ", "+head.next.val +", "+head.next.next.val);
	return head;   
    }
}
