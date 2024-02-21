/* PRINT STACK ELEMENTS
• Problem Statement: Write a function to print all elements in a stack from
  top to bottom. Ensure that the stack remains unchanged after printing.
• Objective: Learn to access and display all elements in a stack.*/

import java.util.Stack;

public class StackTask {
    public static void main(String[] args){
        //initializing empty stack
        Stack<Integer> myStack = new Stack<>();

        //adding 10 elements to the stack
        for(Integer i=0; i<=10; i++){
            myStack.push(i);
        }

        // Printing elements of the stack without modifying it
        System.out.println("Stack elements from top to bottom:");
        for (Integer i = myStack.size() - 1; i >= 0; i--) {
            System.out.println(myStack.get(i));
        }
    }
}
