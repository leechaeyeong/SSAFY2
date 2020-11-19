import java.util.ArrayList;

public class ForEach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("hi");
		list1.add("hello");
		list1.add("good");
		
		
		System.out.println(list1);
		
		for(String s : list1) { //신버전
			System.out.println(s);
		}
		
		for(int i=0;i<list1.size();i++) //구버전
		{	
			String s = list1.get(i);
			System.out.println(s);
		}
		
		

	}

}
