package com.yedam.homework2;

public class Human {
//	1) Human 클래스를 정의한다.
//- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	protected String name;
	protected int height;
	protected int weight;
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
//홍길동님의 신장 168, 몸무게 45,
	public void getInformation() {
		System.out.print(name + "님의 신장 "
				+ height + ", 몸무게 : " + weight);
	}
	
	
	
	
	
}
