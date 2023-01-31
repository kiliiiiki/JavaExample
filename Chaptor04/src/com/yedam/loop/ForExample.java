package com.yedam.loop;

public class ForExample {

	public static void main(String[] args) {
		//반복문
		//일정한 행동을 계속 반복
		//반복을 할 때 어떠한 규칙에 따라 행동 반복
		//규칙 찾는게 중요
		
		//1~5까지 누적의 합
		int sum = 0;
//		sum = sum +1;
//		sum = sum +2;
//		sum = sum +3;
//		sum = sum +4;
//		sum = sum +5;
		
//		
		//for문
		for(int i =1; i<=5; i++) {
			//sum += i;
			sum = sum + i;
		}
		
		System.out.println("누적 합 : " +sum);
		
		//1~100 사이에서 짝수 구하는 반복문
		//1~100 -> 1~100까지 반복
		//2로 나눈 나머지 값 = 0 -> 짝수
		
		for(int i=1; i<=100; i++) {
			if(i % 2 ==0) {
				System.out.print(i + "\t");
			}
		}
		
		//1~100 사이의 홀수 구하는 반복문
		//2로 나눈 나머지 값 = 1 -> 홀수
		
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) {
				System.out.print(i + "\t");
			}
		}
		
		//1~100 사이에서 2의 배수 또는(or) 3의 배수 찾기
		//2의 배수 => 어떤 값을 2로 나누었을 때 0인 애들
		//3의 배수 => 어떤 값을 3으로 나누었을 때 0인 애들
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0 || i%3 == 0) {
				System.out.println("2 또는 3의 배수 : " +i);
			}
		}
		
		//구구단 출력하기(2단)
		
		for(int i = 1; i<10; i++) {
			System.out.println("2 x " + i + " = " +(2*i));
		}
		
		//중첩 for문
		//반복문 안에 반복문이 들어가는 형태
		
		//2단 ~ 9단까지 출력하는 반복문
		for(int i =2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i +" * " + j + " = "+ (i*j));
			}
		}
		
		//구구단 세로 찍기
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=5; j++) {
				System.out.print(j +" x "+ i + " = " + (j*i) +"\t");
			}
			System.out.println();
//			System.out.print("\n");
		}
		
		//공포의 별찍기
		
		//*****
		//*****
		//*****
		//*****
		//*****
		//한 칸씩 내려갈 때 쓰는 반복문
		for(int i=0; i<5; i++) {
			String star = "";
			for(int j=0; j<5; j++) {
				//+연산자를 활용해서 *****만듬
				//star = star + "*";
				System.out.print("*");
			}
			//System.out.println(star);
			System.out.println();
		}
		
		//*
		//**
		//***
		//****
		//*****
		for(int i=1; i<=5; i++) {
			String star = "";
			for(int j=0; i>j; j++) {
				star = star + "*";
			}		
			System.out.println(star);
		}
		
		//*****
		//****
		//***
		//**
		//*
		for(int i=1; i<=5; i++) {
			String star ="";
			for(int j=0; j<=5-i; j++) {
				star = star + "*";
			}
			System.out.println(star);	
		}
		
		      //i    //j
		//    * 4, 1 = 5
		//   ** 3, 2 = 5
		//  *** 2, 3 = 5
		// **** 1, 4 = 5
		//***** 0, 5 = 5
//		for(int i=5; i>0; i--) {
//			for(int j=1; j<=5; j++) {
//				if(i>j) {
//					System.out.println(" ");
//				}else {
//					System.out.println("*");
//				}
//			}
//			System.out.println();
//		}
		
		

	}

}
