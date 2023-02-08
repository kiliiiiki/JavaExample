package com.yedam.homework3;

public class Movie extends Culture{
//	2) Movie 클래스를 정의한다.
//	- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	String gerne;
	public Movie(String title, int director, int actor, String gerne) {
		super(title, director, actor);
		this.gerne = gerne;
	}
//	- 메소드는 다음과 같이 정의한다.
//	(1) public void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
	@Override
	public void getInformation() {
//		영화제목 : 추격자
//		감독 : 7
//		배우 : 5
//		영화총점 : 12
//		영화평점 : ☆☆☆☆
		System.out.println("영화제목 : " + title);
		System.out.println("감독 수 : " + director);
		System.out.println("배우 수 : " + actor);
		System.out.println("영화총점 : " + total);
		System.out.println("평점 : " + getGrade());
	}
	
}
;
