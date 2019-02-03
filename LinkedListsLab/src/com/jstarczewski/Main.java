package com.jstarczewski;

import com.jstarczewski.list.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here


        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < 40; i++) {
            linkedList.addLastRec(i);
        }


        linkedList.remove(29);
        linkedList.traverse();


    }
}
