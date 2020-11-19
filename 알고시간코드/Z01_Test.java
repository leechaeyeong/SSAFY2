import java.util.Scanner;

//한줄 주석
/* 여러줄 주석, 부분주석
 * 
 * */

/** 문서주석
 * 처음만드는 클래스입니다
 * 클래스, 메서드, 변수의 선언부 앞에 작성해서 부가적인 설명을 달아줌
 * @저자
 *  */

public class Z01_Test {

	public static void main(String[] args) {
		
	
		for(int i=0;i<8;i=i+2) //for (int j = 0; j < args.length; j++, j++) 가능 

		{
			
			for(int j=0;j<9;j++)
			{
				
				System.out.printf("%d * %d = %2d",i+2,j+1,(i+2)*(j+1));
				System.out.print("\t\t");
				System.out.printf("%d * %d = %2d",i+3,j+1,(i+3)*(j+1));
				System.out.println();
			}
			System.out.println();
			
		}
		// 기본형, 참조형 (크기를 몰라서 간접으로 4byte = 32bit/ hip stack class area 32bit면 충분
		// hip 사이즈가 작게 설정이 되어있음.
		// 기본형타입 8가지
		// 정수형 byte(1), short(2), "int"(4) - 21억, long(8)
		// 실수형 float(4) - long보다 숫자의 표현 범위가 크다(부동소수점), "double"(8) = 정수형 보다 연산이 더 오래걸림
		// 문자형 char(2) - c언어는 (1)
		// 논리형 boolean(1)
		
		// 문자열 String class - 
		String s = "a";
		System.out.println(s);
		s="hi"+"hello"; //문자열 끼리의 덧셈연산은 이어붙여준다
		
		System.out.println(s);
		s="hi"+3; //문자열 + 비문자열 : 비문자열을 문자열로 변경해줌
		System.out.println(s);

		s=3+4+"hi"; // 7hi 비문자열 + 문자열
		System.out.println(s);

		s = 3+4+"hi"+3+4;
		System.out.println(s); //7hi34, 문자열 + 비문자열
		
		char cc = ' '; //숫자로 저장됨 (유니코드 표), 한 글자만 가능, 빈칸이라도 넣어야됨
		
		String str = "abcdefghij";
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		
		// 자바의 흐름제어 : if~else, switch~case, 삼항연산자
		// 자바의 반복문 : for, while, do~while
		// 배열 
		int []a; // 배열의 선언
		a = new int[3]; // 배열의 객체 생성(메모리확보) , 각 타입의 초기값으로 초기화된다
		//char [] b = new char[3]; // 0들어감, string null
		a[0] = 1; //초기화
		
		
		int[] b = new int[3]; // 배열의 선언과 생성을 한번에 , []를 타입 뒤쪽에 쓰는 것을 권장
		b[0] = 1;
		
		int []c = {1,2,3}; // 배열의 선언과 생성, 초기화를 한 번에
//배열 = 객체(자바에서)
		
		
		int []d = new int[] {1,2,3}; //배열의 선언과 생성, 초기화를 한 번에, 익명배열 사용시 < 타입 지정
		
		for (int i = 0; i < d.length; i++) {
			
		}
		
		int[][] e;
		
		//자바의 입력방법 : Scanner, BufferedReader - 더 빠름, JOptionPane
		Scanner sc = new Scanner(System.in); //키보트의 기본 입력값을 받는다, 입력받기 위해서 스캐너 개체는 한 번만 선언하면 됨
		//sc.next(); // 입력값을 String형으로 리턴
		//sc.nextInt(); // 입력값을 int형으로 리턴
		//char은 없음
		//sc.nextLine(); // next와 둘 중 하나만 사용하기 ->next사용
		
		System.out.println("나이를 입력하세요");
		int age=sc.nextInt();
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		
		System.out.println(name + "씨 나이가 "+age +"살이군요");
		
		
	}//end of main

}//end of class
