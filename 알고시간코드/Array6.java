
public class Array6 {

	public static void main(String[] args) {
		
		int [][] intArr;
		intArr = new int[2][];
		intArr[0]= new int [5];
		intArr[1]=new int[50];
		
		int intArr2 [][];
		intArr2 = new int[2][3];
		
		int [][]intArr3 = new int[2][5];
		
		//2차원 배열 선언
		
		
		int [][]intArr4 = {{1,2,3},{4,5,6}};
		
		for(int a=0; a<intArr4.length; a++)
		{
			for(int b=0;b<intArr4[a].length;b++)
			{
				System.out.print(intArr4[a][b]);
			}
			System.out.println();
		}
		

	}

}
