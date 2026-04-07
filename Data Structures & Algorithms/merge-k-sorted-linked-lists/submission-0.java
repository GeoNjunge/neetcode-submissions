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
        List<Integer> allNodes = new ArrayList<>();
        for (ListNode list: lists) {
            ListNode curr = list;
            while (curr != null) {
                allNodes.add(curr.val);
                curr = curr.next;
            }
        }

        allNodes.sort((a, b) -> Integer.compare(a, b));

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        for (int num: allNodes) {
            curr.next = new ListNode(num);
            while (curr.next != null) {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
