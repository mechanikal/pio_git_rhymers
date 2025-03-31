package edu.kis.vh.nursery.list;

/**
 * basic class used in list class
 */
public class Node {

    private final int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    /**
     * getter for current node value
     */
    public int getValue() {
        return value;
    }

    /**
     * returns node set as previous
     */
    public Node getPrev() {
        return prev;
    }
    /**
     * sets node as previous
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    /**
     * returns node set as next
     */
    public Node getNext() {
        return next;
    }
    /**
     * returns node set as next
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
