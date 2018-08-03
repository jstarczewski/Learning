package com.jstarczewski;

import com.jstarczewski.LinkedListsJan.JanLinkedList;
import com.jstarczewski.LinkedListsUdemy.MyLinkedLists;
import com.jstarczewski.LinkedListsUdemy.Node;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyLinkedLists myLinkedLists = new MyLinkedLists(null);
        myLinkedLists.addItem(new Node("Warszawa"));
        myLinkedLists.addItem(new Node("Kraków"));
        myLinkedLists.addItem(new Node("Rzeszów"));
        myLinkedLists.addItem(new Node("Augustów"));
        myLinkedLists.addItem(new Node("Mrągowo"));
        myLinkedLists.addItem(new Node("Zabrze"));
        myLinkedLists.addItem(new Node("Śląsk"));
        myLinkedLists.addItem(new Node("Gdańsk"));
        myLinkedLists.addItem(new Node("Siedlce"));
        myLinkedLists.addItem(new Node("Warszawa"));
        myLinkedLists.addItem(new Node("Gdynia"));
        myLinkedLists.addItem(new Node("Barczewo"));
        System.out.println("Usuwamy");
        myLinkedLists.removeItem(new Node("Siedlce"));

      //  myLinkedLists.traverse(new Node("Chojnice"));
        JanLinkedList janLinkedList = new JanLinkedList();
        janLinkedList.add("Warszawa");
        janLinkedList.add("Warszawa");
        janLinkedList.add("Polska");
        janLinkedList.add("Bielany");
        janLinkedList.add("Wola");
        janLinkedList.add("Bielany");
        janLinkedList.add("Twoja");
        janLinkedList.add("Warszawa");
        janLinkedList.displayList();
    }
}
