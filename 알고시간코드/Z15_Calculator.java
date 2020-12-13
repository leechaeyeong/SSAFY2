import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * 계산기1 중위표기식 => 후위표기식 (스택을 사용) 6 + 5 * ( 2 - 8 ) / 2 -9
 */

public class Z15_Calculator {
	public static void main(String[] args) throws FileNotFoundException {
//		파일 입력처리
		System.setIn(new FileInputStream("test2.txt"));
		Scanner sc = new Scanner(System.in);		
		
//	문자열 입력처리		
//	String string = "6 + 5 * ( 2 - 8 ) / 2 -9";
//	Scanner sc = new Scanner(new StringReader(string));
		
//	Scanner sc = new Scanner(System.in); // 키보드
//	sc.nextLine(); // 엔터가 입력될때까지의 한줄을 버퍼에서 읽어온다.
//	// 엔터는 제거 후 문자열을 리턴(String타입)
//	=====================================================
//	sc.next();
//	sc.nextInt();
//	sc.nextBoolean();
//	sc.nextDouble();
//	// 기본형 타입계열 메서드	
//	지정한 타입의 데이터를 버퍼에서 읽어온다
//	데이터 앞의 화이트스페이스를 제거하고 데이터만 리턴한다	

		String str = sc.nextLine();
		String[] srr = str.split(" ");

		char[] stackOp = new char[20];
		int top = -1;
		for (int i = 0; i < srr.length; i++) {
			char c = srr[i].charAt(0);
			switch (c) { // int형 범위 이하의 정수 or String 문자열
			case '(': // 스택에 무조건 넣는다
				stackOp[++top] = c;
				break;
			case '*': // 스택에 2보다 작은 우선순위가 있을 때까지 꺼내서 출력
			case '/':
				while(top >= 0 && (stackOp[top] == '*' || stackOp[top] == '/')) {
					System.out.print(stackOp[top--] + " ");
				}
				stackOp[++top] = c;		
				break;
			case '+': // 스택에 1보다 작은 우선순위가 있을 때까지 꺼내서 출력
			case '-':
				while(top >= 0 && (stackOp[top] == '*' || stackOp[top] == '/' || stackOp[top] == '+' || stackOp[top] == '-')) {
					System.out.print(stackOp[top--] + " ");
				}
				stackOp[++top] = c;
				break;
			case ')': // ( 여는 괄호가 나올때까지 모두 빼서 출력
				while(top >= 0 && stackOp[top] != '(') {
					System.out.print(stackOp[top--] + " ");
				}
				if(top >= 0 && stackOp[top] == '(') { // ( 괄호가 반드시 있겠지만, 확인해줌
					top--;
				}
				break;
			default: // 피연산자 (숫자)
				System.out.print(srr[i]+" ");
				break;
			} // end of switch
			
		} // end of for
		while(top > -1) {
			System.out.print(stackOp[top--] + " ");
		}

//		if (c == '(') {
//			
//		} 
//		else if (c == '*') {
//			
//		} else if (c == '/') {
//
//		} else if (c == '+') {
//
//		} else if (c == '-') {
//
//		} else if (c == ')') {
//
//		} else {
//			
//		} // else 부분에 숫자를 체크하는데 숫자가 입력값의 절반을 차지하기 때문에
//		//if를 다 거치면서 오므로 시간낭비다 => switch~case를 사용하자 

//	Stack st = new Stack();
//	System.out.println(Arrays.toString(srr));
//	for (int i = 0; i < srr.length; i++) {
//		if(srr[i] == "(") {
//			st.push(srr[i]);
//		}
//		else if(srr[i] == ")") {
//			while(true) {
//				if(st.peek() == "(")
//					break;
//				else
//					st.pop();
//			}
//		}        
//		else if(srr[i] == "*") {
//			
//		}        
//		else if(srr[i] == "*") {
//			
//		}       
//		else if(srr[i] == "+"){
//			    
//		}        
//		else if(srr[i] == "-") {
//			              
//		}
//		else {
//			System.out.println(srr[i] + " ");
//		}
//	}
		// System.out.println(Arrays.toString(srr));
	} // end of main
} // end of class
