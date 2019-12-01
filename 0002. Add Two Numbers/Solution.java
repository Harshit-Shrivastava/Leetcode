/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = 0;
        int carry = 0;
        ListNode head = null;
        ListNode cur = null;
        ListNode l1ptr = l1;
        ListNode l2ptr = l2;
        while((l1ptr != null) || (l2ptr != null)){
            int sum;
            if(l1ptr == null) {
                sum = l2ptr.val + carry;
                l2ptr = l2ptr.next;    
            } else if (l2ptr == null) {
                sum = l1ptr.val + carry;
                l1ptr = l1ptr.next;
            } else {
                sum = l1ptr.val + l2ptr.val + carry;
                l1ptr = l1ptr.next;
                l2ptr = l2ptr.next;
            }
            val = sum % 10;
            carry = sum/10;
            if(cur == null) {
                head = new ListNode(val);
                cur = head;
            } else {
                ListNode temp = new ListNode(val);
                cur.next = temp;
                cur = cur.next;
            }
        }
        if(carry != 0 ) {
            ListNode temp = new ListNode(carry);
            cur.next = temp;
            cur = cur.next;
        }
        return head;
    }
}