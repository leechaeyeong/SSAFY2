
public class Var5 {
	public static void main(String [] args)
	{
		//Reference data type : �ݵ�� new ����ؾ� �޸𸮿� ������ �ø�
		ImsiTest1 it1 = new ImsiTest1();
		it1.i = 7;
		System.out.println(it1.i);
		
		//����  - String
		String s1= new String("hi");
		String s2 = "hello";
		s2 = s2+ " everyone !!";
		System.out.println(s2);
				
	}
}
class ImsiTest1{
	int i=0;
}
