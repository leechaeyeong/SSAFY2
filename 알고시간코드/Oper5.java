
public class Oper5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//short circuit logic : �� �� �� ���� ���� ����� ��ü ��� ���� �Ǹ�
		//						���� ���� ������� �ʴ´�
		
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
