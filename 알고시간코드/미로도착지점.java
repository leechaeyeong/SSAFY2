import java.util.Scanner;

public class 미로도착지점 {
	public static void main(String[] args) {
		//11 시작
		//방향과 몇칸이동 >점퍼 or 칸을 벗어남 >00
		//도착지점 출력
		
		Scanner scan= new Scanner(System.in);
		int T=scan.nextInt();
		
	
		for (int i = 0; i <T; i++) {
			
			int n=scan.nextInt();
			int sx=scan.nextInt();
			int sy=scan.nextInt();
			int jumper = scan.nextInt();//점퍼의 개수
			
			int[][] miro= new int[n+1][n+1];
			
			
			int x=0;
			int y=0;
			for (int j = 0; j <jumper ; j++) { //점퍼의 좌표 입력
				
				x=scan.nextInt();
				y=scan.nextInt();
				
				miro[x][y] = 1; //점퍼 표시=1 //?? 오류 왜떠?
				
			}

			int dirnum= scan.nextInt(); //이동지시개수
			//상 1 하 3 좌 4 우 2
			
			
			for (int j = 0; j < dirnum; j++) {
				int cdir = scan.nextInt(); //방향
				int cxy = scan.nextInt(); //이동칸
				
				if(miro[sx][sy]==1) //점퍼
				{
					sx=0;
					sy=0;
				}
				
				if(cdir==1) //상
				{
					if(sx-cxy>=0)
						
						sx = sx-cxy;
					else
					{
						sy=0;
						sx=0;
					}
				}
				else if(cdir ==2) //우
				{
					if(sy+cxy<n+1)
						sy = sy+cxy;
					else
					{
						sy=0;
						sx=0;
					}
					
				}
				else if(cdir ==3) //하
				{
					if(sx+cxy<n+1)
						sx = sx+cxy;
					else
					{
						sy=0;
						sx=0;
					}
				}
				else if(cdir ==4) //좌
				{
					
					if(sy-cxy>=0)
						sy=sy-cxy;
					else
					{
						sy=0;
						sx=0;
					}
				}	
			}
			System.out.println(sx+" "+sy);

		}
	}
}
