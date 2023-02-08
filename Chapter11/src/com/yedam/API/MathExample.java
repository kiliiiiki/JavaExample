package com.yedam.API;

import java.util.Random;

public class MathExample {

	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		System.out.println(v1);
		double v2 = Math.abs(-3.1);
		System.out.println(v2);
		
		double v3 = Math.ceil(5.3);
		System.out.println(v3);		
		double v4 = Math.ceil(-5.3);
		System.out.println(v4);
		
		double v5 = Math.floor(5.3);
		System.out.println(v5);
		double v6 = Math.floor(-5.3);
		System.out.println(v6);
		
		int v7 = Math.max(5,  9);
		System.out.println(v7);
		
		int v8 = Math.min(5, 9);
		System.out.println(v8);
		
		double v9 = Math.random();
		System.out.println(v9);
		
		//rint : 짝수는 내림, 홀수는 올림
		double v10 = Math.rint(8.5);
		System.out.println(v10);
		double v11 = Math.rint(7.5);
		System.out.println(v11);
		double v12 = Math.rint(3.3);
		System.out.println(v12);
		double v13 = Math.rint(9.5);
		System.out.println(v13);
		
		double v14 = Math.round(5.3);
		System.out.println(v14);
		
		//Math.random() -> 범위 지정해서 데이터 읽어
		//Random() -> seed라고 씨앗을 넣어주면 거기에 맞게끔 랜덤 데이터
		//Random random = new Random(); 괄호안에 seed값
		
				
		
		
		
		

	}

}
