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
import java.util.*;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null) {
            ans.add(temp1.val);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            ans.add(temp2.val);
            temp2 = temp2.next;
        }
        Collections.sort(ans);

        ListNode dum = new ListNode(-1);
        ListNode temp = dum;
        for (int i = 0; i < ans.size(); i++) {
            temp.next = new ListNode(ans.get(i));
            temp = temp.next;
        }
        return dum.next;
    }
}