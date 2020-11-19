import java.util.Arrays;

/** 연습문제*/

/*public class Z02_Gravity {
	public static void main(String[] args) {
		int[] box= {7,4,2,0,0,6,0,7,0};
		
		int[][] map = new int[8][9];
		
		//map 배열에 box 값을 넣어서 0 1로 채운다
		
		int line=8;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				
				if(box[j]==line)
				{
					map[i][j] = 1; //i=1
					//map[i+1][j]=1; //i=2
					
					//7-> 1,0 2,0 3,0 ....
					
				}
			}
			line--;
		}
		
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
				
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		
		//가로 세로를 바꾼다 >회전 후 결과로
		
		//중력을 작용시킨다

		//낙차..?
		
	}//end of main
}*/

//위는 내가 짠 코드
//많이 짜는 연습하기 _1

public class Z02_Gravity {
	public static void main(String[] args) {
		int[] box= {7,4,2,0,0,6,0,7,0};
		
		int[][] map = new int[8][9];

		//박스 1, 빈칸 0, 회전, 중력, 낙차(최대값)
		//1=>2차원 배열로 변환
		//map 생성
		for (int c = 0; c < box.length; c++) { //열 우선
			for (int r = map.length-1; r >=0 ; r--) { // 밑에서 부터 채우기
				if(box[c] <= 0)
				{
					break;
				}
				map[r][c] =1;
				box[c]--;
				
			}
		}
		//회전
		int[][] room = new int[9][8];
		
		for (int i = 0; i < room.length; i++) { //9
			for (int j = 0; j < room[i].length; j++) { //8
				room[i][j]=map[map.length-1-j][i];
			}
		}
		//중력 => 박스를 아래쪽(바닥으로 옮기기),  밑 칸 부터
		// 아래쪽 박스부터 떨어뜨리자: 현재칸은 박스이고, 아래칸이 비어있으면, 값을 바꿈
		int max=0;
		for (int r = room.length-2; r >=0 ; r--) { //행, 가장아래줄은 안떨어짐
			for (int c = 0; c < room[r].length; c++) { //열
				int cnt=0; //낙차를 카운팅
				for (int i = 0; r+1+i<room.length; i++) {//바닥에 닿을 때 까지 or 박스에 닿을 때 까지 내리기
					if(room[r+i][c]==1 && room[r+1+i][c]==0) { //내릴수 있는 상황이면  = 나는 상자, 아래칸은 빈칸
						room[r+i][c]=0;
						room[r+1+i][c]=1;
						cnt++;
					}
				}
				if(max<cnt) {
					max=cnt;
				}
				//System.out.print(cnt+" ");
			}
			//System.out.println();
		}
		
		System.out.println("최대 낙차 : "+max);
		//결과를 출력
		//System.out.println(Arrays.toString(box)); //1차원 배열의 원소를 문자열로 표시
		
		for (int i = 0; i < room.length; i++) {
			System.out.println(Arrays.toString(room[i]));
		}
		//System.out.println(map.length); //8
		
	}
}

//방법2
/*
public class Z02_Gravity {
	public static void main(String[] args) {
		int[] box= {7,4,2,0,0,6,0,7,0};
		
		// 같은 줄에서 가장 많이 떨어질 수 있는 박스는 꼭대기 박스
		// 떨어지는 낙차 = 나보다 오른쪽에 있는 박스가 나보다 작은 숫자의 개수
		int max =0;
		
		for (int i = 0; i < box.length; i++) { //길이 9 (바닥이 9)
			int cnt=0;
			for (int j = i+1; j < box.length; j++) {
				if(box[i] > box[j]){
					cnt++;
				}
			}
			System.out.print(cnt+" ");
			
			if(max<cnt)
				max=cnt;
			
		}
		System.out.println();
		System.out.println("최대 낙차 : "+max);
	}
}
*/