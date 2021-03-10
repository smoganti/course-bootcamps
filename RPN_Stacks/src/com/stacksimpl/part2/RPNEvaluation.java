package com.stacksimpl.part2;

import java.io.*;
import java.util.*;


// Java Program to find the
// solution of the arithmetic
// using the stack
class solution {
    public int stacky(String[] tokens)
    {

        // Intialize the stack and the variable
        Stack<String> stack = new Stack<String>();
        int x, y;
        String result = "";
        int get = 0;
        String choice;
        int value = 0;
        String p = "";

        // Iterating to the each character
        // in the array of the string
        for (int i = 0; i < tokens.length; i++) {


            // If the character is not the special character
            // ('+', '-' ,'*' , '/')
            // then push the character to the stack
            if (tokens[i] != "+" && tokens[i] != "-"
                    && tokens[i] != "*" && tokens[i] != "/") {
                stack.push(tokens[i]);
                continue;
            }
            else {
                // else if the character is the special
                // character then use the switch method to
                // perform the action
                choice = tokens[i];
            }

            // Switch-Case
            switch (choice) {
                case "+":

                    // Performing the "+" operation by poping
                    // put the first two character
                    // and then again store back to the stack

                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x + y;
                    result = p + value;
                    stack.push(result);
                    break;

                case "-":

                    // Performing the "-" operation by poping
                    // put the first two character
                    // and then again store back to the stack
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x - y;
                    result = p + value;
                    stack.push(result);
                    break;

                case "*":

                    // Performing the "*" operation
                    // by poping put the first two character
                    // and then again store back to the stack

                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x * y;
                    result = p + value;
                    stack.push(result);
                    break;

                case "/":

                    // Performing the "/" operation by poping
                    // put the first two character
                    // and then again store back to the stack

                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y / x;
                    result = p + value;
                    stack.push(result);
                    break;

                default:
                    continue;
            }

        }

        // Method to convert the String to integer
        return Integer.parseInt(stack.pop());
    }
}

class RPNEvaluation {

    public static void main(String[] args)
    {
        // String Input
        String[] s
                = { "10", "6", "9", "3", "+", "-11", "*",
                "/", "*", "17", "+", "5", "+" };

        solution str = new solution();
        int result = str.stacky(s);
        System.out.println(result);
    }
}

