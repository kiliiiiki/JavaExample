package com.yedam.exe;

import java.util.Scanner;

import com.yedam.member.MemberService;

public class ExeApp {
	
	private String wholemenu = null;
	private String menu1 = null;
	private String menu2 = null;
	private String menu3 = null;
	private String menu4 = null;
	private Scanner sc = new Scanner(System.in);
	private MemberService ms = new MemberService();
	
	private void wholemenu() {
		System.out.println("1.회원정보관련 | 2.장바구니 | 3. 게시판 | 4.공지사항 | 5.리뷰&댓글 | 6.로그아웃");
		System.out.println("✔원하는 서비스를 선택해주세요✔");
		wholemenu = sc.nextLine();
	}
	
	private void menu1() {
		System.out.println("1.회원가입,등록 | 2.로그인 | 3.회원정보수정 | 4.회원정보삭제");
		System.out.println("✔원하는 서비스를 선택해주세요✔");
		menu1 = sc.nextLine();	
	}
	
	private void menu2() {
		System.out.println("1.상품입력 | 2.장바구니 확인 | 3.주문 | 4.결제 | 5.송장번호조회 | 6.예상출고일조회");
		System.out.println("✔원하는 서비스를 선택해주세요✔");
		menu2 = sc.nextLine();		
	}
	
	private void menu3() {
		System.out.println("1.반품 | 2.환불 | 3.오배송 | 4.사이즈조회");
		System.out.println("✔원하는 서비스를 선택해주세요✔");
		menu3 = sc.nextLine();		
	}
	
	private void menu4() {
		System.out.println("1.입고지연확인 | 2.이벤트");
		System.out.println("✔원하는 서비스를 선택해주세요✔");
		menu4 = sc.nextLine();	
	}
	
	public void run() {
		
		while(true) {
			wholemenu();
			
			if(wholemenu.equals("1")) {
				menu1();
				if(menu1.equals("1")) {
					ms.insertMem();
				}else if(menu1.equals("2")) {
					ms.login();
				}else if(menu1.equals("3")) {
					ms.modifyMember();
				}else if(menu1.equals("4")) {
					ms.deleteMember();
				}
			}else if(wholemenu.equals("2")) {
				
			}else if(wholemenu.equals("3")) {
				
			}else if(wholemenu.equals("4")) {
				
			}else if(wholemenu.equals("5")) {
				
			}else if(wholemenu.equals("6")) {
				MemberService.memberInfo = null;
				System.out.println("LOGOUT💨💨");
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
