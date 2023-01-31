package com.yedam.condition;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적입력>");
		//입력한 문자열 변수에 저장
		String point = sc.nextLine();
		//문자열을 int형으로 형 변환 하는 과정
		int scores = Integer.parseInt(point);
		
		String pass = "";
		//90이상은 A
		//89~80 B
		//79~70 C
		//69~60 D
		
		if(scores >= 90) {
			pass = "A";
		}else if(scores >= 80) {
			pass = "B";
		}else if(scores >= 70){
			pass = "C";
		}else {
			pass = "D";
		}
		System.out.println("학점 : " + pass + "입니다.");
		
		int num = scores/10;
		switch(num) {
		case 10:
			
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		}
		
		
		
		
		
		
	}

}
