package com.Collections.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter expression: ");
		String expression = sc.nextLine();
		
		boolean isBalanced = isExpressionBalanced(expression);
		
		if(isBalanced) {
			System.out.println("The expression is balanced.");
		} else {
			System.out.println("The expression is not balanced.");
		}
	}

	private static boolean isExpressionBalanced(String expression) {
		Stack<Character> stack = new Stack<>();
		
		for(char ch : expression.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if(ch == ')' || ch == '}' || ch == ']') {
				if(stack.isEmpty())
					return false;
				
				char top = stack.pop();
				if(!isMatchingPair(top, ch)) 
					return false;
			}
		}
		return stack.isEmpty();
	}
	private static boolean isMatchingPair(char open, char close) {
		
		return (open == '(' && close == ')')||(open == '{' && close == '}')||
				(open == '[' && close == ']');	
	}
}
