/**
 * Subset : 부분집합
 * PowerSet(멱집합) : 어떤 집합의 모든 부분집합을 원소로 갖는 집합
 * 		반복문 - 노가다
 * 		바이너리카운팅
 * 		재귀함수
 */
public class Z05_Subset {
	public static void main(String[] args) {
		
		/*
		int[] a = {-7,-3,-2,5,8};
		
		//반복문
		for (int i = 0; i < 2; i++) { //첫 번 째 원소를 사용할지 여부를 결정할 변수 i
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					for (int l = 0; l < 2; l++) {
						for (int m = 0; m < 2; m++) {
							int sum=0;
							if(i==1) {System.out.print(a[0]+" "); sum+=a[0];}
							if(j==1) {System.out.print(a[1]+" "); sum+=a[1];}
							if(k==1) {System.out.print(a[2]+" "); sum+=a[2];}
							if(l==1) {System.out.print(a[3]+" "); sum+=a[3];}
							if(m==1) {System.out.print(a[4]+" "); sum+=a[4];}
							System.out.println("\t : 합"+sum);
						}
					}
				}
			}
		}
		*/

		//모든 부분집합 : 멱집합(바이너리 카운팅 이용하기)
		
		int[] z= {-7,-3,-2,5,8};
		
		for (int i = 0; i < (1<<z.length); i++) { //2^5 =32 원소가 5개여서 0~32개까지
			if((i & 0b1) != 0)// 가장 낮은 자리수 1의 자리를 비트마스킹 하자
				System.out.print(z[0]+",");
			if((i & 0b10) !=0) // 2의 자리
				System.out.print(z[1]+",");
			if((i & 0b100) !=0) // 3의 자리
				System.out.print(z[2]+",");
			if((i & 0b1000) !=0) // 4의 자리
				System.out.print(z[3]+",");
			if((i & 0b10000) !=0) // 5의 자리
				System.out.print(z[4]+",");
			System.out.println();
		}
		
	}//end of main
}
