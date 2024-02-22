/* CHECK IF STACK IS EMPTY
Problem Statement: Write a function that checks whether a stack is
empty and returns true if it is, or false otherwise. Test your function by
checking an empty stack and a stack with elements.
Objective: Practice checking the state of a stack (empty or not).*/

import java.util.Stack;

public class StackTask {
    public static void main(String[] args){
        //initializing empty stack
        Stack<Integer> myStack = new Stack<>();

        //adding 3 elements to the stack
        for(Integer i=0; i<=2; i++){
            myStack.push(i);
        }

        // Printing true if stack is empty, true if stack is not empty
        System.out.println("\nStack is empty? " + myStack.isEmpty());
    }
}
