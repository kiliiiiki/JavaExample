package com.yedam.homework3;

//	2) RPGgame 클래스를 정의한다.
//- Keypad를 구현하는 클래스.
public class RPGgame implements KeyPad {
//- 현재 모드를 값으로 가지는 필드를 가지며
	private int currentMode;

//  생성자를 이용하여 값을 초기화한후 "RPGgmae 실행"을 출력한다.
	public RPGgame() {
		currentMode = KeyPad.NORMAL_MODE;
		System.out.println("RPGgmae 실행");
	}
//  ( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )

	// - Keypad 인터페이스에 정의된 추상 메서드를 다음과 같이 오버라이딩한다.
	@Override
	// (1) "캐릭터가 위쪽으로 이동한다"를 출력한다.
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
	}

	@Override
	// (2) "캐릭터가 아래쪽으로 이동한다"를 출력한다.
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}

	@Override
	// (3)
	// - NORMAL_MODE : "캐릭터가 한칸단위로 점프한다."를 출력한다.
	// - HARD_MODE : "캐릭터가 두칸단위로 점프한다."를 출력한다.
	public void rightUpButton() {
		if (currentMode == KeyPad.NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		} else if (currentMode == KeyPad.HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	// (4)
	// - NORMAL_MODE : "캐릭터가 일반 공격."를 출력한다.
	// - HARD_MODE : "캐릭터가 HIT 공격."를 출력한다.
	public void rightDownButton() {
		switch (currentMode) {
		case KeyPad.NORMAL_MODE: // 0
			System.out.println("캐릭터가 일반 공격");
			break;
		case KeyPad.HARD_MODE: // 1
			System.out.println("캐릭터가 HIT 공격");
			break;
		}
	}

	@Override
	// (5) 모드를 바꾸고 현재 모드를 출력하는 기능
	// ( NORMAL_MODE-> HARD_MODE / HARD_MODE -> NORMAL_MODE)
	public void changeMode() {
		if(currentMode == KeyPad.NORMAL_MODE) {
			currentMode = KeyPad.HARD_MODE;
			System.out.println("현재 모드 : HardMode");
		}else if(currentMode == KeyPad.HARD_MODE) {
			currentMode = KeyPad.NORMAL_MODE;
			System.out.println("현재 모드 : NormalMode");
		}
//		currentMode = (currentMode == KeyPad.HARD_MODE) ? KeyPad.NORMAL_MODE : KeyPad.HARD_MODE; 
	}
}
