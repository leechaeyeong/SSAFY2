import java.util.Scanner;

public class �����˻�_��ä�� { //binary search
	public static void main(String[] args) {
		
		int key;
		int[] arr= {10,22,35,42,55,60,79,86,92,109}; //���ĵ� ����
		
		int start = 0;
		int end = arr.length-1;
		int mid;
		int index = 0;
		
		Scanner scan = new Scanner(System.in);
		key=scan.nextInt(); //��ǥ��
		
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
		
		System.out.println(index); //�� ��° ��ġ�� �ִ��� ����ϱ� 
		
	}
}
