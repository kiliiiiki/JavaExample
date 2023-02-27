package com.yedam.member;

import java.util.Scanner;

public class MemberService {
	
	public static Member memberInfo = null;
	
	Scanner sc = new Scanner(System.in);
	
	//회원가입, 등록
	public void insertMem() {
		Member mem = new Member();
		System.out.println("ID>");
		mem.setMemberId(sc.nextLine());
		System.out.println("PW>");
		mem.setMemberPw(sc.nextLine());
		System.out.println("이름>");
		mem.setMemberName(sc.nextLine());
		System.out.println("생년월일>");
		mem.setMemberBirth(sc.nextLine());
		System.out.println("주소>");
		mem.setMemberAddr(sc.nextLine());
		
		int result = MemberDAO.getInstance().insertMem(mem);
		
		if(result>0) {
			System.out.println("회원가입이 완료되었습니다.");
		}else {
			System.out.println("회원가입에 실패하셨습니다.");
		}
		
	}
	
	//로그인
	public void login() {
		Member member = null;
		System.out.println("ID>");
		String memberId = sc.nextLine();
		System.out.println("PW>");
		String memberPw = sc.nextLine();
		
		member = MemberDAO.getInstance().login(memberId);
		
		if(member != null) {
			if(member.getMemberPw().equals(memberPw)) {
				System.out.println("로그인 성공");
				System.out.println("💕💕WELCOME "+member.getMemberName()+"님💕💕");
				
				memberInfo = member;
			}else {
				System.out.println("🙏비밀번호를 다시 확인해주세요🙏");
			}
		}else {
			System.out.println("😥존재하지 않는 아이디 입니다😥");
		}
	}
	
	//회원정보수정
	public void modifyMember() {
		Member member = new Member();
		System.out.println("ID 수정>");
		member.setMemberId(sc.nextLine());
		System.out.println("PW 수정>");
		member.setMemberPw(sc.nextLine());
		System.out.println("이름 수정>");
		member.setMemberName(sc.nextLine());
		System.out.println("생년월일 수정>");
		member.setMemberBirth(sc.nextLine());
		System.out.println("주소 수정>");
		member.setMemberAddr(sc.nextLine());
		System.out.println("회원 정보 수정 요청완료");
		
	}
	
	//회원정보삭제
	public void deleteMember() {
		System.out.println("ID>");
		int result = MemberDAO.getInstance().deleteMember(sc.nextLine());
		
		if(result>0) {
			MemberService.memberInfo = null;
			System.out.println("회원 정보 삭제 요청");
		}else {
			System.out.println("회원 정보 삭제 요청 불가");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
