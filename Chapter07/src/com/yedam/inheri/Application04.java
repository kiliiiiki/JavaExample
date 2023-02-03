package com.yedam.inheri;

public class Application04 {

	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		//이륙 -> 부모 클래스에 있는 메소드 호출
		sa.takeOff();
		//비행모드 확인 -> 자식 클래스에 있는 오버라이딩(자식 클래스에서 쓰러 갔다가 조건 안맞아서 부모 클래스로 이동)
		sa.fly();
		//비행모드 변경 -> NORMAL -> SUPERSONIC
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		//비행모드 확인 -> 자식 클래스
		sa.fly();
		//비행모드 변경
		sa.flyMode = SuperSonicAirPlane.NORMAL;
		//비행모드 확인
		sa.fly();
		//착륙
		sa.land();

	}

}
