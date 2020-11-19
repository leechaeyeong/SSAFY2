import java.util.Scanner;

public class 이진검색_이채영 { //binary search
	public static void main(String[] args) {
		
		int key;
		int[] arr= {10,22,35,42,55,60,79,86,92,109}; //정렬된 상태
		
		int start = 0;
		int end = arr.length-1;
		int mid;
		int index = 0;
		
		Scanner scan = new Scanner(System.in);
		key=scan.nextInt(); //목표값
		
		while(start <= end)
		{
			mid = (start+end)/2;
			if(arr[mid] ==key) {
				index = mid+1;
				break;
			}
			else if(arr[mid] >key) {
				end=mid-1;
			}
			else start = mid+1;
		}
		
		System.out.println(index); //몇 번째 위치에 있는지 출력하기 
		
	}
}
