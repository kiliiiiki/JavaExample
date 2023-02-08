package com.yedam.exam;

public class SimplePayment implements Payment{
	
	public double simplePaymentRatio;
	
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}
	
	@Override
	public int online(int price) {
		return (int) (price*(1-((ONLINE_PAYMENT_RATIO/100)+simplePaymentRatio)));
	}

	@Override
	public int offline(int price) {
		return (int) (price*(1-((OFFLINE_PAYMENT_RATIO/100)+simplePaymentRatio)));
	}

	@Override
	public void showInfo() {
		System.out.println("***카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : "+((ONLINE_PAYMENT_RATIO/100)+simplePaymentRatio));
		System.out.println("오프라인 결제시 총 할인율 : "+((OFFLINE_PAYMENT_RATIO/100)+simplePaymentRatio));
		
	}
	
}
