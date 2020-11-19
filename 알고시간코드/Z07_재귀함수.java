/**
 * 재귀함수
 */
public class Z07_재귀함수 {
	public static int z=5;
	
	public static void main(String[] args) {
		z=3; //static 디버깅 >
		
		
		for (int i = 0; i < 400; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Z07_재귀함수 z= new Z07_재귀함수(); //하면 static 안해도 됨.
		a(0); // 시작 값을 보냄 0 1 2 3

		for (int i = 3; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		b(3); //초기값을 파라미터로 넣음

		c(2); //2 4 6 8
		
		for (int i = 3; i < 10; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		d(3,2,10); //초기값, 증감값, 조건기준값
		//3 5 7 9 <10
		
		d(5,3,20);
		
		for (int i = 10; i >0; i-=3) {
			System.out.print(i+" ");
		}
		System.out.println();
		e(10,3,0); //초기값, 감소값, 조건기준값
		
		//1~10까지 의 합
		int sum=0;
		for (int i = 1; i <=10; i++) {
			sum+=i;
		}
		System.out.println("1~10까지의 합 : "+sum);
		
		f(1,10);// 전역변수를 사용해서 합을 구해보자
		
		System.out.println(f2(1,10)); //리턴 값을 사용해서 합을 구해보자

		//5!
		int fac=1;
		for (int i = 5; i >=1 ; i--) {
			fac*=i;
		}
		System.out.println(fac);

		facto(5); //전역변수로 만들기
		
		System.out.println(facto2(5)); //리턴 값 사용하기
		facto3(5,1); //매개변수 사용하기
		
	}//end of main
	
	// 리턴 타입, 메서드 명, 매개변수
		public static void a(int i) { // static 써야하는 이유 : 메모리에 static이 먼저 생성됨 > 그 후에 인스턴스 멤버가 활성화 됨
			// static에서는 non static을 호출할 수 없다.
			if (i >= 4) // basis case 종료파트 = 조건식 (참이면 종료하기) 위와 반대로
			{
				System.out.println();
			} else // inductive case 재귀파트
			{
				// 반복구문을 넣기
				System.out.print(i + " "); // 반복할 실행문
				a(i + 1); // 증감식
			}
		}
	public static void facto3(int s, int e)
	{
		if(s==0) {
			System.out.println(e);
		}
		else {
			facto3(s-1, e*s);
		}
	}
	public static int facto2(int i) {
		if(i==0) {
			return 1;
		}
		else {
			return i * facto2(i-1);
		}
	}
	public static int m=1;
	public static void facto(int i) //전역변수 사용
	{
		
		if(i==0)
		{
			System.out.println(m);
		}
		else {
			m *=i;
			facto(i-1);
		}
	}
	public static int f2(int s, int e)
	{
		if(s==e) {
			return s;
		}
		else {
			//return 1+...+10;
			return s + f2(s+1,e);
		}
	}
	public static int total =0; //변수 선언만 해도 전역변수는 각타입의 초기값이 들어간다
	public static void f(int s, int e)
	{
		
		if(s>e) {
			System.out.println("1~10까지의 합 : "+total); //
		}
		else {
			total += s;
			f(s+1,e);
		}
	}
	public static void e(int i, int j, int k)
	{
		if(i < k) {
			System.out.println();
		}
		else {
			System.out.print(i+" ");
			e(i-j,j,k);
		}
	}
	
	public static void d(int start,int add, int end)
	{
		if(start>=end)
		{
			System.out.println();
		}
		else {
			System.out.print(start+" ");
			d(start+add,add,end);
		}
	}
	public static void c (int i) {
		
		if(i>=10){
			System.out.println();
		}
		else {
			System.out.print(i+" ");
			c(i+2);
		}
	}
	
	public static void b(int i) {
		if(i<0){
			System.out.println();
		}
		else {
			System.out.print(i+" ");
			//재귀함수에서는 i--를 안씀!!!! > i 값을 변경하지 않음
			b(i-1);
		}
	}
	

}
