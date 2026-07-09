class Solution {
    public ListNode middle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode a=middle(head);
        ListNode middlenext=reverse(a.next);

        ListNode firsthead=head;
        while(middlenext!=null){
            if(firsthead.val!=middlenext.val) return false;
            firsthead=firsthead.next;
            middlenext=middlenext.next;

        }
        return true;

        
    }
}
