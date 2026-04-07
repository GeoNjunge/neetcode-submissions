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
    public ListNode mergeLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                res.next = l2;
                l2 = l2.next;
            } else {
                res.next = l1;
                l1 = l1.next;
            }
            res = res.next;
        }

        if (l1 != null) {
            res.next = l1;
        }

        if (l2 != null) {
            res.next = l2;
        }

        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        while (lists.length > 1) {
            List<ListNode> mergedList = new ArrayList<>();

            int i = 0;
            while (i < lists.length) {
                ListNode list1 = lists[i];
                ListNode list2 = null;

                if ((i + 1) < lists.length) {
                    list2 = lists[i + 1]; 
                }

                mergedList.add(mergeLists(list1, list2));
                i += 2;
            }

            lists = mergedList.toArray(new ListNode[0]);
        }

       return lists != null ? lists[0] : null;
    }
}
