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

            //TODO - Your CODE goes HERE
            /**
             *  Code
             */
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

