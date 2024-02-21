/* STACK INITIALIZATION
• Problem Statement: Write a program to initialize an empty stack.
  Ensure that your stack can hold up to 10 integers.
• Objective: Familiarize yourself with the basic structure of a stack.*/

import java.util.Stack;

public class StackTask {
    public static void main(String[] args){
        //initializing empty stack
        Stack<Integer> myStack = new Stack<>();

        //setting size of the stack to 10
        myStack.setSize(10);
    }
}
