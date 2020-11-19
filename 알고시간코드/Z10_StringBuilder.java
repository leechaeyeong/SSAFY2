/**
 * String
 * StringBuffer 	멀티쓰레드용 (여러사람 가능)
 * StringBuilder	단일쓰레드용 (1인용) - 알고리즘일 때 사용
 */
public class Z10_StringBuilder {
	public static void main(String[] args) {
		
		String str = "hello";
		System.out.println(str+"a");
		System.out.println(str.concat("a"));
		System.out.println(str);
		
		StringBuilder sb= new StringBuilder("hello"); // 뒤에는 각 타입의 초기값이 들어감 (빈공간 추가 16칸)
		System.out.println(sb);
		System.out.println(sb.append("a")); //+연산 안돼서 append 사용
		System.out.println(sb); //메서드 호출 후 원본이 변경된다.
		System.out.println(sb.reverse());
		
		String s = "apple";
		//String -> StringBuilder 로 변경하기
		
		StringBuilder sbb= new StringBuilder(s); //문자열 넣기
		System.out.println(sbb.reverse());
		//StringBuiler -> String 으로 변경하기
		s = sbb.toString(); //모든 타입을 문자열로 변경하기
		System.out.println(s);
		
		
		
		s = "apple";
		System.out.println(new StringBuilder(s).reverse().toString());
		
		
	}//end of main
}//end of class
