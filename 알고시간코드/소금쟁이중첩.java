import java.util.Scanner;

public class 소금쟁이중첩 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int T=scan.nextInt();
		
		for (int i = 0; i < T; i++) {
			
			int n=scan.nextInt(); //9
			int so=scan.nextInt(); //5
			
			int[][] arr=new int[n][n]; //연못
		

			int[] sonum= new int[so];
			int cnt=0;
			for (int j = 0; j < so; j++) { //방향을 입력
				int x,y,d;
				x=scan.nextInt();
				y=scan.nextInt();
				d=scan.nextInt();
				arr[x][y]=d;
				
			}

		
			//???
			
			
			
			
		}
		
	}
}
