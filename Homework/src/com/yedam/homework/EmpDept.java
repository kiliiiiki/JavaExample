package com.yedam.homework;

public class EmpDept extends Employees{
	public String department;

	public EmpDept(String name, int salary, String department) {
		//부모 생성자를 통해 부모 객체 생성
		super(name, salary);
		//자식 객체 생성할 때 부서 이름 초기화
		this.department=department;
		
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println(" 부서 : " + department);
	}

	@Override
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}
	
	

}
