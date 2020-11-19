package com.ssafy.java;
import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		//3
		
		int myscore = 0, comscore = 0, samescore = 0;
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		

		int i=0;
	
		System.out.println("1. 5판 3승\n2. 3판 2승\n3. 1판 1승\n번호를 입력하세요 : ");
		int select = scan.nextInt();
		
		if(select==1)
			cnt = 5;
		else if(select==2)
			cnt=3;
		else if(select ==3)
			cnt=1;

		while(i<cnt)
		{
				
				System.out.println("가위바위보 중 하나 입력 : ");
				String my = scan.next();
				
				if(my.equals("가위")) //1
				{
					int com = (int)(Math.random() *3) +1;
					if(com ==2)
					{	comscore++;
						System.out.println("졌습니다!!");
					}
					else if(com ==3)
					{	myscore++;
						System.out.println("이겼습니다!!");
					}
					else
					{	samescore++;
						System.out.println("비겼습니다!!");
					}
				}
				else if(my.equals("바위")) //2
				{
					int com = (int)(Math.random() *3) +1;
					if(com ==3)
					{	comscore++;
						System.out.println("졌습니다!!");
					}
					else if(com ==1)
					{	myscore++;
						System.out.println("이겼습니다!!");
					}
					else
					{	samescore++;
						System.out.println("비겼습니다!!");
					}
				}
				else if(my.equals("보")) //3
				{
					int com = (int)(Math.random() *3) +1;
					if(com ==1)
					{	comscore++;
						System.out.println("졌습니다!!");
					}
					else if(com ==2)
					{	myscore++;
						System.out.println("이겼습니다!!");
					} 
					else
					{	samescore++;
						System.out.println("비겼습니다!!");
					}
				}
				
				i++;
		}//while
		
		if(comscore > myscore)
			System.out.println("### 컴퓨터 승!!");
		else if(comscore < myscore)
			System.out.println("### 내가 승!!");

	
		
	}

}
