/* Reverse Numbers Using Stack
• Problem Statement: Write a program that reads N numbers from the user,
stores them in a stack, and then prints these numbers in reverse order
by popping them from the stack.
• Objective: Learn how a stack can be used to reverse the order of elements.*/

import java.util.Stack;
import java.util.Scanner;

public class StackTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //initializing empty stack
        Stack<Integer> myStack = new Stack<>();

        //prompting user and enter number of elements (stack length)
        System.out.println("\nEnter number of elements: ");
        Integer number = scanner.nextInt();

        //reading n number user pushed them to stack
        System.out.println("\nEnter "+number +" element(s)");
        for (Integer i=0; i<number; i++){
            Integer element = scanner.nextInt();
            myStack.push(element); //adding elements to the stack
        }

        //printing elements in reverse by popping them from the stack
        System.out.println("\nElements in reversed order: ");
        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
    }
}
