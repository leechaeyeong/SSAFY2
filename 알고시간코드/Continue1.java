
public class Continue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=2;a<10;a++)
		{
			for(int b=1;b<10;b++) {
				if(b==8) continue;
				System.out.println(a+"*"+b+"="+(a*b));
			}
			System.out.println();
		}
	}

}
