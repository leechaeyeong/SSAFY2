import java.util.Scanner;

public class Solution_SWEA_3289_서로소집합_D4_임진섭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] p = new int[n+1];
			for (int i = 0; i < p.length; i++) {
				p[i] = i;
			}
			
			// 합집합 0 a b의 형태
			// 같은 집합에 포함되어 있는지 확인 1 a b의 형태
			System.out.print("#" + tc + " ");
			for (int i = 0; i < m; i++) {
				int s = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if(s == 0) {
					unionSet(p, a, b);
				}
				else if(s == 1) {
					if(findSet(p,a) == findSet(p,b))
						System.out.print("1");
					else
						System.out.print("0");
				}
			}
			System.out.println();
		} // end of tc
	} // end of main
	
	public static void unionSet(int[] arr, int x, int y) {
		arr[x] = findSet(arr,arr[y]);
	}
	
	public static int findSet(int[] arr, int x) {
		if(arr[x] == x) {
			return x;
		}
		else {
			return findSet(arr,arr[x]);
		}
	}
} // end of class
