import java.util.Scanner;

public class P2Strider {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		int arrSize = 0, cntStrider = 0;
		int [][] arr = null;
		for(int tc=0; tc<testCase; tc++) {
			arrSize = scan.nextInt();
			cntStrider = scan.nextInt();
			arr = new int[arrSize][arrSize];

			int y=0, x=0, direct=0, answer=0;
			for(int a=0; a<cntStrider; a++) {
				y = scan.nextInt();
				x = scan.nextInt();
				direct = scan.nextInt();
				if(direct == 1) {
					int tmpY = y;
					for(int b=3; b>0; b--) {
						tmpY = tmpY+b;
						if(tmpY >= arrSize) {
							break;
						} else if(arr[tmpY][x] == 1) {
							answer = a+1;
							break;
						} else {
							arr[tmpY][x] = 1;
						}
					}
				} else if (direct == 2) {//6 2 2
					int tmpX = x;
					for(int b=3; b>0; b--) {
						tmpX = tmpX+b;
						if(tmpX >= arrSize) {
							break;
						} else if(arr[y][tmpX] == 1) {
							answer = a+1;
							break;
						} else {
							arr[y][tmpX] = 1;
						}
					}
				}
			}//for a
			System.out.println("#" + (tc+1) + " " + answer);
		}// for tc
	}//main

}
