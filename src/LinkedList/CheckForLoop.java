package LinkedList;

public class CheckForLoop {

    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        while(temp != null){
            if(temp.val == Integer.MIN_VALUE){
                return true;
            }
            else 
                temp.val = Integer.MIN_VALUE;
                temp = temp.next;
        }
        return false;
    }
}
