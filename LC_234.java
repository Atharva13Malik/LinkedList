class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null) return true;

        int size = 0;
        ListNode temp = head;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        int[] arr = new int[size];

        temp = head;

        for(int i = 0; i < size; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }

        int i = 0;
        int j = size - 1;

        while(i < j){
            if(arr[i] != arr[j])
                return false;
            i++;
            j--;
        }

        return true;
    }
}
