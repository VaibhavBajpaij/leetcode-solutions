class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA = list1;  // To track node before position 'a'
        for (int i = 0; i < a - 1; i++) {
            prevA = prevA.next;
        }

        ListNode afterB = prevA.next;  // To track node after position 'b'
        for (int i = a; i <= b; i++) {
            afterB = afterB.next;
        }

        prevA.next = list2;  // Connect `list1` before `a` to `list2`

        ListNode lastNodeList2 = list2;  // Find last node of `list2`
        while (lastNodeList2.next != null) {
            lastNodeList2 = lastNodeList2.next;
        }

        lastNodeList2.next = afterB;  // Connect last node of `list2` to `list1` after `b`

        return list1;
    }
}

