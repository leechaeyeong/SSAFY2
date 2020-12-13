

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 마이쭈_임진섭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Info> q = new LinkedList<Info>();

		Point p = new Point(); // 자바에서 pair를 대신할 수 있는 것
		Queue<Point> qy = new LinkedList<>();
		
		
		
		int candy = 20; // 전체 마이쮸
		int number=1;
		Info info = new Info(number, 1); // 사람, 사탕
		q.add(info); // 맨 처음
		int cur = 0;
		while(true) {
			number++;
			sc.nextLine();
			System.out.println("큐에 있는 사람의 수 : " + q.size());
			Info temp = q.poll();
			
			System.out.println("현재 마이쮸를 가져갈 사람 : " + temp.p + " 가져갈 마이쮸의 수 : " + temp.c);
			if(candy-temp.c>0) {
				cur+= temp.c;
				candy -= temp.c; // 마이쮸 감소
			}else {
				temp.c=candy;
				cur+=temp.c;
				candy=0;
			}
			
			System.out.println("현재까지 나눠준 마이쮸의 수 : " + cur);
			temp.c++;
			q.add(temp);
			Info I = new Info(number, 1); // 사람, 사탕
			q.add(I);
			if(candy <= 0) {
				System.out.println();
				System.out.println("마지막 마이쮸를 가져간 사람 : " + temp.p);
				break;
			}
			System.out.println();
			
		}

	}
}

class Info {
	int p;
	int c;

	public Info(int p, int c) {
		this.p = p;
		this.c = c;
	}
}
