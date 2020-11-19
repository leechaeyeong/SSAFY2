import java.util.Scanner;

public class 로봇이동거리_1 {
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
		
			for (int a = 0; a < arr.length; a++) {
				for (int b = 0; b < arr.length; b++) {

					if(arr[a][b] =='A') {
						for (int c =b+1 ; c < arr.length; c++) {
							if(arr[a][c]=='S') {
								cnt++;
							}
							else if(arr[a][c]=='W'||arr[a][c]=='A'||
									arr[a][c]=='B'||arr[a][c]=='C')
							{
								break;
							}
						}
					}
					else if(arr[a][b] =='B') {
						for (int c =b-1 ; c >=0; c--) {
							if(arr[a][c]=='S') {
								cnt++;
							}
							else if(arr[a][c]=='W'||arr[a][c]=='A'||
									arr[a][c]=='B'||arr[a][c]=='C')
							{
								break;
							}
						}
						for (int c =b+1 ; c < arr.length; c++) {
							if(arr[a][c]=='S') {
								cnt++;
							}
							else if(arr[a][c]=='W'||arr[a][c]=='A'||
									arr[a][c]=='B'||arr[a][c]=='C')
							{
								break;
							}
						}
						
					}
					else if(arr[a][b] =='C') {
						for (int c =b-1 ; c >=0; c--) {
							if(arr[a][c]=='S') {
								cnt++;
							}
							else if(arr[a][c]=='W'||arr[a][c]=='A'||
									arr[a][c]=='B'||arr[a][c]=='C')
							{
								break;
							}
						}
						for (int c =b+1 ; c < arr.length; c++) {
							if(arr[a][c]=='S') {
								cnt++;
							}
							else if(arr[a][c]=='W'||arr[a][c]=='A'||
									arr[a][c]=='B'||arr[a][c]=='C')
							{
								break;
							}
						}	
						for (int d =a-1 ; d >=0; d--) {
							if(arr[d][b]=='S') {
								cnt++;
							}
							else if(arr[d][b]=='W'||arr[d][b]=='A'||
									arr[d][b]=='B'||arr[d][b]=='C')
							{
								break;
							}
						}
						for (int d =a+1 ; d < arr.length; d++) {
							if(arr[d][b]=='S') {
								cnt++;
							}
							else if(arr[d][b]=='W'||arr[d][b]=='A'||
									arr[d][b]=='B'||arr[d][b]=='C')
							{
								break;
							}
						}

					}

				}
			}

			System.out.println("#"+(i+1)+" "+cnt);

		}
		
	}//main
}

