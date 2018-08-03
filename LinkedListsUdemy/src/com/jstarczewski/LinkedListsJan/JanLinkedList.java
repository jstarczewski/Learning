package com.jstarczewski.LinkedListsJan;


public class JanLinkedList {

    private Node root;

    public JanLinkedList() {
        root = new Node();
        root.setNext(null);
        root.setPrevious(null);
    }
/*
    public boolean add(String value) {
        if (root.getValue() == null) {
            root.setValue(value);
            return true;
        }
        System.out.println("root" + root.getValue());
        Node currentRoot = root;
        Node newItem = new Node(value);
        if (currentRoot.getValue().compareTo(newItem.getValue()) < 0) {
            while (currentRoot!= null && currentRoot.getValue().compareTo(newItem.getValue()) > 0) {
                currentRoot = currentRoot.getNext();
            }
            if (currentRoot.getNext() != null) {
                newItem.setNext(currentRoot.getNext());
                newItem.setPrevious(currentRoot);
                currentRoot.setNext(newItem);
                currentRoot.getNext().setPrevious(newItem);
            } else {
                currentRoot.setNext(newItem);
                newItem.setPrevious(currentRoot);
            }
            return true;
        } else if (currentRoot.getValue().compareTo(newItem.getValue()) > 0) {
            root.setPrevious(newItem);
            newItem.setNext(root);
            newItem.setPrevious(null);
            root = newItem;
            return true;
        } else {
            System.out.println("element istnieje");
            return false;
        }
    }*/

    /*
     * Zbyt wiele powtorzen compareTo() itp
     *
     * Przerobic to na jedna wielka petle
     *
     * Zrobic wersje rekrusyjna
     *
     *
     * */


    public boolean add(String value) {
        if (root.getValue() == null) {
            root.setValue(value);
            return true;
        }
        Node currentRoot = root;
        Node item = new Node(value);
        if (currentRoot.getValue().compareTo(value) < 0) {
            root.setPrevious(item);
            item.setPrevious(null);
            item.setNext(root);
            root = item;
            return true;
        } else {
            while (currentRoot.getNext() != null) {
                if (currentRoot.getValue().equals(value))
                    return false;
                if (currentRoot.getValue().compareTo(item.getValue()) > 0 && currentRoot.getNext().getValue().compareTo(item.getValue()) < 0) {
                    item.setPrevious(currentRoot);
                    item.setNext(currentRoot.getNext());
                    currentRoot.getNext().setPrevious(item);
                    currentRoot.setNext(item);
                    return true;
                }
                currentRoot = currentRoot.getNext();
            }
            if (!currentRoot.getValue().equals(value)) {
                currentRoot.setNext(item);
                item.setPrevious(currentRoot);
                item.setNext(null);
                return true;
            }
            return false;
        }
    }


    public void displayList() {
        Node currentRood = root;
        System.out.println("root" + root.getValue());
        while (currentRood != null) {
            System.out.println(currentRood.getValue());
            currentRood = currentRood.getNext();
        }
    }


}
