
public class Oper5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//short circuit logic : 두 항 중 앞의 항의 결과가 전체 결과 값이 되면
		//						뒤의 항을 계산하지 않는다
		
		String s =null;
		//System.out.println(s.length());
		if(s !=null && s.length() > 0) {
			System.out.println("hi");
		}
		if(s ==null || s.length() <= 0) {
			System.out.println("null");
		}
		System.out.println("end");
	}

}
