package com.yedam.homework3;

public interface KeyPad {
//1) Keypad 인터페이스를 정의한다.
//- 다음과 같이 상수 필드를 정의한다.
//(1) public static final int NORMAL_MODE = 0;
//(2) public static final int HARD_MODE = 1;
	public int NORMAL_MODE = 0;
	public int HARD_MODE = 1;
//- 다음과 같이 추상 메서드를 정의한다.
//(1) 왼쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void leftUpButton();
//(2) 왼쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void leftDownButton();
//(3) 오른쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void rightUpButton();
//(4) 오른쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
	public abstract void rightDownButton();
//(5) 모드를 바꾸고 현재 모드를 출력하는 기능
//    (NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
	public abstract void changeMode();
}
