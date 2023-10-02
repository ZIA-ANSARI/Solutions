package LinkedList;

import java.util.HashMap;

public class LRUCache {


    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        // [[2],[2],[2,6],[1],[1,5],[1,2],[1],[2]]
        cache.get(2);
        cache.put(2, 6);
        
        cache.get(1);
        cache.put(1, 5);
        cache.put(1, 2);
        cache.get(1);     
        cache.get(2);       
        System.out.println(cache.get(1));
    }
    Node head = null;
    Node tail = null;
    int maxSize = 0;
    HashMap<Integer, Node> cache = new HashMap<>();

    public LRUCache(int capacity) {
        this.maxSize = capacity;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            removeFromLinkedList(node);
            insertAtFrontOfLinkedList(node);
            return node.val;
        }
        return -1;
        
    }

    public void insertAtFrontOfLinkedList(Node node){
        if(head == null){
            head = node;
            tail = node;
        }else{
            head.prev = node;
            node.next = head;
            head =node;
        }
    }
    
    public void put(int key, int value) {
        if(head == null){
            Node temp = new Node(key,value);
            head = temp;
            tail = temp;
            cache.put(key,temp);
        }else{
            if(cache.size() >= maxSize && tail != null){
                removeKey(tail.key);
            }
            if(cache.containsKey(key))
            {
                removeKey(key);
            }
            Node temp = new Node(key,value);
            insertAtFrontOfLinkedList(temp);
            cache.put(key,temp);
        }
    }


    public void removeFromLinkedList(Node temp){
        if(temp == null) return;
        if(temp.prev !=null)
            temp.prev.next = temp.next;
        if(temp.next !=null)
            temp.next.prev = temp.prev;
        if(temp == head){
            head = head.next;
            }
        if(temp == tail){
            tail = tail.prev;
        }
    }
    public void removeKey(int val){
            Node temp = cache.get(val);
            removeFromLinkedList(temp);
            cache.remove(val);
    }

   
}
  class Node {

    int val;
    Node prev;
    Node next;
    int key;

    public Node(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}