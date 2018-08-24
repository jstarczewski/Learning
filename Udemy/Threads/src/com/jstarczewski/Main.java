package com.jstarczewski;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}


class Countdown {

    public void doCoundown() {

        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1": {
                color = ThreadColor.ANSI_BLUE;
                break;
            }
            case "Thread 2": {
                color = ThreadColor.ANSI_RED;
                break;
            }
            default: {
                color = ThreadColor.ANSI_GREEN;
            }
        }
        for (int i = 0; i< 10; i++) {
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }
    }

}

class CountdownThread extends Thread {

    private Countdown threadCountdown;

    public CountdownThread(Countdown threadCountdown) {
        this.threadCountdown = threadCountdown;
    }



}
