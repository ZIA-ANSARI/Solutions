package LinkedList;
import java.util.List;

import LinkedList.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode ans = 
        reverseLinkedList.reverseList(listNode);
        while(ans!=null){
        System.out.println(ans.val);
        ans = ans.next;

    }
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode listNode;
        ListNode temp = head;
        ListNode curr = head;
        ListNode next = curr.next;
        curr.next = null;

        while(next != null){
            temp = next.next;
            next.next = curr;
            //prev = curr;
            curr = next;
            next = temp;
        }
        return curr;

        

        
    }
}
