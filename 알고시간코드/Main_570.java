package jungol;

public class Main_570 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
			arr[0][i] =1;
		}
		
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0;i < arr.length; i++) {
				
				arr[i][j]=arr[i-1][j] + arr[i][j-1];
				
				//11 12 13 14 01 020304 10 11 12 13
				//21
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
