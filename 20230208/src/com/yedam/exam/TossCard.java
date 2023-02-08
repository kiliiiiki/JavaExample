package com.yedam.exam;

public class TossCard extends Card{
	
	public String company = "Toss";
	public String cardStaff;

	public TossCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;		
	}

	@Override
	public void showCardInfo() {
		
		System.out.println("카드정보 - Card NO, " + cardNo +"\n"+ "담당직원 - " + cardStaff +", "+company);
	}
	
	

}
