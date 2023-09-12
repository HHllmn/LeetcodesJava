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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        ListNode pointer = head;
        int len = 1;
        
        while (pointer.next != null){
            pointer = pointer.next;
            len++;
        }

        pointer.next = head;
        k = k % len;

        for(int i = 0; i < len - k; i++){
            pointer = pointer.next;
        }

        head = pointer.next;
        pointer.next = null;
        return head;
    }
}