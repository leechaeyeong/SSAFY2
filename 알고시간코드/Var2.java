
public class Var2 {
	public static void main(String [] agr)
	{
		byte b1=-128;
		byte b2=127;
		System.out.print(b1);
		System.out.print(b2);
		byte b3=(byte)128; //demotion, 명시적 casting
		byte b4 = (byte)-129;
		System.out.println(b3);
		System.out.println(b4);
		int i= b2; //auto casting, promotion, 묵시적  casting
		System.out.println(i);
		
	}
}
