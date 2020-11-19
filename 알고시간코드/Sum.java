import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for (int t = 0; t < 10; t++) {
			int[][] arr = new int[100][100];
			int[] sumx = new int[100];
			int[] sumy = new int[100];
			int[] sumxy = new int[2];
			
			int testcase = scan.nextInt();
			for (int i = 0; i < arr.length; i++) { //입력
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = scan.nextInt();
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				//행
				for (int j = 0; j < arr.length; j++) {
				//열
					sumx[i] += arr[i][j];
					sumy[i] += arr[j][i];
					if(i==j)
						sumxy[0] += arr[i][j];
					else if(i+j ==arr.length)
						sumxy[1]+= arr[i][j];
				}
			}

			Arrays.sort(sumx);
			Arrays.sort(sumy);
			Arrays.sort(sumxy);
			
			int[] total = {sumx[sumx.length-1],sumy[sumy.length-1],
					sumxy[sumxy.length-1]};
			
			Arrays.sort(total);
			
			System.out.println("#"+(t+1)+" "+total[total.length-1]);
			
		}
		
		
	}
}
