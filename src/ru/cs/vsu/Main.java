package ru.cs.vsu;

public class Main {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.remove();
        myQueue.add(2);
        myQueue.add(3);
        myQueue.remove();
        myQueue.add(4);
        myQueue.display();

        System.out.println();

        SimpleQueue sq = new SimpleQueue();
        sq.add(1);
        sq.add(2);
        sq.add(3);
        sq.remove();
        sq.add(4);
        sq.add(5);
        sq.remove();
        sq.add(6);
        sq.remove();
        sq.display();
    }
}