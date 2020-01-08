package com.imran.datastructures.stack;

public class StackCreationUsingLinkedList {
    public static void main(String[] args) {
        LStack lStack = new LStack();
        lStack.push(1000);
        lStack.push(4000);
        lStack.push(6000);
        lStack.push(9000);
        lStack.push(10000);
        lStack.push(11000);
        lStack.print();
        System.out.println();
        System.out.println(lStack.peek());
        System.out.println(lStack.pop());
        System.out.println(lStack.peek());
    }
}

class LStack {
    Node front;

    public void push(int val) {
        Node temp = new Node(val);
        if (null == front) {
            front = temp;
            return;
        }
        temp.next = front;
        front = temp;
    }

    public int pop() {
        int val = front.val;
        front = front.next;
        return val;
    }

    public int peek() {
        int val = front.val;
        return val;
    }

    public void print(){
        Node temp = front;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
