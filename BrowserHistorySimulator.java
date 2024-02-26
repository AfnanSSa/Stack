/* BROWSER HISTORY SIMULATION
Problem Statement: Simulate a browser's back button using a stack. Allow the
user to enter webpage URLs, push each URL onto a stack as they are visited,
and pop the last URL when the user hits the back button.
Objective: Explore a practical application of stacks in managing history or
navigation states.*/

import java.util.Scanner;
import java.util.Stack;

public class StackTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> historyStack = new Stack<>();
        System.out.println("\nEnter a URL or type 'back' to go to the previous webpage\nor type 'quit' to quit.");

        while (true){
            System.out.println("\nEnter a URL or a command: ");
            String input = scanner.nextLine().trim(); //getting input from user and remove any spaces at the end
            if (input.equalsIgnoreCase("quit")){
                //quitting the program
                System.out.println("\nQuitting History Browser Simulator...");
                break;
            } else if (input.equalsIgnoreCase("back")){
                //cif user wants to go to previous webpage
                if (!historyStack.isEmpty()){
                    String previousWebpage = historyStack.pop();
                    System.out.println("\nGoing back to: " + previousWebpage);
                } else {
                    System.out.println("\nNo history - cannot go back!");
                }

            } else {
                //if user entered another inputs, it is assumed that is an url
                System.out.println("\nCurrent page: " + input);
                historyStack.push(input); //pushing url to history stack
            }
            //printing the entire stack
            System.out.println("\nBrowsing History: ");
            for (Integer i=historyStack.size()-1; i>=0; i--){
                System.out.println(historyStack.get(i));
            }
        }

    }
}
