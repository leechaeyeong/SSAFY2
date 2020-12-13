import java.util.Scanner;
public class Solution_SWEA_1223_계산기2_D4_임진섭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int testCase = 1; testCase <= 10; testCase++) {
			int len = sc.nextInt(); // 길이 입력
			String s = sc.next();
			String[] stackOp = new String[len]; // 연산자 스택
			int topOp = -1;
			int[] stackVal = new int[len]; // 피연산자 스택
			int topVal = -1;
			String[] stack = new String[len]; // 후위연산을 담는 스택
			int top = -1;
			for (int i = 0; i < s.length(); i++) {
				String st = s.substring(i, i + 1);
				switch (st) {
				case "*":
					while (topOp > -1 && stackOp[topOp].equals("*")) { // 우선 순위
						stack[++top] = stackOp[topOp--];
					}
					stackOp[++topOp] = st; // 연산자 저장
					break;
				case "+":
					while (topOp > -1 && (stackOp[topOp].equals("*") || stackOp[topOp].equals("+"))) { // 우선순위
						stack[++top] = stackOp[topOp--];
					}
					stackOp[++topOp] = st; // 연산자 저장
					break;
				default:
					stack[++top] = st; // 피연산자 저장
					break;
				} // end of switch
			} // end of for
			while (topOp > -1) { // 남아있는 피연산자까지 받기
				stack[++top] = stackOp[topOp--];
			}
			// stack 확인용
//			for (int i = top; i >=0 ; i--) {
//				System.out.print(stack[i]);
//			}
			/** stack에 있는 값을 거꾸로 받기 위한 스택
			 *  ex) 3+4+5*6+7 가 있으면 stack에는 +7+*65+43로 저장되어 있음
			 *  계산에 활용할 수 있게 거꾸로 받기 위해 newStack에 역순으로 받아옴 => 34+56*+7+
			 */
			String[] newStack = new String[len];  
			int newTop = -1;
			for (int i = top; i >=0; i--) { // 값을 거꾸로 받아서 연산에 사용할 수 있게끔 만들어 준다
				newStack[++newTop] = stack[i];
			}
			int[] lastSt = new int[len]; // 피연산자를 담을 int형 스택
			int lastTop = -1;
			while(newTop > -1){ //스택이 비워질 때 까지
				int first = 0; // 처음 꺼낼 피연산자
				int second = 0; // 두번째 꺼낼 피연산자
				if(!newStack[newTop].equals("*") && !newStack[newTop].equals("+")){ // 꺼낸것이 피연산자이면
					lastSt[++lastTop] =Integer.parseInt(newStack[newTop]); // int값으로 바꿔서 int형 스택에 담아준다.
					newTop--;
				}
				else if(newStack[newTop].equals("*")){
					first = lastSt[lastTop--];
					second = lastSt[lastTop--];
					lastSt[++lastTop] = first * second;
					newTop--;
				}
				else if(newStack[newTop].equals("+")){
					first = lastSt[lastTop--];
					second = lastSt[lastTop--];
					lastSt[++lastTop] = first + second;
					newTop--;
				}			
			}
			System.out.println("#" + testCase + " " + lastSt[lastTop]); // int형 스택에 마지막에 남아있는 값이 최종 결과
		} // end of testCase
	} // end of main
} // end of class