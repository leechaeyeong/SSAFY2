
public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2; //초기식
		while(a<10) { //조건식
			int b=1;
			while(b<10) {
				System.out.println(a+"*"+b+"="+(a*b));
				b++;
			}
			System.out.println();
			a++; //변경식
		}

	}

}
