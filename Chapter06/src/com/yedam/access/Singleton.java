package com.yedam.access;

public class Singleton {
	
	//외부에서 접근은 못하지만 공유 가능
	//객체 생성 -> 객체가 존재하고 있는 주소값
	//sington -> 100번지
	private static Singleton sington = new Singleton();
	
	//외부에서 객체를 생성하지 못하도록 막는 역할
	private Singleton() {
		
	}
	
	//싱글톤 내부에서 ㅁ나든 객체를 외부에서 전달하는 용도
	public static Singleton getInstance() {
		return sington;
	}
	
	public void getInfo() {
		System.out.println("싱글톤 내부 getInfo메소드 실행");
	}
}
