/* COUNT ELEMENTS IN STACK
Problem Statement: Implement a function to count the number of elements in a stack
without removing any of them. Hint: You might need to use a temporary stack to hold
elements while you count them.
Objective: Understand how to interact with a stack while preserving its contents.*/

import javax.print.attribute.standard.Finishings;
import java.util.Stack;
import java.util.WeakHashMap;

public class StackTask {
    public static void main(String[] args){
        //initializing empty stack
        Stack<Integer> myStack = new Stack<>();

        //adding 3 elements to the stack
        for(Integer i=0; i<=2; i++){
            myStack.push(i);
        }

        //initializing temporary stack
        Stack<Integer> tempStack = new Stack<>();
        Integer count = 0;
        //counting elements in stack
        while (!myStack.isEmpty()){
            tempStack.push(myStack.pop()); //transferring stack elements to the temporary stack
            count++;
        }
        while (!tempStack.isEmpty()){
            myStack.push(tempStack.pop()); //transferring elements back to the stack
        }
        // Printing element count
        System.out.println("\nNumber of elements in the stack is: " + count);
    }
}
