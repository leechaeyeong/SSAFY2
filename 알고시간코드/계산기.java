/**
 * 계산기1
 * 		중위표기식 => 후위표기식(스택을 사용)
 * 6 + 5 * ( 2 - 8 ) / 2
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class 계산기 {
	public static void main(String[] args) throws FileNotFoundException {
		
		//파일 입력처리
		System.setIn(new FileInputStream("abc.txt")); //파일 위치는 프로젝트 밑에 있어야함
		Scanner scan= new Scanner(System.in);
		
		
		//문자열 입력처리
		/*
		String string = "6 + 5 * ( 2 - 8 ) / 2";
		Scanner scan = new Scanner(new StringReader(string));
		*/
		
		//키보드 입력처리
		//Scanner scan= new Scanner(System.in); //키보드 입력
		
		
		String s=scan.nextLine(); // 엔터가 입력 될 때 까지 한 줄을 버퍼에서 읽어온다  **
		// 엔터는 제거 후 문자열을 리턴 (String 타입)
		//=================================================================
		//scan.next();
		//scan.nextInt();
		//scan.nextBoolean();
		//scan.nextDouble();
		//기본형 타입계열 메서드
		//지정한 타입의 데이터를 버퍼에서 읽어온다
		//데이터 앞의 화이트스페이스 (_\t\n\r)를 제거하고 데이터만 리턴한다
		
		//혼용해서 사용하면 좋지 않다.
		String[] srr = s.split(" ");
		
		char[] stackop = new char[100]; // 연산자만 담을 스택
		int top = -1;
		//System.out.println(Arrays.toString(srr));
		for (int i = 0; i < srr.length; i++) {

			char c = srr[i].charAt(0);
			switch (c) { //조건 값 (int 형 범위 이하의 정수 or string 문자열) // if문보다 빠르게 비교가능
			case '(': // 스택에 무조건 넣음
				stackop[++top]=c; 
				break;
			case '*': //두개가 같은 우선순위라서!
			case '/': // 스택에 우선순위 2보다 작은 우선순위(+-)가 있을 때까지 꺼내서 출력
				
				while(top >=0 && (stackop[top]=='*'||stackop[top]=='/')) {
					System.out.print(stackop[top--]+" ");
				}
				stackop[++top] =c;
				break;
			case '+': // 스택에 우선순위 1보다 작은 우선순위())가 있을 때까지 꺼내서 출력
			case '-':
				while(top >=0 && (stackop[top]=='*'||stackop[top]=='/'
				||stackop[top]=='+'||stackop[top]=='-')) 
				{
					System.out.print(stackop[top--]+" ");
				}
				stackop[++top] =c;
				break;
			case ')': // 여는 괄호가 나올때까지 모두 빼서 출력
				while(top >=0 && stackop[top]!= '(')
				{
					System.out.print(stackop[top--]+" ");
				}
				if(top >=0 && stackop[top]=='(') //중복확인해줌 (괄호가 반드시 있겠지만, 확인해줌)
				{
					top--;
				}
					
				break;
			default: //else 와 같음 //피연산자 숫자
				System.out.print(srr[i]+" ");
				break;

			}//end of switch
		}//end of for
		
		//스택에 남은 연산자 출력하기
		while(top >-1)
		{
			System.out.print(stackop[top--]+" ");
		}
		

		
	}//end of main
}//end of class
