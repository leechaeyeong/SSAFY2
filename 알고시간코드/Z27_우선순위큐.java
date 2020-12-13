import java.util.Comparator;
import java.util.PriorityQueue;

public class Z27_우선순위큐 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(1);
		pq.offer(3);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		System.out.println("//// 큰수부터 나오게 하려면 - 우선순위를 지정 ////");
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
//				if(o1 > o2) {
//					return -1;
//				}else if(o1==o2) {
//					return 0;
//				}else{ // o1 < o2
//					return 1;
//				}
			return -(o1 - o2); // o1 - o2 오름차순
			}
		});
		
		pq2.offer(1);
		pq2.offer(3);
		pq2.offer(2);
		pq2.offer(4);
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		
		PriorityQueue<Com> pp = new PriorityQueue<Com>(new Comparator<Com>() {
			@Override
			public int compare(Com o1, Com o2) { // 비교기준 작성
				// 나이 많은 순, 키 큰 순서
				if(o1.age != o2.age) {
					return -(o1.age - o2.age);					
				}
				else {
					return -(o1.tall - o2.tall);
				}
			}
		});
		pp.offer(new Com(170,"호랑이",26));
		pp.offer(new Com(160,"호랑이",27));
		pp.offer(new Com(175,"김건모",26));
		pp.offer(new Com(180,"서장훈",25));
		System.out.println(pp.poll());
		System.out.println(pp.poll());
		System.out.println(pp.poll());
		System.out.println(pp.poll());
		
	} // end of main
} // end of class

class Com{
	int tall;
	String name;
	int age;
	public Com() {
		
	}
	public Com(int tall, String name, int age){
		this.tall = tall;
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return tall + " " + name + " " +age;
	}
}