public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        Set<ListNode> nodes=new HashSet<ListNode>();
        nodes.add(head);
        ListNode curr=head.next;
        while(!nodes.contains(curr) && curr !=null){
            nodes.add(curr);
            curr = curr.next;
        }
        return curr;
        
       // ListNode slow=head;
        //ListNode fast=head;
        //while(fast !=null && fast.next != null){
         //   slow=slow.next;
           // fast=fast.next.next;
           // if(slow == fast){
                //return findStart(head);
            //}
        //}
        //return null;
    }
    
    public ListNode findStart(ListNode head){
        if(head == null){
            return null;
        }
        Set<ListNode> nodes=new HashSet<ListNode>();
        nodes.add(head);
        ListNode curr=head.next;
        while(!nodes.contains(curr) && curr !=null){
            nodes.add(curr);
            curr = curr.next;
        }
        return curr;
    }
}
