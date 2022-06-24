import java.util.LinkedList;
import java.util.List;





public class MergeTwoSortedList {
    public static void main(String args[]){
        ListNode list1 = new ListNode();
        list1.val = 0;
        ListNode ll = new ListNode();
        ll.val = 2;
       // list1.next = ll;
        ListNode list2 = new ListNode();
        list2.val = 1;
        list2.next = ll;
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
       // System.out.println(list1);
        ListNode m = mergeTwoSortedList.mergeTwoLists(list1, list2);//{0}{1,2}
        while(m != null){
            System.out.println(m.val);
            m = m.next;
        }
    }
   
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode head = new ListNode();

      ListNode mergNode = head;
      if(list1.val < list2.val){
        System.out.println("in first if");
        mergNode.val = list1.val;
        list1 = list1.next;
      }else{
        mergNode.val = list2.val;
        list2 = list2.next;
      }

      while(list1 != null && list2 != null){       

        ListNode temp = new ListNode();
        if(list1.val < list2.val){
            System.out.println("in if");
            temp.val = list1.val;
            list1 = list1.next;
            mergNode.next = temp;
            mergNode = mergNode.next;
        }else{
            System.out.println("in else");
            temp.val = list2.val;
            list2 = list2.next;
            mergNode.next = temp;
            mergNode = mergNode.next;
        }

      }


      if(list1 == null){
        while(list2 != null){
            ListNode temp = new ListNode();
            System.out.println("outside if");
            temp.val = list2.val;
            list2 = list2.next;
            mergNode.next = temp;
            mergNode = mergNode.next;
        }
    }else if(list2 == null){
        while(list1 != null){
            System.out.println("outside if");
            ListNode temp = new ListNode();
            temp.val = list1.val;
            list1 = list1.next;
            mergNode.next = temp;
            mergNode = mergNode.next;
        }
    }
      return head;
    }
    
}
