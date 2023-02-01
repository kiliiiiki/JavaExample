package com.yedam.array;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 |4. 분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			
			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
			}else if(selectNo == 2) {	
				//1번 메뉴를 변경하고 싶을 때 혹시나 상황을 대비해서
				scores = new int[studentNum];
				for(int i=0; i<scores.length;i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				
			}else if(selectNo == 3) {
				for(int i=0; i<scores.length;i++) {
					System.out.println("scores["+i+"]>" + scores[i]);
					
				}
							
			}else if(selectNo == 4) {
				int max = 0;
				int sum=0;
				for(int i=0; i<scores.length; i++) {
					if(max<scores[i]);{
						max = scores[i];
					}
					sum+=scores[i];
				}
				System.out.println("최고 점수 : "+max);
				
				double avg = (double)sum/scores.length;
				System.out.println("평균 점수 : "+avg);
			}else if(selectNo == 5) {
				run = false;
			}
		}

	}

}
