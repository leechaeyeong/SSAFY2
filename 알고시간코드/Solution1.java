import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int TC = sc.nextInt(); //테스트 케이스 개수
		
		for (int testCase = 1; testCase <= TC; testCase++) {
			//10개의 숫자를 입력받아, 홀수들의 합을 출력
			int sum=0;
			for (int i = 0; i < 10; i++) {
				
				int num = sc.nextInt();
				if(num%2 != 0) //num이 홀수냐?
					sum+=num;
			}
			System.out.println("#"+testCase+" "+sum);
			
		}
		
	}//end of main
}
