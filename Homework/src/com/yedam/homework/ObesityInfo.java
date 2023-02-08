package com.yedam.homework;

public class ObesityInfo extends StandardWeightInfo{

	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	@Override
	public void getInformation() {
		System.out.println(name + "님의 신장 " + height + ", 몸무게 : " + weight + ", " + obesity + "입니다.");
	}
	
	public double getObesity() {
		//부모클래스에 있는 표준 체중 메소드를 활용 -> 비만도 연산
		double bmi = (weight - super.getStandardWeight())/super.getStandardWeight()*100;
		//bmi에 따른 비만도
		double bmi = getObesity();
		String obesity = null;
		if(bmi <= 18.5) {
			obesity = "저체중";
		}else if(bmi <= 22.9) {
			obesity = "정상";
		}else if(bmi <= 24.9) {
			obesity = "과체중";
		}else {
			obesity = "비만";
		}
		return bmi;
		
	}
	
	

}
