package com.jstarczewski.LinkedListsUdemy;

public class MyLinkedLists implements NodeList {

    private ListItem root = null;

    public MyLinkedLists(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            root = item;
            return true;
        }
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                    return true;
                } else {
                    item.setNext(root);
                    root.setPrevious(item);
                    root = item;
                    return true;
                }
            } else {
                System.out.println("equal");
                return false;
            }
        }
        return false;
    }


    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = root;
        if (currentItem.getValue().equals(item.getValue())) {
            root.previous().setNext(root.next());
            root.next().setPrevious(root.previous());
            return true;
        }
        while (currentItem.next() != null) {
            if (currentItem.getValue().equals(item.getValue())) {
                currentItem.previous().setNext(currentItem.next());
                currentItem.next().setPrevious(currentItem.previous());
                return true;
            }
            currentItem = currentItem.next();
        }
        return false;
    }

    @Override
    public void traverse(ListItem item) {

        if (item==null) {
            System.out.println("Null");
        }
        else {
            System.out.println(item.getValue());
        }

        /*ListItem currentItem = root;
        if (item!=null) {
            while (!currentItem.getValue().equals(item.getValue()) && currentItem.next()!=null) {
                currentItem = currentItem.next();
            }
            System.out.println(currentItem.getValue());
        }*/
    }
}
