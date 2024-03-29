/* STACK CLEAR OPERATION
Problem Statement: Implement a function to clear all elements from a stack,
effectively resetting it to be empty. Ensure your program can handle
attempting to clear an already empty stack.
Objective: Learn how to manage and reset the state of a stack, which is useful
in applications where the stack's contents need to be reinitialized.*/

import javax.sound.midi.Soundbank;
import java.util.Stack;

public class StackTask {
    public static void main(String[] args) {
        //initializing empty stack
        Stack<Integer> myStack = new Stack<>();

        //pushing 5 elements to stack
        for (Integer i = 0; i < 5; i++) {
            myStack.push(i);
        }
        System.out.println("\nStack: " + myStack);

        //attempting to clear an already empty stack
        clearStack(myStack);
    }

    private static void clearStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            stack.clear();
            System.out.println("\nStack has been cleared successfully");
        } else {
            System.out.println("\nStack is already empty. Nothing to clear.");
        }
    }
}
