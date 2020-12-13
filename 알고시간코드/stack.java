import java.util.Scanner;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();
		int[] isp = {-1,2,1,0};
		/* 
		 * )    -1
		 * *,/   2
		 * +,-   1
		 * (     0
		 */
		int[] icp = {-1,2,1,3};
		/* 
		 * )    -1
		 * *,/   2
		 * +,-   1
		 * (     3
		 */
		String s = sc.next();
		//System.out.println(s);
		//System.out.println(s);
		if(Integer.parseInt(s) > 0)
			System.out.println(Integer.parseInt(s));;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				
			}
		}
		
	}
}
