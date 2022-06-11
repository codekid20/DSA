package LL;

public class DLL {

    private Node head;
//    private Node tail;
//    private int size;
//
//    public DLL() {
//        this.size = 0;
//    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.previous = null;

        if (head != null) {
            head.previous = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("print in reverse");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.previous;
        }
        System.out.println("START");
    }


    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.previous = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.previous = last;
    }

    public void insertAfter(int after, int value) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.previous = p;

        if (node.next != null) {
            node.next.previous = node;
        }

    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
