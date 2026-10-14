package edu.whitman;

public class LinkedList {
    private Node head;
    private int numberOfNodes;

    public LinkedList() {
        head = null;
        numberOfNodes = 0;
    }

    public void insertFront(int number) {
        head = new Node(number, head);
        numberOfNodes++;
    }

    public int removeFromFront() {
        if (head == null) {
            return -1;
        }

        int number = head.getData();
        head = head.getNext();
        numberOfNodes--;
        return number;
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public Node getHead() {
        return head;
    }

}