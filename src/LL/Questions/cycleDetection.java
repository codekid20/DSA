package LL.Questions;

import LL.LL;

public class cycleDetection {
    private Node head;
    private Node tail;


    public boolean hasCycle(Node head) {
            Node fast = head;
            Node slow = head;

            while(fast != null && fast.next != null) {

                fast = fast.next.next;
                slow = slow.next;

                if (fast == slow) {
                    return true;
                }
            }
            return false;
        }

        // find length of cycle
    // amazon and microsoft
    public int lengthCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // calculate the length
                Node temp = slow;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                    return length;
            }
        }
        return 0;
    }

    // start of cycle
    public Node detectCycle(Node head) {
        int length = 0;

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start node
        Node f = head;
        Node s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int number) {
        int ans = 0;

        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    //MIDDLE OF LINKED LIST
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
