package jungol;
import java.util.Scanner;

public class Main_555 {
	public static void main(String[] args) {
		
		char[] ch = new char [10];
		String s;
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			s=scan.next();
			ch[i]=s.charAt(0);
		}
		for(int i=0;i<10;i++)
			System.out.print(ch[i]);
			

	}
	
	//
	
}
