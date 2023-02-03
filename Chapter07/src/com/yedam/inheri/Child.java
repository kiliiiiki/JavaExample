package com.yedam.inheri;

public class Child extends Parent{
	
	//필드
	 
	 private String lastName = "현영";
	 private String bloodType = "A";
	 private int age = 25;
	 private String hobby = "쇼핑";
	 
	 //생성자
	 Child(String firstName, String lastName, String bloodType, int age, String hobby){
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.bloodType = bloodType;
		 this.age = age;
		 this.hobby = hobby;
	 }
	 
	 //메소드
	 public void getInfo() {
		 super.getInfo();
		 
	 }
}
