package ru.cs.vsu;

import java.util.*;

public class SimpleQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void add(int value) {
        stack1.push(value);
    }

    public int remove() {
        if(stack1.size() == 0) {
            System.out.println("Empty");
        } else if (stack2.empty()) {
            int size = stack1.size();
            for (int i = 0; i < size; i++) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public void display() {
        if (stack2.empty()) {
            for (int i = 0; i < stack1.size(); i++) {
                System.out.print(stack1.get(i) + " ");
            }
        } else {
            for(int i = stack2.size() - 1; i >= 0; i--) {
                System.out.print(stack2.get(i) + " ");
            }
            for (int i = 0; i < stack1.size(); i++) {
                System.out.print(stack1.get(i) + " ");
            }
        }
    }
}
