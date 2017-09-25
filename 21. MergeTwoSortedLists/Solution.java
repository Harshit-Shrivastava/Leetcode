/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode curl1, curl2, cur;
        ListNode head = new ListNode(0);
        cur  = head;
        curl1 = l1;
        curl2 = l2;
        while(curl1 != null && curl2 != null){
            if(curl1.val < curl2.val){
                cur.next = curl1;
                curl1 = curl1.next;
            }
            else{
                cur.next = curl2;
                curl2 = curl2.next;
            }
            cur = cur.next;
        }
        if(curl1 != null){
            cur.next = curl1;
        }
        if(curl2 != null){
            cur.next = curl2;
        }
        return head.next;
    }
}