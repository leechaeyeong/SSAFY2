import java.util.Scanner;

public class P3Miro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		int arrSize = 0, startX=0, startY=0, cntJumper=0;
		int [][] arr = null;
		for(int tc=0; tc<testCase; tc++) {
			arrSize = scan.nextInt();
			arr = new int[arrSize+1][arrSize+1];
			startY = scan.nextInt();
			startX = scan.nextInt();
			cntJumper = scan.nextInt();
			int jumperX = 0, jumperY = 0;
			for(int jp=0; jp<cntJumper; jp++) {
				jumperY = scan.nextInt();
				jumperX = scan.nextInt();
				arr[jumperY][jumperX] = 1;
			}//for jp
			int cntMove=0, direct=0, dist=0;//이동 지시 개수, 방향, 거리.
			int lastY = startY, lastX = startX;
			cntMove = scan.nextInt();
			for(int move=0; move<cntMove; move++) {
				direct = scan.nextInt();
				dist = scan.nextInt();
				if(direct == 1) {
					lastY = lastY - dist;
					if(lastY <= 0 || arr[lastY][lastX] == 1) {
						lastY = 0;
						lastX = 0;
						break;
					}
				} else if(direct == 3) {
					lastY = lastY + dist;
					if(lastY > arrSize || arr[lastY][lastX] == 1) {
						lastY = 0;
						lastX = 0;
						break;
					}
				} else if(direct == 2) {
					lastX = lastX + dist;
					if(lastX > arrSize || arr[lastY][lastX] == 1) {
						lastY = 0;
						lastX = 0;
						break;
					}
				} else if(direct == 4) {
					lastX = lastX - dist;
					if(lastX <= 0 || arr[lastY][lastX] == 1) {
						lastY = 0;
						lastX = 0;
						break;
					}
				}
			}//for move
			System.out.println("#" + (tc+1) + " " + lastY + " " + lastX);
		}//for tc
	}//main

}
