import java.util.Arrays;
import java.util.Scanner;

//1

public class Solution {
	public static void main(String[] args) {
		
		int T=0;
		
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt(); //테스트케이스 개수
		
		int arrcnt[]=new int[T]; //출력 배열
		
		for (int testCase = 0; testCase < T; testCase++) 
		{
			String test=scan.next();//실제 테스트 입력
			
			int len = test.length();
			int cnt =0;
			int i=0;
			int j=0;
			boolean stop = false;
			
			for (i = 0; i < len; i++) 
			{
				if(stop==true)
					break;
				
				if(test.charAt(i)=='1')
				{	
					cnt++;
					for (j = i+1; j < len; j++) 
					{
						if(test.charAt(j)=='0')
						{	
							cnt++;
							i=j;
							break;
						}
						
						else if(test.charAt(len-1)=='1')
						{
							stop = true;
							break;
						}
					}
				}
			}
			arrcnt[testCase]=cnt;
		}
		
		
		
		for (int testCase = 0; testCase < T; testCase++)  {
			System.out.println("#"+(testCase+1)+" "+arrcnt[testCase]);
		}
	}
} //출력값 맞는뎅..?? 뭐징..????



//2
/*
public class Solution {
	public static void main(String[] args) {
		
		int T=0;
		Scanner scan = new Scanner(System.in);
		
		int N,L;
		
		//테스트 케이스 1개 먼저
		
		N=scan.nextInt(); //5개
		L=scan.nextInt(); //1000
		
		int []ti = new int[N]; 
		int []ki = new int[N];
		int []tres = new int[N];
		int []kres = new int[N];
		int ksum=0;
		
		for (int i = 0; i < N; i++) {
			ti[i]=scan.nextInt();
			ki[i]=scan.nextInt();
		}//선호도 칼로리 입력
		
		int[] temp = new int[N];
		
		
		for (int i = 0; i < N; i++) {
			
			if()
		}
		
		
		
	}
}*/


//3
/*
public class Solution {
	public static void main(String[] args) {
		int T=0;
		Scanner scan = new Scanner(System.in);
		T=scan.nextInt();
		
		int maxlist[]=new int[T];//최장 길이 배열
		
		for (int testCase = 0; testCase < T; testCase++) {
			
			int len =scan.nextInt(); //5
			int[] num =new int[len];
			
			for (int i = 0; i < len; i++) 
				num[i] = scan.nextInt();
			
			int max=0;
			int res=0;
			for (int i = 0; i < num.length-1; i++) {

					res = num[i+1]-num[i];

					if(max<res)
						max=res;

			}
			
			maxlist[testCase]=max;
			
			
		}
		for (int testCase = 0; testCase < T; testCase++) {
			System.out.println("#"+(testCase+1)+" "+maxlist[testCase]);
		}
	}
}
*/
	

