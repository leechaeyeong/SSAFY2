
public class Z03_순열 {
	public static void main(String[] args) {
		//두 가지
		
		// 0 1 2
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==j)
					continue; //가장 가까운 반복문의 다음 차수로 넘어가기(위)
				System.out.println(i+","+j+","+(3-i-j)); //세 수의 합 무조건 3
				
			}
		}
		
		//4 7 9
		System.out.println();
		
		int[] arr= {4,7,9};
		
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
		//int형 이하의 타입(byte, short, char, int),의 이항연산시 int 형으로 자동형변환 된다
		 
		 
	}
}
