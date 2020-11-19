import java.util.Scanner;

public class Solution32 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int T=scan.nextInt();
		
		for (int t = 0; t < T; t++) {
			int n=scan.nextInt();
			int m=scan.nextInt();
			
			int[][] arr= new int[n][m];
			int N=scan.nextInt();
			
			for (int x = 0; x < arr.length; x++) {
				for (int y = 0; y < arr.length; y++) {
					arr[x][y]=scan.nextInt();
				}//나눠주기
			}
			
			int[] userx = new int[N]; //x
			int[] usery = new int[N]; //시작위치 y
			int[] ujump = new int[N];
			
			for (int i = 0; i < N; i++) { //참가자수 좌표
				userx[i] = scan.nextInt(); //x
				usery[i] = scan.nextInt(); //시작위치 y
				ujump[i] = scan.nextInt();
			}
			
			int trap =scan.nextInt(); //함정 수
			
			int[] trapx= new int[trap];
			int[] trapy= new int[trap];
			for (int i = 0; i < trap; i++) { //함정 좌표 입력
				trapx[i]= scan.nextInt();
				trapy[i]= scan.nextInt();
			}
			//여기까지 입력
			
			//점프하기
			int money =-1000*N;
			
			for (int i = 0; i < N; i++) { //참가자당 하고 상금 합계 출력하기
				
				int dir=0, jump=0;
				
				for (int j = 0; j < ujump[i]; j++) {
					
					//다시 점프해야할 때 오류 생김
					dir = arr[userx[i]-1][usery[i]-1] /10; // 방향
					jump = arr[userx[i]-1][usery[i]-1] %10; //점프 횟수
					
					if(dir ==1) //우
					{
						usery[i] += jump;
						
						if(usery[i]>m) //(1,1) 조건 생각하기 !
						{
							money -=1000;
							break; //범위 외 사망
						}
						//함정 비교
						for (int k = 0; k < trapy.length; k++) { //
							
							if(trapx[k] ==userx[i] &&trapy[k] ==usery[i])
							{
								money -=1000;
								//사망임
								//나가야함 - 아직 해결못함 
								break;
							}
								
						}
					}
					else if(dir ==2) //하
					{			
						userx[i] += jump;
						
						if(userx[i]>n)
						{
							money -=1000;
							break; //범위 외 사망
						}
						//함정 비교
						for (int k = 0; k < trapy.length; k++) { //
							
							if(trapx[k] ==userx[i] &&trapy[k] ==usery[i])
							{
								money -=1000;
								//사망임
								//나가야함 - 아직 해결못함 
								break;
							}
								
						}
						
					}
					else if(dir==3) //좌
					{
						usery[i] -= jump;
						
						if(usery[i]<0) //(1,1) 조건 생각하기 !
						{
							money -=1000;
							break; //범위 외 사망
						}
						//함정 비교
						for (int k = 0; k < trapy.length; k++) { //
							
							if(trapx[k] ==userx[i] &&trapy[k] ==usery[i])
							{
								money -=1000;
								//사망임
								//나가야함 - 아직 해결못함 
								break;
							}
								
						}
					}
					else if(dir ==4) //상
					{
						userx[i] -= jump;
						
						if(userx[i]<0)
						{
							money -=1000;
							break; //범위 외 사망
						}
						//함정 비교
						for (int k = 0; k < trapy.length; k++) { //
							
							if(trapx[k] ==userx[i] &&trapy[k] ==usery[i])
							{
								money -=1000;
								//사망임
								//나가야함 - 아직 해결못함 
								break;
							}
								
						}
					}
					
					if(j==ujump[i]-1) //점프 끝이면
					{
						money += arr[userx[i]-1][usery[i]-1] *100;
					}
				}
			}
			System.out.println(money);

		}//for testcase 
	}
}
