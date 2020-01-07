package com.imran.datastructures.stack;

import java.util.EmptyStackException;

public class StackCreationUsingFixedArray {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}

class Stack {
    private int arr[];
    private int size;
    private int index = 0;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {

        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }

        arr[index] = element;
        index++;
    }

    public int pop() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[--index];
    }

    public int peek() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int top = index-1;
        return arr[top];
    }

    public boolean isEmpty() {
        return index==0;
    }

    public boolean isFull() {
        return index==size;
    }

    public int size() {
        return index;
    }
}