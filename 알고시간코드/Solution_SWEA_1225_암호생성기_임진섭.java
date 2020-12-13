import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_SWEA_1225_암호생성기_임진섭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<Integer> q = new LinkedList<Integer>();

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int testCase = 1; testCase <= 10; testCase++) {

			int t = sc.nextInt();
			for (int i = 0; i < 8; i++) {
				int n = sc.nextInt();
				q.add(n);
			}
			int count = 0;
			while (true) {
				int cur = q.poll() - arr[count];
				if (cur > 0)
					q.add(cur);
				else {
					q.add(0);
					break;
				}

				count++;

				if (count == 5)
					count = 0;
			} // end of while

			String s = "";
			while (!q.isEmpty()) {
				s += q.poll().toString() + " ";
			}
			System.out.println("#" + testCase + " " + s);
		}
	}
}
