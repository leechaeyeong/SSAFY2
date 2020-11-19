package jungol;
import java.util.Scanner;

public class Main_557 {
	
public static void main(String[] args) {//1 4 7
		
		char[] ch = new char [10];
		String s;
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			s=scan.next();
			ch[i]=s.charAt(0);
		}
		
		System.out.print(ch[0]+" "+ch[3]+" "+ch[6]);
			

	}
}
