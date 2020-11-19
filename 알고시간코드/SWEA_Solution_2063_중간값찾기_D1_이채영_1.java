import java.util.Arrays;
import java.util.Scanner;

public class SWEA_Solution_2063_중간값찾기_D1_이채영 {
	
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		
		n= scan.nextInt();
		int m = 0;
		int []input=new int[n];
		
		for (int i = 0; i < n; i++) {
			input[i] = scan.nextInt();

		}
		Arrays.sort(input);
		
		
		System.out.println(input[n/2]);
	}

}
