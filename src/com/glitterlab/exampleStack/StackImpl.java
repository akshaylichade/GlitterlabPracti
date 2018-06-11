package com.glitterlab.exampleStack;

/**
 * Program to implement Stack Operatios.
 */

class Stack{
    int max = 1000;
    int top;
    int stackArray[] = new int[max];

    /*
    if Stack is Empty
     */
    boolean isEmpty(){
        return (top < 0);
    }

    Stack(){
        top = top-1;
    }

    /**
     * Function to Perform push operation in stack
     */
    public void pushStack(int var){
        if(top >= max){
            System.out.println("Stack Overflow");

        }
        else{
            stackArray[++top] = var;
            System.out.println("Element Added");
        }
    }
    /**
     * Function to Perform Pop operation in Stack
     */

    public void popStack(){
        if(top < 0){
            System.out.println("Stack Underflow");
        }
        else{
            int var = stackArray[top--];
            System.out.println("Element Removed From Stack");
        }
    }
}

/**
 * Main Class
 */
public class StackImpl {
    public static void main(String[] args) {
        Stack impl = new Stack();
        impl.pushStack(15);
        impl.pushStack(20);
        impl.pushStack(25);
        impl.pushStack(30);
        impl.popStack();
        impl.popStack();
    }
}
