package com.jstarczewski.LinkedListsJan;

public class Node {

    private Node previous = null;
    private Node next = null;
    private String value;

    public Node() {
    }


    public Node(String value) {
        this.value = value;
        next = null;

    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
