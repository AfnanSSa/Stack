/* PARENTHESES MATCHING IN EXPRESSION
Simplified Problem Statement: Given a string containing only parentheses ( and ),
use a stack to check whether the parentheses are correctly balanced.
Objective: This introduces you to using stacks for balancing symbols, which is a
foundational concept for parsing expressions or syntax in programming languages.*/

import java.util.Scanner;
import java.util.Stack;

public class StackTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompting user to enter a string that has only parentheses
        System.out.println("\nEnter a string containing only parentheses: ");
        String input = scanner.nextLine();
        System.out.println("\nEntered parentheses are balanced? " + isBalanced(input));
    }
    //method to check if parentheses in the input are balanced
    public static boolean isBalanced(String input){
        Stack<Character> myStack = new Stack<>();
        for (Character c : input.toCharArray()){
            if (c=='(' || c=='[' ||c=='{' ||c=='<'){
                //if one of the opening parentheses is in user input, then push it to the stack
                myStack.push(c);
            } else if (c==')' || c==']' ||c=='}' ||c=='>'){
                //if one of the closing parentheses is in user input, then check if stack is empty
                //if stack is empty, then there is no matching parentheses, so return FALSE.
                if (myStack.isEmpty()){
                    return false;
                }
                Character topParentheses = myStack.pop();
                if ((c == ')' && topParentheses != '(') || (c == '}' && topParentheses != '{')
                        || (c == ']' && topParentheses != '[') || (c == '<' && topParentheses != '>')){
                    return false;
                }
            }
        }
        // After processing all characters, the stack should be empty if the parentheses are balanced
        return myStack.isEmpty(); //TRUE if balanced, FALSE if not balanced
    }

}