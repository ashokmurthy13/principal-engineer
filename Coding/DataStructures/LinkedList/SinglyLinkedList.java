package Coding.DataStructures.LinkedList;

public class SinglyLinkedList {

    private Node head = null;
    private Node tail = null;

    public void addFirst(int data) {
        if (head == null) {
            Node node = new Node(data, null);
            head = node;
            tail = node;
        } else {
            Node node = new Node(data, null);
            node.next = head;
            head = node;
        }
    }

    public void addLast(int data) {
        if (head == null) {
            Node node = new Node(data, null);
            head = node;
            tail = node;
        } else {
            Node node = new Node(data, null);
            head.next = node;
            tail = node;
        }
    }

    public int removeFirst() {
        return 0;
    }

    public int removeLast() {
        return 0;
    }

    public int size() {
        return 0;
    }

    // Appends the element to the end of the list
    public void add() {
    }

    // Retrieves and removes the first element of the list
    public int remove() {
        return 0;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            int data = temp.data;
            System.out.print(data + " -> ");
            temp = temp.next;
        }
    }

    private static class Node {
        public int data;
        public Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
