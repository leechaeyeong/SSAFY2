/*
 * Array : 하나의 변수로 형태가 같은 여러 데이터를 다룰 수 있다.
 * same data type, group handling, java object(new를 통한 생성)
 * length : 길이, index : 번지
 * 하나의 변수명 + 번지를 통한 접근
 */
public class Array1 {

	public static void main(String[] args) {
		
		int a=0, b=1;
		int [] arr = {0,1,2,3,4};
		
		 System.out.println(arr.length);
		 System.out.println(arr[0]);
		 System.out.println(arr[arr.length-1]);
		 
		 //배열 생성 방법
		 int intArr[];
		 int []intArr2;
		 intArr2 = new int [3];
		 int intArr3 [] = new int[5];
	}

}
