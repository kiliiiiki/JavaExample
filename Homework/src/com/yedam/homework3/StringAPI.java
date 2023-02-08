package com.yedam.homework4;

import java.util.Scanner;

public class StringAPI {
	public static void main(String[] args) {
		// 1) 세 개의 단어를 입력 받아 그 중 가장 짧은 단어와 길이 리턴하기
//		예시 )  입력> tiger
//		          입력> lion
//		          입력> rabbit
//		          출력> 가장 짧은 단어는 lion이며, 길이는 4 입니다.
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("입력1>");
//		String firstWord = sc.nextLine();
//		System.out.println("입력2>");
//		String secondeWord = sc.nextLine();
//		System.out.println("입력3>");
//		String thirdWord = sc.nextLine();
//		
//		String shortWord = firstWord + " : " + firstWord.length();
//		
//		if(firstWord.length() > secondeWord.length()) {
//			shortWord = secondeWord + " : " + secondeWord.length();
//			if(secondeWord.length() > thirdWord.length()) {
//				shortWord = thirdWord + " : " + thirdWord.length();
//			}
//		}else {
//			if(firstWord.length() > thirdWord.length()) {
//				shortWord = thirdWord + " : " + thirdWord.length();
//			}
//		}
//		
//		System.out.println(shortWord);

		// 2) 문자열 개수 세기(아스키코드값)
//		-> 입력 문자열에서 알파벳, 숫자, 공백의 개수를 구하시오.
//		예시) 
//		-> 입력 : 1a2b3c4d 5e
//		-> 출력 : 문자 :5개, 숫자:5개, 공백 : 1개

//		System.out.println("입력>");
//		String str = sc.nextLine();
//		int space = 0;
//		int num = 0;
//		int cha = 0;
//
////		1a2b3c4d 5e
//		for (int i = 0; i < str.length(); i++) {
//			char tempStr = str.charAt(i);
//
//			if (tempStr == 32) {
//				space++;
//			} else if (tempStr >= 48 && tempStr <= 57) {
//				num++;
//			} else if (tempStr >= 97 && tempStr <= 122) {
//				cha++;
//			}
//		}
//		System.out.println("숫자 : " + num + "개, 문자 : " + cha + "개, 공백 : " + space);

		//3) 중복되는 문자가 없는 문자열에서 두 문자사이의 거리 구하기
//		조건 : 입력되는 두 문자를 제외한 가운데 문자의 갯수를 두 문자간 거리로 한다.
//		예시)
//		-> 입력 : "abcdefghijklmnopqrstuvwxyz"
//		-----------------------------------
//		-> 입력 : 첫번째 문자 : c
//		-> 입력 : 두번째 문자 : f
//		-> 출력 : 두 문자간의 거리 : 2
//		------------------------------------
//		-> 입력 : 첫번째 문자 : e
//		-> 입력 : 두번째 문자 : a
//		-> 출력 : 두 문자간의 거리 : 3
		
//		System.out.println("입력>");
//		String alpha = sc.nextLine();
////		-> 입력 : "abcdefghijklmnopqrstuvwxyz"
//		System.out.println("첫번째 문자>"); //c -> 2
//		String firstWord = sc.nextLine();
//		System.out.println("두번째 문자>"); //f -> 5
//		String secondeWord = sc.nextLine();
//		
//		int firstIndex = alpha.indexOf(firstWord);
//		int secondeIndex = alpha.indexOf(secondeWord);
//		
//		//각 문자의 위치를 찾은 다음 큰 수 - 작슨 수
//		if(firstIndex < secondeIndex) {
//			System.out.println("두 문자간의 거리 : " + (secondeIndex - firstIndex-1));
//		} else if(firstIndex > secondeIndex) {
//			System.out.println("두 문자간의 거리 : " + (firstIndex- secondeIndex-1));
//		}
		
		//4) 중복문자 제거
//		입력 : aaabbccceedddd
//		출력 : abcd
		
		System.out.println("입력>");
		String strList = sc.nextLine();
		
		//indexOf, charAt
		//aaabbccceedddd
		//charAt(0)~charAt(문자열.length()-1)
		//charAt(0) -> a
		//indexOf(a) -> a의 위치 -> index : 0
		//indexOf(charAt(i)) == i
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<strList.length();i++) {
			if(strList.indexOf(strList.charAt(i))==i){
				System.out.println(i);
				sb.append(strList.charAt(i));
			}
		}
		System.out.println(sb);
		
		
		
		
		
	}
}
