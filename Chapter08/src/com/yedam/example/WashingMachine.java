package com.yedam.example;

public interface WashingMachine extends Dryer{
	public void start();
	public void stop();
	public void end();
	public void change(int speed);
}
