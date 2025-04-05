package edu.kis.vh.nursery.list;

/**
 * Basic class used in double-linked list class to represent a single node
 * Contains value as int and references to previous and next nodes
 */
public class Node {

    private final int value;
    private Node prev;
    private Node next;

    /**
     * Creates a node with value given by argument
     * 
     * @param i value of the node
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Getter for current node value
     * 
     * @return node value
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns node set as previous
     * 
     * @return previous node
     */
    public Node getPrev() {
        return prev;
    }
    /**
     * Sets given node as previous
     * 
     * @param node to be set as prev
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    /**
     * Returns node set as next
     * 
     * @return next node
     */
    public Node getNext() {
        return next;
    }
    /**
     * Sets given node as next
     * 
     * @param node to be set as next
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
