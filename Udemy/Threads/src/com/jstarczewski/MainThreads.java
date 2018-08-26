package com.jstarczewski;

import java.util.Random;

public class MainThreads {

    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();

    }

}


class Message {

    private String message;
    private boolean empty = true;

    public synchronized String read() {

        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }

        }
        empty = true;
        notifyAll();
        return message;

    }



    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }

        }
        empty = false;
        notifyAll();
        this.message = message;
    }

}

class Writer implements Runnable {

    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String messages[] = {"187 Strassenbande",
                "Random commit",
                "Neue Shue kaufen durch die Stadt laufen",
                "Schnapp krokodile schnapppp"};

        Random random = new Random();
        for (int i = 0; i < messages.length; i++) {

            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        message.write("Alles");
    }
}

class Reader implements Runnable {

    private Message message;

    public Reader(Message message) {
        this.message = message;

    }

    @Override
    public void run() {
        Random random = new Random();
        for (String latestString = message.read(); !latestString.equals("Alles");
             latestString = message.read()) {

            System.out.println(latestString);

            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}