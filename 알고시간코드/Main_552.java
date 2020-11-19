import java.util.Scanner;

public class Main_552 {
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		
		/*
		for (int i = 0; i < n; i++) {
			
			for (int j = i-1; j >=0 ; j--) {
				System.out.print(" "); //빈칸
			}
			
			for (int j = n*2-1 ; j>(2*i) ; j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		// 정피라미드
		
		/*
		char c = 'A';
		for (int i = 0; i < n; i++) {
			
			for (int j = n-1; j >i ; j--) {
				System.out.print(" "); //빈칸
			}
			
			for (int j = 0 ; j<=(2*i) ; j++) {
				
				System.out.print(c);
				c++;
			}
			
			System.out.println();
		}
		*/
		
	
	}
}
