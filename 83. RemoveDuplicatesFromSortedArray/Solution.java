/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = head.next;
        if((head.val == temp.val) && (temp.next == null)){
            head.next = null;
            return head;
        }
        while(temp != null){
            if(cur.val == temp.val){
                temp = temp.next;
                cur.next = temp;
                prev = cur;
            }
            else{
                prev = cur;
                cur = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}