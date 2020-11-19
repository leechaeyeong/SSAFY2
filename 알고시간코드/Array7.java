
public class Array7 {

	public static void main(String[] args) {
		
		//구구단 >이중배열에 담기
		
		int [][] gugu = new int[8][9];
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<9;j++)
				gugu[i][j] = (i+2)*(j+1);
		}
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<9;j++)
				System.out.print(gugu[i][j]+" ");
			System.out.println();
		}
		
	}

}
