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
    public int getDecimalValue(ListNode head) {
        ListNode tail = head;
        ListNode curr = head;
        int count = 0;
        int sum = 0;
        if(head.next == null) {
            return curr.val * 1;
        }
        while (tail.next != null) {
            tail = tail.next;
            count++;
        }
        while(count >= 0) {
            sum += curr.val * (int)Math.pow(2,count);
            curr = curr.next;
            count--;
        }
        return sum;
    }
}
