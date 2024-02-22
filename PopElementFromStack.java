/* POP AN ELEMENT FROM STACK
Problem Statement: Assuming you have a stack with some integers, write a
function to remove (or "pop") an element from the stack. Print the element that
was removed and the current stack contents.
Objective: Learn how elements are removed from a stack and how the LIFO principle works.*/

import java.util.Stack;

public class StackTask {
    public static void main(String[] args){
        //initializing empty stack
        Stack<Integer> myStack = new Stack<>();

        //adding 10 elements to the stack
        for(Integer i=0; i<=10; i++){
            myStack.push(i);
        }

        //removing 1 element from the stack
        System.out.println("\nRemoving an element from the stack:");
        for (Integer i=0; i<1; i++){
            Integer removedElement = myStack.pop();
            System.out.println("Element " + removedElement + " has been removed");
        }
        // Printing element count
        System.out.println("\nCurrent elements of stack "+ myStack.toString() );
    }
}
