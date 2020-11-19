
import java.util.Scanner;

public class Solution_SWEA_1223_계산기2_D4_이채영 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		for (int t = 0; t < 10; t++) {

			int line =scan.nextInt();
			
			String s = scan.next();
			char[] srr = s.toCharArray(); //전체 문자열

			char[] stackop = new char[100]; // 연산자만 담을 스택
			int top = -1;
			
			char[] newsrr = new char[srr.length]; //새로 만들 문자열 저장
			
			int k=0;
			for (int i = 0; i < srr.length; i++) {

				char c = srr[i];
				switch (c) { // 조건 값 (int 형 범위 이하의 정수 or string 문자열) // if문보다 빠르게 비교가능
				
				case '*': // 두개가 같은 우선순위라서!
					// 스택에 우선순위 2보다 작은 우선순위(+-)가 있을 때까지 꺼내서 출력

					while (top >= 0 && stackop[top] == '*') {
						//?
						newsrr[k] = stackop[top];
						k++;
						top--;

						//System.out.print(stackop[top--] + " ");// 새로운 char 배열에 넣고  string  변환
					}
					stackop[++top] = c;
					break;
					
				case '+': // 스택에 우선순위 1보다 작은 우선순위())가 있을 때까지 꺼내서 출력

					while (top >= 0 ) {
						newsrr[k++] = stackop[top--];
						
					}
					stackop[++top] = c;
					break;
				
				default: // else 와 같음 //피연산자 숫자
					newsrr[k++] = srr[i];
					break;

				}// end of switch
			} // end of for

			while(top >-1)
			{
				newsrr[k++]=stackop[top--];
				
			}
			/*
			for (int i = 0; i < newsrr.length; i++) {
				System.out.print(newsrr[i]+" ");
			}
			System.out.println();
			System.out.println(newsrr.length);
			*/
			
			//newsrr -> 계산하기
			
			
			int[] numstack = new int[100]; //숫자를 담는 스택
			int topp= -1;
			
			for (int i = 0; i < newsrr.length; i++) {
				
				char c = newsrr[i];
				
				switch(c) {
				case '*':
					numstack[topp-1] =numstack[topp] * numstack[topp-1]; 
					topp--;
					break;
				case '+':
					numstack[topp-1] =numstack[topp] + numstack[topp-1]; 
					topp--;
					break;
				default:
					numstack[++topp] = newsrr[i]-'0'; 
					break;
				}

			}
			
			System.out.println("#"+(t+1)+" "+numstack[0]);
			
		}//testcase

	}// end of main

}// end of class

