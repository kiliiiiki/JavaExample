package com.yedam.homework;

public class Human {
	protected String name;
	protected int height;
	protected int weight;
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void getInformation() {
		System.out.print("이름 : " + name + " 키 : " + height + " 몸무게 : " + weight);
	}
}
