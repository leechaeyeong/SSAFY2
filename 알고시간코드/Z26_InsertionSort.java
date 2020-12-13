import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

/*
 * 삽입정렬 O[n^2]
 * LinkedList, ArrayList
 */
public class Z26_InsertionSort {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		
		int[] arr = new int[60000];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(arr.length);
		}
		//System.out.println(Arrays.toString(arr));
//		int[] arr = {5,7,2,9,3,6,1,4,8};
		
//		LinkedList<Integer> ll = new LinkedList<Integer>(); // 정렬된 데이터를 담기 2133ms 3000개
		ArrayList<Integer> ll = new ArrayList<Integer>(); // 				13ms 3000개
		
		for (int i = 0; i < arr.length; i++) {
			int index = 0;
			for (index = 0; index < i; index++) {
				if(arr[i] < ll.get(index)) { // get으로 인한 손실이 크다
					break;
				}
			}
			ll.add(index, arr[i]); // 삽입
		}
		System.out.println(ll);
		System.out.println(System.currentTimeMillis() - time + "ms");
	} // end of main
} // end of class
