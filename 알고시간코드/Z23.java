import java.util.LinkedList;

public class Z23 {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < 24; i++) {
			list.add(i);
		}
		
		int plus = 2;
		int cnt = list.getFirst();
		
		while(list.size()>2) {
			System.out.print("죽은 사람 : " + list.remove(cnt));
			System.out.println(" 남은 사람 : " + list.size());
			cnt += plus;
			
			if(cnt >= list.size()) {
				cnt = cnt - list.size();
//				cnt += (plus % list.size());
			}
			
		} // end of while
		System.out.println("산 사람 : " + list);
	}
}
