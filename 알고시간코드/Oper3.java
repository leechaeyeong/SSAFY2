
public class Oper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1==1);
		System.out.println(1!=1);
		System.out.println(1>=1);
		System.out.println(1<=1);
		System.out.println(1>1);
		System.out.println(1<1);
		
		String s1= new String("hi");
		String s2 = new String("hi");
		
		System.out.println(s1==s2); //메모리 공간의 주소를 비교해서 서로 다른 값임
		System.out.println(s1!=s2);
		
		String s3 = "hi"; //각각 상수로 잡는다
		String s4 = "hi";
		System.out.println(s3==s4);
		System.out.println(s3!=s4);
		
		
	}

}
