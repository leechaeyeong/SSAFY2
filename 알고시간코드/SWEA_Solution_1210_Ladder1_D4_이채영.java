import java.util.Scanner;

public class SWEA_Solution_1210_Ladder1_D4_��ä�� {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int T = 10; // �׽�Ʈ ���̽�

		int x = 0;
		int[] path = new int[T]; //��� �迭
		int k=0;
		
		for (int t = 0; t < T; t++) {

			int testcase= scan.nextInt(); //�� ��° �׽�Ʈ ���̽����� �Է¹ޱ� (�������)
			
			int[][] ladder = new int[100][102];
			
			for (int i = 0; i < 100; i++) { //�迭�� ��ٸ� �Է¹ޱ�
				for (int j = 1; j < 101; j++) {
					ladder[i][j] = scan.nextInt();
				}
			} 
			
			for (int i = 0; i < 101; i++) { //100
				
				if (ladder[0][i] == 1) // ��ٸ� ���� ã�� -> ���ǿ� ������ ���ο� �迭�� �ֱ�
				{
					x = i-1; //����
					
					int  j=0;
					int dir=0; //0�Ʒ�, 1����, 2 ������
					
					while(j < 100) //�Ʒ��� ����
					{
						if (ladder[j][i]==2 && j==99) { //2�϶� ��
							
							
							path[k]=x;//
							k++;
							i=x+1;
							break;
				
						}
						else if(j==99) //��ٸ� ���� ����
						{
							i=x+1; //i ���� ���·� �����ϱ�
							break;
						}
						
						if(dir==0) //�Ʒ�
						{
							if (i-1>=0 && ladder[j][i - 1] == 1 ) //����
								dir = 1;
							else if ((i+1)>=0 && ladder[j][i + 1] == 1) //������
								dir = 2;	
						}
						if (dir ==1 )// ����
						{
							
							i--;
							if(ladder[j][i-1] ==0) 
							{
								j++;
								dir = 0;
							}
						} 
						else if (dir==2) // ������ ����
						{
							i++;
							if(ladder[j][i+1]==0)
							{
								j++;
								dir=0;
							}
						}
						else
							j++;
					}
					
				}
			}//��ٸ� ��� ã��	
		}//testcase 10��
		for (int i = 0; i < T; i++) {
			System.out.println("#"+(i+1)+" "+path[i]);
		}	
	}//end of main
}
