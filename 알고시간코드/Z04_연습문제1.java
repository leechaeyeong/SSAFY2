import java.util.Arrays;

public class Z04_연습문제1 {
	public static void main(String[] args) {
		int[][] a= new int[5][5]; //2차원 배열 선언
		//배열값 초기화
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = i*5+j;
			}
		}
		//배열 출력
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	
		System.out.println();
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				//a[i][j] 칸에 상하좌우 차이의 절대값을 합하자
				//int sum=0;
				if(i-1>=0) {//a[i][j] 상 a[i-1][j]
					
					int diff=a[i][j]-a[i-1][j];
					if(diff<0)
						diff=-diff; //abs
					sum+=diff;
				}
				if(i+1<a.length ) {//하
					int diff=a[i][j] - a[i+1][j];
					if(diff <0) diff =-diff;
					sum+=diff;
				}
				if(j-1>=0) {//좌
					
					int diff=a[i][j]-a[i][j-1];
					if(diff<0)
						diff=-diff; //abs
					sum+=diff;
				}
				if(j+1<a.length ) {//우
					int diff=a[i][j] - a[i][j+1];
					if(diff <0) diff =-diff;
					sum+=diff;
				}
				//System.out.printf("%2d ",sum);
			}
		}
		System.out.println(sum);
		
		//델타 사용
		System.out.println(">>>>>>>>>>>>델타 사용해보기<<<<<<<<<");
		
		int[] dr= {-1,1,0,0}; //상하좌우
		int[] dc= {0,0,-1,1};
		int total =0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				//if문 
				for (int k = 0; k < dc.length; k++) {
					if(i+dr[k]<0 || i+dr[k]>=a.length ||
							j+dc[k] >=a.length ||j+dc[k] <0)continue;
					
					int diff=a[i+dr[k]][j+dc[k]] - a[i][j];//
					if(diff<0)
						diff =-diff;
					total += diff;
				}
			}	
		}
		System.out.printf("%2d ",total);
	}
}
