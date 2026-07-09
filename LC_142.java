public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                ListNode start=head;
                while(start!=slow){
                    slow=slow.next;
                    start=start.next;
                }
                return start;
            }
        }
        return null;
    }
}
