/**
 * 변수 종류 : 
 */
public class Z09_variable {
	//전역변수는 메서드 밖, 클래스 안에 위치한다
	int b; //전역변수 = 초기값이 들어간다 - instance 변수 <객체를 만들어야 사용할 수 있음. 
	static int c; //전역변수 초기값이 들어간다 - static 변수
	//각 타입의 초기값
	//정수 : 0
	//실수 : 0.0
	//문자 : '\u0000'
	//논리 : false
	//참조형 : null

	public static void main(String[] args) {
		int d; //지역변수 < 메서드 안쪽에서 선언 : 초기값이 들어가지 않는다. 
		//System.out.println(d); //초기화 안하면 에러
		
		String s4= new String("hi"); // 객체를 생성하는 FM 방법 > 이렇게 사용하지 않기 
		String s5= new String("hi"); // 객체를 생성하는 FM 방법
		String s6 = "hi"; // > 이렇게 사용하기
		String s7 = "hi"; //문자열만 기본형타입처럼 생성하는 것을 허용
		System.out.println(s4 == s5); // false 변수에 주소가 들어있음. heap
		System.out.println(s6 == s7); // true 상수풀 classArea
		System.out.println(s4.equals(s5)); //내용물 비교
		System.out.println(s6.equals(s7)); //내용물 비교
		
	}// end of main
	
	public static void a() {
		
	}
}// end of class
