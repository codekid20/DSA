package LL;

public class mergeSort {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left, right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Head = new ListNode();
        ListNode tail = Head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return Head.next;
    }

    // recursion reverse


    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    // REVERSE A LINKED LIST 2

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) {
            return head;
        }

        // skip first left - 1 nodes
        ListNode current = head;
        ListNode prev = null;

        for (int i = 0;current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        //reverse between left and right
        ListNode next = current.next;
        for (int i = 0;current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;

            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }


    // REVERSE K NODES

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;

        while(true) {

            ListNode last = prev;
            ListNode newEnd = current;

            //reverse between left and right
            ListNode next = current.next;
            for (int i = 0;current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;

                if (next != null) {
                    next = next.next;
                }

            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;

            if (current == null) {
                break;
            }

            prev = newEnd;
        }
        return head;
    }



    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }



    // PALINDROME LINKED LIST

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;

        //compare both the halfs
        while(head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;
    }

    // REORDER LIST
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = middleNode(head);

        ListNode hs = reverseList(mid);
        ListNode hf = head;

        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // next of tail to null
        if (hf != null) {
            hf.next = null;
        }
    }

    // REVERSE EVERY K NODES




    class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
