/**
 * 2007 패턴 마디의 길이
 */
import java.util.Scanner;

public class 패턴마디의길이 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T =scan.nextInt();
		
		for (int t = 0; t < T; t++) {
		
			String s =scan.next();
			StringBuilder sb = new StringBuilder(s);
//최대 마디 10
			int cnt=0;

			int i,j;
			int k=0;
			
			for (i = 0; i < sb.length()-1; i++) {
				
				for (j=k; j < sb.length(); j++) {
					
					if(s.charAt(i)==s.charAt(j))
					{
						
						i = i+1;
						cnt++;
						k=j+1;
						
						break;
					}
					
				}
			}
			System.out.println(cnt);
	
		}
	}
}
