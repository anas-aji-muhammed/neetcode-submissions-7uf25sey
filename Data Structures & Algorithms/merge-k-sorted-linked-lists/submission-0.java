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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a,b)->a.val-b.val);

        int i = 0;
        while(i<lists.length){
            ListNode current = lists[i];
            while(current!=null){
                heap.offer(current);
                current=current.next;
            }
            i++;
        }
        ListNode head = heap.poll();
        ListNode prev = head;
        while(!heap.isEmpty()){
            ListNode current = heap.poll();
            prev.next=current;
            prev = current;
        }

        return head;


    }
}
