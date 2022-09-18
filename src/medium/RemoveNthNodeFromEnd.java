//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n==0){
            return head;
        }

        ListNode curr=head;
        ListNode nth_prev=head;
        nth_prev=head;
        int count = 0;
        
        while(curr !=null){
            count++;
            n--;
            if(n<-1){
                nth_prev=nth_prev.next;
            }
            curr=curr.next;
        }
        //System.out.println(nth_prev.val);
        //System.out.println(count);
        //System.out.println(n);
        if(n==0){
            
            head=head.next;
        }
        if(nth_prev.next !=null){
            nth_prev.next=nth_prev.next.next;
        }
        
        
        /*ListNode nth=null;
        int count =0;
        while(curr !=null){
            count = count +1;
            if(count-n == 1){
                nth=head;
            }else if(count-n > 1){
                nth=nth.next;
            }
            curr=curr.next;
        }
        if(count==n){
            head = head.next;
            return head;
        }

        nth.next=nth.next.next;
        */
        return head;
    }
}
