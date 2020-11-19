/**
 * stack : 선형 자료구조
 * 		LIFO 구조
 * 			
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class 스택 {
	
	/**
	 * 스택 연습문제1
	 * 내가 짠 것
	 */
	/*
	static int top =-1;
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		int[] stack = new int[3];

		//3개의 데이터
		for (int i = 0; i < 3; i++) {
			push(stack,i);
		}
		System.out.println("push : "+Arrays.toString(stack));
		
		for (int i = 0; i < 3; i++) {
			pop(stack);
		}
		System.out.println();
		System.out.println("stack : "+Arrays.toString(stack));
	}
	public static void push(int[] st,int i)
	{
		st[i] = scan.nextInt();
		top++;
	}
	public static void pop(int[] st)
	{
		System.out.print("pop :"+ st[top]+" ");
		st[top] = 0;
		top--;
	}
	*/
	
	/**
	 * 스택 연습문제1
	 * 수업 코드1
	 */
	
	public static int[] stack = new int[3];
	public static int top =-1;
	public static void main(String[] args) {
		//push(1);
		//push(2);
		//push(3);
		//push(4);
		
		//System.out.println(pop());
		//System.out.println(pop());
		//System.out.println(pop());
		//System.out.println(pop());
		
//api 활용하기 (stack code 2)
		//Stack<String> st= new Stack<String>();
		/*
		Stack st= new Stack(); 
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		*/
		
		
		int[] s = new int[3]; //배열을 넉넉하게 잡기 (최적화 하지 않아도 괜찮음)
		int topp= -1;
		
		s[++topp] = 10;
		s[++topp] = 20;
		s[++topp] = 30;
		
		System.out.println(s[topp--]);
		System.out.println(s[topp--]);
		System.out.println(s[topp--]);
		
		

		
	}//end of main
	/**스택에서 데이터 삭제
	 *  */
	public static int pop() {
		if(isEmpty()) //비었어?
		{
			System.out.println("underflow error");
			return -1; // exception handling 예외처리하기
		}
		else {
		/*
		int data = stack[top];
		top--;
		return data;
		*/
		return stack[top--];
		}
	}
	public static boolean isEmpty() {
		
		return top==-1;
	}
	/**스택에 데이터 삽입*/
	public static void push(int data) {
		
		if(isFull()) //꽉 찾나?
		//if(top == stack.length-1)
		{
			System.out.println("overflow error");
		}
		else
		{
			top++;
			stack[top] = data;
		}
		
	}
	/**스택이 꽉찼는지 판별*/
	public static boolean isFull() {
		
		return top==stack.length -1;
	}
	

	
	
}//end of class
