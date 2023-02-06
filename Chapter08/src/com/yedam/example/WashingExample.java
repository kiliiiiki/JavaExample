package com.yedam.example;

public class WashingExample {

	public static void main(String[] args) {
		LGWashingMachine LGws = new LGWashingMachine();
		LGws.start();
		LGws.stop();
		LGws.change(2);
		LGws.end();
		LGws.dry();
	}

}
