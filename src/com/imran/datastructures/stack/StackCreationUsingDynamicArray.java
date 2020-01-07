package com.imran.datastructures.stack;

import java.util.EmptyStackException;

public class StackCreationUsingDynamicArray {
    public static void main(String[] args) {
        DStack dstack = new DStack();
        dstack.push(50);
        dstack.push(60);
        dstack.push(70);
        dstack.push(80);
        dstack.push(90);
        dstack.push(100);
        dstack.pop();
        dstack.pop();
        dstack.pop();
        dstack.pop();
        dstack.pop();
        System.out.println(dstack.CAPACITY);
        System.out.println(dstack.peek());
    }
}


class DStack{
    int CAPACITY= 2;
    int arr[] =new int[CAPACITY];
    int index = 0;

    public void push(int val){
        if(isFull()){
            grow();
        }
        arr[index]=val;
        index++;
    }

    public int pop(){
        shrink();
        int val = arr[--index];
        return val;
    }

    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int top = index-1;
        int val = arr[top];
        return val;
    }

    private void grow(){
        int length = index;
        int newArr[] = new int[CAPACITY*2];
        System.arraycopy(arr, 0, newArr, 0, length);
        arr = newArr;
        CAPACITY = CAPACITY*2;

    }

    private void shrink(){
        if(index < ((CAPACITY)/2)/2) {
            int length = index;
            int newArr[] = new int[((CAPACITY) / 2) / 2];
            System.arraycopy(arr, 0, newArr, 0, length);
            arr = newArr;
            CAPACITY = ((CAPACITY) / 2) / 2;
        }
    }
    private boolean isEmpty() {
        return index == 0;
    }

    private boolean isFull() {
        return index == CAPACITY;
    }
}