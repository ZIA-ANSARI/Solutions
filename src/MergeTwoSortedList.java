import java.util.LinkedList;





public class MergeTwoSortedList {
    public static void main(String args[]){
        ListNode list1 = new ListNode();
        list1.val = 1;
        ListNode list2 = new ListNode();
        list2.val = 1;
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        mergeTwoSortedList.mergeTwoLists(list1, list2);
    }
   
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        while(list1.next != null){
            System.out.println(list1.val);
            list1 = list1.next;
        }


        return list2;
        
    }
    
}
