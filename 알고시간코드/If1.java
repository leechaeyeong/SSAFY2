import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int firstInt = scan.nextInt();
		System.out.println("���� �Է� : ");
		int secondInt = scan.nextInt();
		System.out.println("���� ��ȣ + - * / �Է� : ");
		char giho = scan.next().charAt(0);
		
		if(giho == '+') 
			System.out.println("���� ��� : " + (firstInt+secondInt));
		
		else if(giho =='-')
			System.out.println("���� ��� : " + (firstInt-secondInt));
		
		else if(giho =='/')
			System.out.println("���� ��� : " + (firstInt/secondInt));
		
		else if(giho =='*')
			System.out.println("���� ��� : " + (firstInt*secondInt));
		
		else
			System.out.println("��ȣ Ʋ��");
		
	}

}
