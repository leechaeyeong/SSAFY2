import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class 스택2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		char[] stack = new char[100]; //배열을 넉넉하게 잡기 (최적화 하지 않아도 괜찮음)
		int top=-1;
		
		//System.out.println(s.charAt(1));
		
		/*
		stack[++top] = '(';
		s[++to] = 20;
		s[++to] = 30;
		
		System.out.println(s[top--]);
		System.out.println(s[top--]);
		System.out.println(s[top--]);
		*/
		
		System.out.println(s.length());
		for (top = -1; top < s.length(); ) {
			
			++top;
			stack[top] = s.charAt(top); //오류
			
			if(stack[top] == ')' && stack[top-1] =='(')
				System.out.println(stack[top--]);
			
		}
		for (int i = 0; i < s.length(); i++) {
			if(top==-1)
			{
				
			}
		}

		
		
		
		
		
		
	}
}
