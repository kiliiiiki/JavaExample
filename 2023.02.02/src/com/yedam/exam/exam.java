package com.yedam.exam;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		
		//[문제1]
		int a = 10;
		double b = 2.0;
		
		int result = a + (int)b;
		int result1 = a - (int)b;
		int result2 = a * (int)b;
		int result3 = a / (int)b;
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		//[문제2] -> 평가지에 작성
		
		//[문제3]
		int[] coinUnit = new int[4];
		coinUnit[0]=500;
		coinUnit[1]=100;
		coinUnit[2]=50;
		coinUnit[3]=10;
		int money = 2680;
		System.out.println("money = " + money);
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원 : " + (money/coinUnit[i])+"개");												
			money-=coinUnit[i]*(money/coinUnit[i]);
		}
		
	
		//[문제4]
		for(int i=2; i<=9; i++) {
			for (int j=1; j<=i; j++) {
				System.out.println(i + "*" + j + "=" +(i*j));
			}
		}
		
		//[문제5]
		boolean run = true;
		int playNum = 0;
		int [] num = null;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("=== 1.주사위 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5.종료 ===");
			System.out.println("메뉴>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				playNum = Integer.parseInt(sc.nextLine());
				if(playNum < 5  || playNum >10) {
					System.out.println("범위를 벗어났습니다.");
				}
				
			}else if(selectNo == 2) {				
							
				int runs = 0;
				for(int i=0; i<num.length; i++) {
					int randomNo = (int)(Math.random()*playNum)+1;	
					num[i] = randomNo;
					if(num[i]==5) {
						runs = i+1;
					}
				}				
				System.out.println("5가 나올때까지 주사위를 " +(runs)+ "번 굴렸습니다.");
			}else if(selectNo == 3) {
				
			}else if(selectNo == 4) {
				
			}else if(selectNo == 5) {
				run = false;
				System.out.println("종료");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
