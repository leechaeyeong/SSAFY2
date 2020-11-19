/*
import java.util.Scanner;

public class 소금쟁이중첩_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int arrsize=0, cntstrider=0;
		int[][] arr=null;
		

		for (int i = 0; i < T; i++) {

			int n = scan.nextInt(); // 9
			int so = scan.nextInt(); // 5

			int[][] arr = new int[n][n]; // 연못
			
			for(int a=0;a<so;a++)
			{
				y=scan.nextInt();
				x=scan.nextInt();
				direct=scan.nextInt();
				if(direct ==1)
				{
					int temp=y;
					for(int b=3;)
				}
				else if(direct ==2)
				{
					int temp=x;
					for(int b=3;b>0;b--)
					{
						temp=temp+b;
						if(temp>=n)
							break;
						else if(arr[y][temp] ==1)
						{
							answer = a+1;
							break;
						}
						else {
							arr[y][temp]=1;
						}
					}
				}
						}
					}
				}

}
*/
