import java.util.Scanner;

public class BAEKJOON_로또 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0)
				break;

			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			} // end of input

			int[] paper = new int[6];
			lotto(0,0, arr, paper,0);
			System.out.println();
		} // end of while
	} // end of main


	public static void lotto(int arrIndex,int loIndex, int[] arr, int[] lotto,int count){
		if(count==6) {
			for (int i = 0; i < arrIndex; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();

		}
		else if(arrIndex == 6){

		}
		else if(loIndex >= arr.length){
		}
		else{
			lotto[arrIndex] = arr[loIndex];
			lotto(arrIndex+1,loIndex+1,arr,lotto,count+1);
			lotto(arrIndex, loIndex+1,arr,lotto,count);
		}
	}
} // end of class