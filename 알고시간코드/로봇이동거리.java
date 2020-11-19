import java.util.Scanner;

public class 로봇이동거리 {
	public static void main(String[] args) {
		int testcase;
		Scanner scan= new Scanner(System.in);
		testcase= scan.nextInt();
		
		
		for (int i = 0; i < testcase; i++) {
			
			int n=scan.nextInt(); 
			char[][] arr = new char[n][n];
			
			
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < arr.length; k++) {
					arr[j][k] = scan.next().charAt(0);
				}
				
			} //배열 생성
			
			
			//a 오른쪽, b 좌우, c 상하좌우
			int cnt =0;
			int x=0, y=0;
			int dir = 0; //a :1, b:2, c:3
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					
					x=k; //초기값 가지고 
					y=j;
					
					if(arr[j][k] =='A')
						dir = 1;
					else if(arr[j][k] =='B')
						dir=2;
					else if(arr[j][k] =='C')
						dir =3;
					
					if(dir ==1)
					{
						if(arr[j][x+1] =='S') //벽 만날 때 까지
						{
							x++;
							cnt++;
						}	
					}
					else if(dir ==2)
					{
						if(arr[j][x-1] =='S')
						{
							x--;
							cnt++;
						}
						else if(arr[j][x+1] =='S')
						{
							x++;
							cnt++;
						}
						
					}
					else if(dir ==3)
					{
						if(arr[j][x-1] =='S')
						{
							x--;
							cnt++;
						}
						else if(arr[j][x+1] =='S')
						{
							x++;
							cnt++;
						}
						else if(arr[j-1][k] =='S')
						{
							j--;
							cnt++;
						}
						else if(arr[j+1][k] =='S')
						{
							j++;
							cnt++;
						}
					}
				}
			}
			
			
	
			
			System.out.println(cnt);
			
			
			
		}
		
	}//main
}
