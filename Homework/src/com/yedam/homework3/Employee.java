package com.yedam.homework2;

public class Employee {
//	Question 1]
//			1) Employee 클래스를 정의한다.
//				- 이름과 연봉을 필드로 가지며 
//				  생성자를 이용하여 값을 초기화한다.
//				- 각 필드의 getter만 존재한다.
//				- 메소드는 다음과 같이 정의한다.
//				(1) public void getInformation() : 이름과 연봉을 출력하는 기능
//				(2) public void print() : "수퍼클래스"란 문구를 출력하는 기능
//	3) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
//	- 출력결과
//		이름:이지나  연봉:3000  부서:교육부
//		수퍼클래스
//		서브클래스
	//필드
	//이름
	public String name;
	//연봉(급여)
	public int salary;
	//생성자
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	//메소드
	//getter 생성
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
//	(1) public void getInformation() : 이름과 연봉을 출력하는 기능
	public void getInformation() {
		System.out.print("이름 : " + name + "\t연봉 : " + salary);
	}	
//	(2) public void print() : "수퍼클래스"란 문구를 출력하는 기능
	public void print() {
		System.out.println("수퍼클래스");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
