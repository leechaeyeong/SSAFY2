import java.util.Arrays;

/**
 * 문자열
 */
public class Z08_String {
	public static void main(String[] args) {
		
		String s= "abcDeFGHij";
		//System.out.println(s);
		
		p(s);
		
		p(s.replace("Def","abababab") +" : 문자열 일부를 변경");
		//String 클래스는 작업 후에도 원본 문자열은 그대로
		p(s.substring(7)+" : 문자열 추출 7번째 ~끝");
		p(s.substring(5,8)+" : 문자열 추출 5번째 ~7"); //시작은 포함, 끝은 미포함
		//오버로딩 기법
		
		String str= "호랑이, 사자, 기린, 토끼, 다람쥐";
		String[] srr=str.split(", "); //정규화 표현식 
		System.out.println(Arrays.toString(srr));
		
		String s2 = "abcdefg";
		for (int i = 0; i < s2.length(); i++) {
			System.out.print(s2.charAt(i)+" ");
		}
		System.out.println();
		char[] crr= s2.toCharArray();
		System.out.println(Arrays.toString(crr)); //아래 방법보다 더 빠르다, 가능하면 이거 사용하기
		
		for (int i = 0; i < crr.length; i++) { //변경해야될 때만 사용하기, 객체도 새로 생성, 복사시간이 걸림
			System.out.print(crr[i]+" ");
		}
		System.out.println();
		
		String s8 = "apple";
		//"pp"제거
		System.out.println(s8.replace("pp", "")); 
		System.out.println(s8);
		
		s8 = "hello";
		for (int i = s8.length()-1; i >=0; i--) {
			System.out.print(s8.charAt(i));
		}
		//원 출력 s8.charAt(s8.length()-1-i)
		System.out.println();
		
		String s9 ="";
		for (int i = 0; i < s8.length(); i++) {
			//s9= s8.charAt(i)+s9; //값이 다름
			s9 = s9+ s8.charAt(i); //서로 값이 다름
		}
		System.out.println(s9);
		
		
		
		
		
		String x;
		
	}//end of main
	public static void p(String str) {
		System.out.println(str);
	}
}//end of class
