package com.yedam.homework3;

public class KeyPadExample {
	public static void main(String[] args) {
//		- 출력결과
//		RPGgame 실행
		KeyPad game = new RPGgame();
//		캐릭터가 위쪽으로 이동한다.
		game.leftUpButton();
//		캐릭터가 한칸단위로 점프한다.
		game.leftDownButton();
//		현재 모드 : HARD_MODE
		game.changeMode();
//		캐릭터가 두칸단위로 점프한다.
		game.rightUpButton();
//		캐릭터가 HIT 공격.
		game.rightDownButton();
//		캐릭터가 아래쪽으로 이동한다.
		game.leftDownButton();
//		현재 모드 : NORMAL_MODE
		game.changeMode();
//		캐릭터가 일반 공격.
		game.rightDownButton();
//		======================
//		ArcadeGame 실행
		game = new ArcadeGame();
//		캐릭터가 위쪽으로 이동한다.
		game.leftUpButton();
//		캐릭터가 한칸단위로 점프한다.
		game.leftDownButton();
//		현재 모드 : HARD_MODE
		game.changeMode();
//		캐릭터가 두칸단위로 점프한다.
		game.rightUpButton();
//		캐릭터가 HIT 공격.
		game.rightDownButton();
//		캐릭터가 아래쪽으로 이동한다.
		game.leftDownButton();
//		현재 모드 : NORMAL_MODE
		game.changeMode();
//		캐릭터가 일반 공격.
		game.rightDownButton();
	}
}
