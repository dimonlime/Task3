package ru.cs.vsu;

public class MyQueue {
    private LinkedListStack<Integer> list1 = new LinkedListStack<>();
    private LinkedListStack<Integer> list2 = new LinkedListStack<>();

    public void add(int value){
        list1.push(value);
    }

    public int remove() {
        if(getSize() == 0) {
            System.out.println("Empty");
        } else if (list2.isEmpty()) {
            int size = list1.getSize();
            for (int i = 0; i < size; i++) {
                list2.push(list1.pop());
            }
        }
        return list2.pop();
    }

    public int getSize(){
        return list1.getSize();
    }

    public int get(int value){
        return list1.get(value);
    }

    public void display() {
        if (list2.isEmpty()) {
            for (int i = 0; i < list1.getSize(); i++) {
                System.out.print(list1.get(i) + " ");
            }
        } else {
            for(int i = 0; i < list2.getSize(); i++) {
                System.out.print(list2.get(i) + " ");
            }
            for (int i = 0; i < list1.getSize(); i++) {
                System.out.print(list1.get(i) + " ");
            }
        }
    }
}
