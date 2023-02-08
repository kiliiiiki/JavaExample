package com.yedam.homework;

public class StandardWeightInfo extends Human{

	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.printf("표준체중 : %.1f 입니다.\n"  );
	}
	public double getStandardWeight() {
		double result = (double)((height - 100) *0.9);
		return result;
	}
	
	

}
