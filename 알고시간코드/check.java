import java.util.Scanner;

public class check {
	static char[] stack = new char[30];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			int topp = -1;
			String s = "";
			s = sc.next();

			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c == '(') {
					stack[++topp] = c;
					//topp++;
				}
				else if(c == ')'){
					stack[topp--] = ' ';
					//topp--;
				}
			}

			if (topp == -1)
				System.out.println("claer");
			else
				System.out.println("error");
		}

	} // end of main
} // end of class
