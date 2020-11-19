import java.util.Scanner;

public class SWEA_Solution_1204_최빈수구하기_D2_이채영 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T;
		T=scan.nextInt();
		
		//학생 수 1000명

		int[] test=new int[T]; //테스트 횟수
		int[] maxarr=new int[T];
		
		for (int testcase = 0; testcase < test.length; testcase++) { // t만큼
			
			int[] score = new int[1000];
			int  n;
			n=scan.nextInt();
			
			for (int i = 0; i < score.length; i++) { //점수 입력
				score[i]=scan.nextInt();
			}
			int[] numcnt = new int[101]; //점수 들어있음 
			
			//최빈값 구하기
			for (int i = 0; i < numcnt.length; i++) {
				for (int j = 0; j < score.length; j++) {
					if(score[j]==i)
						numcnt[i]++;
				}
			}
			
			int max=0;
			int maxindex=0;

			for (int i = 0; i <numcnt.length ; i++) {
				if(max<=numcnt[i])
				{	
					max=numcnt[i];
					//maxindex=i;
				}
				
			}
			
			for (int j = numcnt.length-1; j >=0 ; j--) {
				if(max==numcnt[j])
				{	
					maxindex=j;
					break;
				}
			}
			//System.out.println(maxindex);
			maxarr[testcase] = maxindex;
			System.out.println("#"+(testcase+1)+" "+maxarr[testcase]);
		}
		
		//for (int testcase = 0; testcase < test.length; testcase++)
			
		
	}
}
