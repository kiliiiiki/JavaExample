package com.yedam.loop;

import java.util.Scanner;

public class WhileExample02 {

	public static void main(String[] args) {
		
		//오락실
		//투입한 금액만큼 반복문 진행
		//while문 활용
		//투입한 금액대비 게임을 몇 번 할 수 있을까?
		//예시) 10000 ->20번, 5000->10번
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.println("====insert Coin====");
		//돈투입
		money = Integer.parseInt(sc.nextLine());
		
		//money/500>0 vs money>0 ->남은 금액이 부족할 때 막을 수 없음
		while(money/500 > 0) {
			//한판에 500원
			System.out.println((money/500) + "판 남음.");
			System.out.println("1. 가위바위보 | 2. Up & Down | 3. 종료");
			//야구 게임(4개의 무작위 번호 맞추기), 배스킨 등등...
			System.out.println("입력>");
			int gameNo = Integer.parseInt(sc.nextLine());
			
			switch(gameNo) {
			case 1:
				System.out.println("가위바위보 실행");
				money-= 500;
				break;
			case 2:
				System.out.println("Up & Down 실행");
				money-= 500;
				break;
			case 3:
				System.out.println("종료");
				money = 0;
				break;
			}
		}
		

	}

}
