//directions : 사방탐색, 팔방탐색에 위치값을 적용하는 개념
public class ArrayDirections {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(arr[1][1]);
		System.out.println(arr[1 - 1][1]);
		System.out.println(arr[1 + 1][1]);
		System.out.println(arr[1][1 - 1]);
		System.out.println(arr[1][1 + 1]);

		int[] pointy = { -1, -1,-1,1,1,1, 0, 0 };
		int[] pointx = { -1,0,1, -1,0,1, -1, 1 };
		String[] pointstr = { "상전", "상","상후","하전","하","하후", "좌", "우" };

		System.out.println(arr[1 + pointy[0]][1] + pointx[0]);
		System.out.println(arr[1 + pointy[1]][1] + pointx[1]);
		System.out.println(arr[1 + pointy[2]][1] + pointx[2]);
		System.out.println(arr[1 + pointy[3]][1] + pointx[3]);

		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				System.out.println("현재 위치 :" + arr[a][b]);
				int y = 0, x = 0;
				for (int c = 0; c < pointx.length; c++) {
					y = a + pointy[c];
					x = a + pointx[c];
					if (y < 0 || x < 0 || y >= arr.length || x >= arr.length)
						continue;
					System.out.println(pointstr[c] + arr[y][x]);
				}
			}
		}
	}
}
