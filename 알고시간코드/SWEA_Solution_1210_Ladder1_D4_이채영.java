import java.util.Scanner;

public class SWEA_Solution_1210_Ladder1_D4_이채영 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int T = 10; // 테스트 케이스

		int x = 0;
		int[] path = new int[T]; //출력 배열
		int k=0;
		
		for (int t = 0; t < T; t++) {

			int testcase= scan.nextInt(); //몇 번째 테스트 케이스인지 입력받기 (상관없음)
			
			int[][] ladder = new int[100][102];
			
			for (int i = 0; i < 100; i++) { //배열에 사다리 입력받기
				for (int j = 1; j < 101; j++) {
					ladder[i][j] = scan.nextInt();
				}
			} 
			
			for (int i = 0; i < 101; i++) { //100
				
				if (ladder[0][i] == 1) // 사다리 기준 찾기 -> 조건에 맞으면 새로운 배열에 넣기
				{
					x = i-1; //조건
					
					int  j=0;
					int dir=0; //0아래, 1왼쪽, 2 오른쪽
					
					while(j < 100) //아래로 진행
					{
						if (ladder[j][i]==2 && j==99) { //2일때 끝
							
							
							path[k]=x;//
							k++;
							i=x+1;
							break;
				
						}
						else if(j==99) //사다리 끝에 도착
						{
							i=x+1; //i 원래 상태로 변경하기
							break;
						}
						
						if(dir==0) //아래
						{
							if (i-1>=0 && ladder[j][i - 1] == 1 ) //왼쪽
								dir = 1;
							else if ((i+1)>=0 && ladder[j][i + 1] == 1) //오른쪽
								dir = 2;	
						}
						if (dir ==1 )// 왼쪽
						{
							
							i--;
							if(ladder[j][i-1] ==0) 
							{
								j++;
								dir = 0;
							}
						} 
						else if (dir==2) // 오른쪽 진행
						{
							i++;
							if(ladder[j][i+1]==0)
							{
								j++;
								dir=0;
							}
						}
						else
							j++;
					}
					
				}
			}//사다리 결과 찾기	
		}//testcase 10번
		for (int i = 0; i < T; i++) {
			System.out.println("#"+(i+1)+" "+path[i]);
		}	
	}//end of main
}
