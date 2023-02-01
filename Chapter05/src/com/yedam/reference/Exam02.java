package com.yedam.reference;

public class Exam02 {

	public static void main(String[] args) {
		//new 연산자가 없는 String
		String strVal1 = "yedam";
		String strVal2 = "yedam";
		
		//==, equals
		//== 데이터 비교하는거 아니고 데이터가 살고 있는 주소(번지 비교)
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 메모리 주소 같음");
		}else {
			System.out.println("strVal1과 strVal2는 메모리 주소 다름");
		}
		
		//문자열(String)간의 데이터 비교
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 데이터 같다");
		}else {
			System.out.println("strVal1과 strVal2는 데이터 다르다");
		}
		
		//new 연산자가 있는 String 객체 비교
		//객체 : 참조타입의 변수
		
		String strVal3 = new String("yedam");
		String strVal4 = new String("yedam");
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 같은 메모리 주소");
		}else {
			System.out.println("strVal3과 strVal4는 다른 메모리 주소");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3과 strVal4는 데이터 같음");
		}else {
			System.out.println("strVal3과 strVal4는 데이터 다름");
		}
		
		//new 연산자 안 쓴 String, new 연산자를 사용한 String 비교
		if(strVal1 == strVal3) {
			System.out.println("strVal1과 strVal3는 같은 메모리 주소");
		}else {
			System.out.println("strVal1과 strVal3는 다른 메모리 주소");
		}

	}

}
