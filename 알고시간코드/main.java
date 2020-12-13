import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 세로
		int m = sc.nextInt(); // 가로

		int[][] map = new int[n][m]; // 영역

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		} // end of input

		// 벽을 3개씩 모두 설치 후 안전 영역 넓이를 다 비교해 본다.
		int count = 0;
		int row1 = 0;
		int col1 = 0;
		int row2 = 0;
		int col2 = 0;
		int row3 = 0;
		int col3 = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 0) {
					row1 = i;
					col1 = j;		
					for (int k = 0; k < map.length; k++) {
						for (int l = 0; l < map[i].length; l++) {
							if (map[k][l] == 0) {
								row2 = k;
								col2 = l;
								if (row1 == row2 && col1 == col2) continue;
								else{
									for (int x = 0; x < map.length; x++) {
										for (int z = 0; z < map[i].length; z++) {
											if (map[x][z] == 0) {
												row3 = x;
												col3 = z;
												if ((row1 == row3) && (row2 == row3) && ((col1 == col3) && (col2 == col3))) continue;
												else{
													count++;
												}
											}
										}
									}

								}
							}

						}
					}
				}

			}
		}
		System.out.println(count);
	} // end of main
} // end of class
