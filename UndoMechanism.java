/* SIMPLE UNDO MECHANISM
Problem Statement: Simulate a very simple undo mechanism using a stack.
Every time a user types a character, push it onto the stack. If the
user hits undo (you can simulate this with a command), pop the last
character from the stack and print the current state of the text.
Objective: Apply stack operations to solve a real-world problem.*/

import java.util.Stack;
import java.util.Scanner;

public class StackTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //initializing empty stack
        Stack<Character> myStack = new Stack<>();

        //assuming user typed 'undo'
        while (true){ //infinite loop
            System.out.println("\nEnter a character or type undo: ");
            String input = scanner.nextLine();

            //checking if user input is 'undo' using .equalsIgnoreCase to compare
            if (input.equalsIgnoreCase("undo")){
                if (!myStack.isEmpty()){
                    Character removeChar = myStack.pop(); //removing element
                    //printing the removed element
                    System.out.println("\nUndo: removed character: '" + removeChar + "' from stack");
                    //printing current state of the stack
                    System.out.println("\nCurrent stack: ");
                    if(myStack.empty()){
                        System.out.println("[Empty]");
                    } else {
                        for(Character c : myStack){
                            System.out.println(c);
                        }
                    }
                } else {
                    System.out.println("\nNothing to undo. Stack is Empty.");
                }
            } else {
                //assuming user entered a single character
                if (input.length()==1){
                    Character newChar = input.charAt(0); //extracting the first character from user input
                    myStack.push(newChar); //adding the new character to the stack
                    System.out.println("\nCurrent stack: "); //printing current state of stack
                    if (myStack.isEmpty()){
                        System.out.println("[Empty]");
                    } else {
                        for(Character c : myStack){
                            System.out.println(c);
                        }
                    }
                } else {
                    System.out.println("\nEnter a character or type undo: ");
                }
            }
        }
    }
}
