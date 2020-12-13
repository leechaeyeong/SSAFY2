import java.util.LinkedList;

/**
 * 리스트
 * 배열의 단점을 해결하기 위해 준비된 객체
 * 단순연결리스트 -> 이중연결리스트 -> 원형이중연결리스트
 */
public class Z22_LinkedList {
	public static void main(String[] args) {
		Node n1 = new Node();
//		n1.pre = null;
		n1.data = 1;
//		n1.next = null;
		
		Node head = n1; // 연결리스트
		Node n2 = new Node();
//		n2.pre = null;
		n2.data = 2;
//		n2.next = null;
		n1.next = n2;
		
		LinkedList<Integer> list = new LinkedList<Integer>(); // 제너릭스 표현법
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list); // list.toString()
		list.add(2,100);
		System.out.println(list); // list.toString()
		list.addFirst(0);
		System.out.println(list); // list.toString()
		list.addLast(1000);
		System.out.println(list); // list.toString()
		list.remove(2);
		System.out.println(list + " 2번째 인덱스 데이터 삭제"); // list.toString()
		list.remove(); // 첫번째 원소 삭제
		System.out.println(list + " 첫번째 인덱스 데이터 삭제"); // list.toString()
		System.out.println(list.size()); // list.toString()
		System.out.println(list.contains(3)); // list.toString()
		
	} // end of main
} // end of class

class Node{
	Node pre;
	int data; // 초기값 0
	Node next; // 초기값 null
}
