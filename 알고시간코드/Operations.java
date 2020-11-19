//package - 현재 파일의 위치(폴더 구조)
//import - 현재 파일이 사용하는  class 의 위치(폴더 구조)

public class Operations {
	int memberTest;
	//데이터 요소 - member variable
	//기능(function) 요소 - member method
	//메소드의 구성 - access modifier + return type + method name + parameter list
	//public - 누구나 사용할 수 있는
	//parameter list - 메소드에 일을 시킬 때 필요한 외부 데이터를 명시
	
	public static void plus() { //no return, no parameter
		System.out.println(7+8);
	}
	public static void plus2(float a, float b) { //no return
		System.out.println(a+b);
	}//overload - parameter가 다르면, 같은 이름의 메소드를 중복 선언 가능.
	
	public static float plus3(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		plus();
		plus2(100,200);
		System.out.println(plus3(77,333));
	}
}
