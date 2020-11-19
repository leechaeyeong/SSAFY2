
public class test_연습문제1 {
	public static void main(String[] args) {
		int[][] arr=new int[5][5];
		int num=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=num;
				num++;
			}
		}
		//int[] sum= new int[25];
		int sum=0;
		int res=0;
		
		int[] dx= {0,0,-1,1}; //상하좌우
		int[] dy= {-1,1,0,0};
		
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr.length; y++) {
				for (int i = 0; i < 4; i++) {
					//x+dx[mode] >행
					//y+dy[mode] >열
					res = arr[x][y] - arr[x][y]+dx[i];
					if(res<0)
						res = -res;
					sum+=res;
				}
			}
		}
		
	}
}
