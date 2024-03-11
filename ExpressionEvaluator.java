/* Expression Evaluator
* Objective:
* Develop a Java program capable of evaluating simple arithmetic expressions.
* The expressions may include the four basic arithmetic operations: addition (+),
* subtraction (-), multiplication (*), and division (/). Additionally, the expressions
* can contain parentheses ((, )) to alter the precedence of operations. The program must
* accurately compute the result of the given expression, adhering to the conventional
* order of operations, also known as operator precedence.
* Requirements:
* The program should support basic arithmetic operations: addition, subtraction, multiplication, and division.
* The program must correctly handle the use of parentheses to change the order of operations.
* The input will be a string representing the arithmetic expression.
* The output should be the evaluated result of the expression.
* Assume that all input expressions are valid and division by zero will not be tested.
* Implement error handling for unexpected situations, such as invalid input formats.*/

import java.util.Scanner;
import java.util.Stack;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter an arithmetic expression: "); //prompting user to input arithmetic expression
        String input = scanner.nextLine();

        /*Error handling*/
        if (input == null || input.isEmpty()) { //if input is empty
            System.out.println("\nEmpty Input - Enter a valid expression!"); //prompting error message to user
        } else { //if input is not empty
            try { //valid expression
                //call evaluate expression method
                System.out.println("Result: " + evaluateExpression(input));
            } catch (Exception e) { //invalid expression
                System.out.println("\nInvalid Expression");
            }
        }
    }

    public static Integer evaluateExpression(String expression) {
        Stack<Integer> numberStack = new Stack<>(); //stack to store numbers
        Stack<Character> operatorStack = new Stack<>(); //stack to store operators '+', '-', '*', '/'

        //iterating through string
        for (Integer i = 0; i < expression.length(); i++) {
            Character character = expression.charAt(i);

            if (character == ' ') {
                continue; //ignoring empty spaces (' ')
            }

            if (Character.isDigit(character)) { //if character is a number, convert it to integer
                Integer number = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    number = number * 10 + (expression.charAt(i) - '0'); //extracting number from the string
                    i++;
                }
                i--; //adjusting index after converting character to integer
                numberStack.push(number); //pushing the number to number stack

            } else if (character == '(') { //if character is an opening bracket

                operatorStack.push(character); //pushing the bracket to the operator stack

            } else if (character == ')') { //if character is a closing bracket
                //checking stack is not empty and the top element is not an opening bracket
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    //calling method to apply operators
                    applyOperator(numberStack, operatorStack);
                }
                operatorStack.pop(); //popping the opening brackets

            } else if (isOperator(character)) {
                while (!operatorStack.isEmpty() &&
                        operatorPrecedence(operatorStack.peek()) >= operatorPrecedence(character)) {
                    //calling method to apply operators
                    applyOperator(numberStack, operatorStack);
                }
                //pushing operator to operator stack
                operatorStack.push(character);
            }
        }
        while (!operatorStack.isEmpty()) {
            applyOperator(numberStack, operatorStack);
        }
        //returning the value
        return numberStack.pop();
    }

    //method to check if character is an operator
    public static Boolean isOperator(Character operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }

    //method to get precedence of the operator
    public static Integer operatorPrecedence(Character operator) {
        switch (operator) {
            //in case operator is + or -
            case '+':
            case '-':
                return 1;

            //in case operator is * or /
            case '*':
            case '/':
                return 2;

            default:
                return 0; //lowest value of precedence
        }
    }

    //method to perform operators
    public static Integer performOperations(Integer firstNumber, Integer secondNumber, Character operator) {
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            default:
                return 0;
        }
    }

    //method to apply operations on numbers
    public static void applyOperator(Stack<Integer> numberStack, Stack<Character> operatorStack) {
        /*getting numbers from number stack*/
        Integer secondNumber = numberStack.pop();
        Integer firstNumber = numberStack.pop();
        //getting operator from operator stack
        Character operator = operatorStack.pop();
        //performing the operation
        Integer result = performOperations(firstNumber, secondNumber, operator);
        numberStack.push(result); //pushing result to stack
    }
}
