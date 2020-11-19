/**
 * IM 준비용
 * 코드 블럭
 */
public class Z00_1234 {
	public static void main(String[] args) {
		// swap 값의 교환
		int a=3;
		int b=4;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		
		
		
		int[] arr= {3,5,1,2,7,4};
		//원소의 총합
		int sum=0; // 연산자의 항등원
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		
		int[] brr= {3,5,1,2,7,4};
		int key =20;
		//존재유무
		
		for (int i = 0; i < brr.length; i++) {
			if(key==brr[i])
			{	
				System.out.println("있다");
				break;
			}
			else {
				if(i==brr.length-1)
					System.out.println("없다");
			}
		}
		//1
		boolean check = false; // 플래그 변수 - 빠름 **
		for (int i = 0; i < brr.length; i++) {
			if(brr[i]==key)
			{
				System.out.println("있다");
				check = true;
				break;
			}
		}
		if(!check)
		{	
			System.out.println("없다");
		}
		//2 - 편리성
		for (int i = 0; i < brr.length; i++) {
			if(key==brr[i])
			{	
				System.out.println("있다");
				break;
			}
			if(i== brr.length-1) {
				System.out.println("없다");
			}
		}
		
		
		
		int[] crr = {3,3,2,1,4,3,3,2,1};
		key=3;
		// 빈도수 체크
		int cnt=0;
		for (int i = 0; i < crr.length; i++) {
			if(key ==crr[i])
				cnt++;
		}
		System.out.println(cnt);
		
		
		int[] drr = {3,3,2,1,4,3,3,2,1};
		//정렬
		int[] count = new int[5]; //4번 index까지 사용할 수 있도록
		int cnt1=0; // count[1]
		int cnt2=0; // count[2]
		int cnt3=0;
		int cnt4=0;
		
		for (int i = 0; i < drr.length; i++) {
			
				count[drr[i]]++;
		}
		System.out.println(count[1]+","+count[2]+","+count[3]+","+count[4]);
		//112233334 
		//카운팅 정렬 < 퀵정렬 (속도)
		
		/*
		 for (int i = 0; i < drr.length; i++) {
			if(drr[i]==2)
				count[2]++;
		}
		for (int i = 0; i < drr.length; i++) {
			if(drr[i]==3)
				count[drr[i]]++;
		}
		for (int i = 0; i < drr.length; i++) {
			if(drr[i]==4)
				count[drr[i]]++;
		}
		 */
		
		int[] err= {3,5,1,2,7,4};
		// 3개 이상의 데이터를 비교시 max 변수를 두는 것이 효율적이다
		//int max= Integer.MIN_VALUE; 
		int max= err[0];
		// 초기값 중요
		// 1. 이 세상에서 가장 작은 값 (int 형 범위의 가장 작은 값)
		// 2. 원소 중 하나의 값으로 초기화
		// 
		//최댓값
		for (int i = 0; i < err.length; i++) {
			if(max<err[i])
				max=err[i];
		}
		System.out.println(max);
		

		
	} //end of main
}// end of class
