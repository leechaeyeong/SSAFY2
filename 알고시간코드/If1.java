import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//계산기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int firstInt = scan.nextInt();
		System.out.println("숫자 입력 : ");
		int secondInt = scan.nextInt();
		System.out.println("연산 부호 + - * / 입력 : ");
		char giho = scan.next().charAt(0);
		
		if(giho == '+') 
			System.out.println("연산 결과 : " + (firstInt+secondInt));
		
		else if(giho =='-')
			System.out.println("연산 결과 : " + (firstInt-secondInt));
		
		else if(giho =='/')
			System.out.println("연산 결과 : " + (firstInt/secondInt));
		
		else if(giho =='*')
			System.out.println("연산 결과 : " + (firstInt*secondInt));
		
		else
			System.out.println("부호 틀림");
		
	}

}
