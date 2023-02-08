package com.yedam.exam;

public abstract interface Payment {
	public double ONLINE_PAYMENT_RATIO=5;
	public double OFFLINE_PAYMENT_RATIO=3;
	
	public abstract int online(int price);
	public abstract int offline(int price);
	public abstract void showInfo();
	
}
