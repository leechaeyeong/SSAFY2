import java.util.Scanner;

public class 패턴마디의길이_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T =scan.nextInt();
		
		for (int t = 0; t < T; t++) {
		
			String s =scan.next();
			//1글자 0<= <1 1<= <2
			//2글자 0<= <2 2<= <4
			//10글자 0<= <10 10<= <20
			
			int i;
			for (i = 1; i <=10; i++) { //0<= < i
				String sub1 =s.substring(0,i);
				String sub2 =s.substring(i,2*i);
				if(sub1.equals(sub2))
					break;
			}
			System.out.println("#"+(t+1)+" "+i);
			
			
			StringBuilder ss1= new StringBuilder("abc");
			StringBuilder ss2 = new StringBuilder("abc");
			System.out.println(ss1 ==ss2);
			System.out.println(ss1.equals(ss2));
			System.out.println(ss1.toString().equals(ss2.toString()));
	
		}
	}
}
