
/**
 * 계산기2
 * 후위표기식 => 계산 (스택)
 */

import java.util.Scanner;
import java.util.Stack;

public class Z16_Calculator2 {
	public static void main(String[] args) {
		String sss = "6 5 2 8 - * 2 / +";
		String[] str = sss.split(" ");

		int[] stackNum = new int[str.length];
		int top = -1;
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < stackNum.length; i++) {
			char c = str[i].charAt(0);
			int num1, num2;
			switch (c) {
			case '+':
				num2 = stack.pop();
				num1 = stack.pop();
				stack.add(num1 + num2);
				break;
			case '-':
				num2 = stack.pop();
				num1 = stack.pop();
				stack.add(num1 - num2);
				break;
			case '*':
				num2 = stack.pop();
				num1 = stack.pop();
				stack.add(num1 * num2);
				break;
			case '/':
				num2 = stack.pop();
				num1 = stack.pop();
				stack.add(num1 / num2);
				break;
			default: // 숫자(피연산자)
				stack.add(Integer.parseInt(str[i]));
				break;
			}

		}
		System.out.println(stack.peek());
	} // end of main
} // end of class
