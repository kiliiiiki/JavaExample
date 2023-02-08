package com.yedam.exam;

public class CardPayment implements Payment{
	public double cardRatio;
	
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	@Override
	public int online(int price) {
		return (int) (price*(1-((ONLINE_PAYMENT_RATIO/100)+cardRatio)));
	}

	@Override
	public int offline(int price) {
		return (int) (price*(1-((OFFLINE_PAYMENT_RATIO/100)+cardRatio)));
	}

	@Override
	public void showInfo() {
		System.out.println("***카드로 결제 시 할인정보");
	System.out.println("온라인 결제시 총 할인율 : "+((ONLINE_PAYMENT_RATIO/100)+cardRatio));
	System.out.println("오프라인 결제시 총 할인율 : "+((OFFLINE_PAYMENT_RATIO/100)+cardRatio));
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
