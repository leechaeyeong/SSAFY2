import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue 큐 - 선형자료구조, FIFO 선입선출
 */
public class Z20_선형큐 {
	static int[] q = new int[5];
	static int front = -1;
	static int rear = -1;

	public static void main(String[] args) {
		enQueue(1);
		enQueue(2);
		enQueue(3);
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());

		// 제공하는 API 활용하기
		Queue<Integer> q2 = new LinkedList<Integer>();
		q2.offer(4);
		q2.offer(5);
		q2.offer(6);
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		q2.isEmpty(); // 비어있는지 확인 메서드

// 		알고리즘
		int[] q3 = new int[5];
		int front3 = -1;
		int rear3 = -1;
		q3[++rear3] = 7;
		q3[++rear3] = 8;
		q3[++rear3] = 9;
		System.out.println(q3[++front3]);
		System.out.println(q3[++front3]);
		System.out.println(q3[++front3]);

	} // end of main

	/** 큐에 데이터 삽입 */
	public static void enQueue(int item) {
		if (isFull()) { // 꽉 찼으면
			System.out.println("Queue overflow error~!");
		} else
			q[++rear] = item;

	}

	/** 큐가 꽉 찼는지 여부를 리턴하는 메서드 */
	private static boolean isFull() {
		return rear == q.length - 1;
	}

	private static int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue underflow error~!");
			return -1;
		}
		return q[++front];
	}

	private static boolean isEmpty() {
		return front == rear;
	}

} // end of class
