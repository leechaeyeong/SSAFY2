import java.util.Scanner;

public class testmiro {
	public static void main(String[] args) {
		
		int n=10;
		int[][] miro= new int[n][n];
		Scanner scan= new Scanner(System.in);
		
		int x,y;
		for (int j = 0; j <3 ; j++) { //점퍼의 좌표 입력
			
			x=scan.nextInt();
			y=scan.nextInt();
			
			miro[x][y] = 1; //점퍼 표시=1 //?? 오류 왜떠?
			
		}
		
		
	}
}
