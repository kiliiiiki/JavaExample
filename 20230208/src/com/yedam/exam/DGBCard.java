package com.yedam.exam;

public class DGBCard extends Card{
	
	public String company = "대구은행";
	public String cardStaff;

	public DGBCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		System.out.println("카드정보 (Card NO : "+cardNo+", 유효기간 : "+validDate+", CVC : "+cvc
				+"\n"+"담당직원 - "+cardStaff+", "+company);
	}
	
	

}
