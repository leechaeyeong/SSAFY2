/**
 * 연산자 : 단항, 이항, 삼항, 대입연산자
 * 비트연산자 : 이항연산에 포함되는 연산자 << >> || && | & ^
 */
public class Z06_비트연산 {
	public static void main(String[] args) {
		int a =123; // 10진수
		System.out.println(a); //10진수
		
		//a = 0x110111; //16진수 , 앞에 0x붙이기 0X
		//a = 0110111; //8진수 , 앞에 0
		a = 0b110111; //2진수 , 앞에 0b붙이기 0B
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a)); //
		System.out.println(Integer.toString(a,3)); //3진법 >하고싶은 진법
		
		int b = 0b1100; //12
		int c=0b1001; //9
		//진법 변환하는 프로그램
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(b&c)+"= b&c");
		System.out.println(Integer.toBinaryString(b|c)+"= b|c");
		
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(1<<0)+" =1<<0 = "+(1<<0));
		System.out.println(Integer.toBinaryString(1<<1)+" =1<<1 = "+(1<<1));
		System.out.println(Integer.toBinaryString(1<<2)+" =1<<2 = "+(1<<2));
		System.out.println(Integer.toBinaryString(1<<3)+" =1<<3 = "+(1<<3));
		
		//비트마스킹 : 원하는 비트의 값만 뽑아내기
		System.out.println("비트마스킹");
		int n= 0b10011011;
		System.out.println(n & 0b1);
		//10011010
		//&00001000
		System.out.println((n & 0b10) == 0?0:1);
		System.out.println((n & 0b100)== 0?0:1);
		System.out.println((n & 0b1000)==0?0:1);
		System.out.println((n & 0b10000)==0?0:1);
		//반복문으로 생성하기!
		
		System.out.println("반복문으로 출력 (쉬프트 연산자 활용)");
		for (int i = 0; i < 8; i++) {
			System.out.println((n & 1<<i)== 0?0:1);
		}
		System.out.println();
	
	}
}
