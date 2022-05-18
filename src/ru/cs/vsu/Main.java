package ru.cs.vsu;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        for (int i = 0; i < queue.getSize(); i++) {
            System.out.print(queue.get(i) + " ");
        }
    }
}

class Queue {
    LinkedListStack<Integer> list1 = new LinkedListStack<>();
    LinkedListStack<Integer> list2 = new LinkedListStack<>();

    public void add(int value){
        list1.push(value);
    }

    public void remove() {
        if(getSize() == 0) {
            System.out.println("Empty");
        } else {
            int size = list1.getSize();
            for (int i = 0; i < size; i++) {
                list2.push(list1.pop());
            }
            list2.pop();
            size = list2.getSize();
            for (int i = 0; i < size; i++) {
                list1.push(list2.pop());
            }
        }
    }

    public int getSize(){
        return list1.getSize();
    }

    public int get(int value){
        return list1.get(value);
    }

}
