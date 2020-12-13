import java.util.Stack;

/**
 * stack : 선형 자료구조 LIFO 구조
 */
public class Z12_Stack {
	public static int[] s = new int[3];
	public static int top = -1;

	public static void main(String[] args) {
//		push(1);
//		push(2);
//		push(3);
//		push(4);
//		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
		
//		API 활용하기		
//		Stack st = new Stack();
//		st.push(4);
//		st.push(5);
//		st.push(6);
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
		
		int[] stack = new int[4];
		int topp = -1;
		stack[++topp] = 10;
		stack[++topp] = 20;
		stack[++topp] = 30;
		System.out.println(stack[topp--]);
		System.out.println(stack[topp--]);
		System.out.println(stack[topp--]);
	} // end of main

//	/** 스택에서 데이터 삭제 */
//	public static int pop() {
//		if (isEmpty()) {
//			System.out.println("underflow Error");
//			return -1;
//		} else {
//			// return s[top--];
//			int data = s[top];
//			top--;
//			return data;
//		}
//	}
//
//	public static boolean isEmpty() {
//		return top == -1;
//	}
//
//	/** 스택에 데이터 삽입 */
//	public static void push(int data) {
//		if (isFull()) { // 꽉찼니?
//			System.out.println("overflow Error");
//		} else {
//			top++;
//			s[top] = data;
//		}
//	}
//
//	/** 스택이 꽉찼는지 판별 */
//	public static boolean isFull() {
//		return top == s.length - 1;
//	}
} // end of class
