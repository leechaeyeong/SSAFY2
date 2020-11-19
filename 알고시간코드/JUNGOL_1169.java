
/**
 * Keunhwa Lee
 * 2020.01.29
 * 정올 1169 주사위 던지기1
 */
import java.util.Scanner;
public class JUNGOL_1169 {
	
	static int N; // 주사위 던지는 횟수 ( 2<= <=5 )
	static int[] diceNum = new int[7]; // 던질 때마다 숫자 저장용
	
	static boolean[] check = new boolean[7]; // 숫자 사용 여부 체크
	
	// 던지는 회차 index, n은 총 던지는 횟수
	public static void dice1(int index, int n) {
		if (n == 0) {
			// 출력하고
			print();
			return;
		}
		for (int i = 1; i <= 6; i++) {
			diceNum[index] = i;
			dice1(index + 1, n - 1);
		}
	}
	public static void dice2(int index, int n) {
		if(n==0) {
			print();
			return;
		}
		// 주사위에 써진 숫자는 중복 가능
		for (int i = diceNum[index-1]; i <= 6; i++) {
			diceNum[index] = i;
			dice2(index+1, n-1);
		}
	}
	public static void dice3(int index, int n) {
		if(n==0) {
			print();
			return;
		}
		for (int i = 1; i <=6; i++) {
			// 주사위 숫자 i가 이미 사용되었다면, 건너뜀
			if(check[i])
				continue;
			// 그게 아니라면
			// 주사위 숫자 i 사용
			diceNum[index] = i;
			check[i] = true;
			dice3(index+1, n-1);
			// 사용 후에는, 사용하지 않은 것으로 다시 바꿔줌
			check[i] = false;
		}
	}
	public static void print() {
		for (int i = 1; i <= N; i++) {
			System.out.print(diceNum[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		if (M == 1) {
			dice1(1, N);
		} else if (M == 2) {
			diceNum[0] = 1;
			dice2(1, N);
		} else {
			dice3(1, N);
		}
	} // end of main
} // end of class