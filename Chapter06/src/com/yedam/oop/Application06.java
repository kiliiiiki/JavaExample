package com.yedam.oop;

public class Application06 {
	
	//필드 선언(stack)
	static int num = 1;//(오류없음) int num = 1;(오류있음)
	//정적 필드 선언(method)
	static int sNum  =1;
	
	//필드 선언
	int field1; //인스턴스 필드(heap)
	
	//메소드
	void info() {
		System.out.println("info 출력");
	}
	
	
	
	
	
	
	
	//메소드 영억에 포함되어 있는 정적 메소드(method)
	public static void main(String[] args) {
		//this.field1 =1; this 키워드는 힙 영역 -> 메소드 영역에서 사용 불가
		
		//클래스 한 공간에서 정적 멤버, 인스턴스 멤버 같이 사용하고 싶다
		//1) 인스턴스 필드 -> 정적 메소드에서 사용
		//자기자신을 객체로 만든 다음 인스턴스 필드를 호출해서 사용
		//2) 필드 -> 정적 필드로 변경해서 사용
		Application06 app = new Application06();
		app.field1 =1;
		
		//info(); ->오류
		app.info();
		
		num = num+1;
		System.out.println(num);
		
		double result1 = 10*10*StaticCal.PI;
		
		int result2 = StaticCal.plus(10, 5);
		int result3 = StaticCal.minus(10, 5);
		
		System.out.println("result1 : " +result1);
		System.out.println("result2 : " +result2);
		System.out.println("result3 : " +result3);

	}

}
