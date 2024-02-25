/* CREATING STATIC STACK
• Problem Statement: Implement a static stack that can hold up to 10 integers.
Write functions for push and pop operations and ensure that your program can
handle stack overflow and underflow conditions.
• Objective: Get hands-on experience with stack implementation and handling edge cases.*/

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTask {
    private static final Integer maxSize = 10;
    private static Stack<Integer> myStack = new Stack<>();
    public static void main(String[] args) {
        //pushing elements into the stack
        for (Integer i=0; i<=10; i++){
            if (isFull()){
                System.out.println("\n**STACK OVERFLOW**\nStack is full, cannot add a new element.");
                break;
            }
            push(i); /*This will cause stack overflow, commenting this out will cause stack underflow*/
        }
        //popping element from the stack
        if (!isEmpty()){
            System.out.println("\nRemoved element: " + pop());
        }

        //trying to pop an element from empty stack to test underflow error
        try{
            pop();
        } catch (EmptyStackException e){ //if this error occurred then prompt user
            System.out.println("\n**STACK UNDERFLOW**\nStack is empty, cannot remove element.");
        }
    }

    //push method
    public static void push(Integer element){
        if(isFull()) {
            throw new StackOverflowError("\nSTACK OVERFLOW");
        }
            myStack.push(element);
    }

    //pop method
    public static Integer pop(){
        if (myStack.isEmpty()){
            throw new EmptyStackException();
        }
            return myStack.pop();

    }
    //method to check if stack is full
    public static boolean isFull(){
        return myStack.size()==maxSize;
    }
    //method to check if stack is empty
    public static boolean isEmpty(){
        return myStack.isEmpty();
    }
}
