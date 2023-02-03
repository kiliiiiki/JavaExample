package com.yedam.access;

public class Application03 {

	public static void main(String[] args) {
		Member mem = new Member();
		
		mem.setid("kiliiiiki");
		mem.setPw("gusdud12");
		mem.setName("강현영");
		mem.setAge(25);
		
		System.out.println("아이디 : " + mem.getid());
		System.out.println("비밀번호 : " + mem.getPw());
		System.out.println("이름 : " + mem.getName());
		System.out.println("나이 : " + mem.getAge());

	}

}
