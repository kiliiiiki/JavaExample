package com.yedam.array;

public class Exam05 {

	public static void main(String[] args) {
		//최대값 또는 최소값이 위치하는 인덱스 구하기
		int[] array = {20,50,70,80,30,10,90,100};
		
		int max = 0;
		int min = 200;
		int maxr = 0;
		int minr = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
				maxr = i;
				}
			if(array[i]<min) {
				min=array[i];
				minr = i;
				
			}
		}
		System.out.println(maxr);
		System.out.println(minr);
		
		for(int i=0; i<args.length;i++) {
			System.out.println("명령라인 출력 : "+args[i]);
		}
	}

}
