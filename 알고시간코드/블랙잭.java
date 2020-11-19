import java.util.Scanner;

public class 블랙잭 {
	public static void main(String[] args) {
		
		//카드 합 최대로
		//3명
		//n장의 카드 > 숫자 m???
		//n장 중 3장 > 3장 합 <m m과 최대한 가깝게
		//3장의 합 출력
		Scanner scan= new Scanner(System.in);
		int N, M;
		N=scan.nextInt();
		int[] card = new int[N];
		
		for (int i = 0; i < card.length; i++) {
			card[i]=scan.nextInt();
		}
		
		// m을 넘지 않으면서 최대한 가까운 카드 3장의 합>>
		
		//3개 더해서 나올 수 있는 값 다 구하기
		int[] arr= {4,7,9,0,8};
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==j)
					continue; //가장 가까운 반복문의 다음 차수로 넘어가기(위)
				for (int k = 0; k <3; k++) {
					if (i == k || j == k)
						continue;
					System.out.println(arr[i]+","+arr[j]+","+arr[k]);
					//System.out.println(i+","+j+","+k);
				}
			}
		}
		
		
		
	}
}
