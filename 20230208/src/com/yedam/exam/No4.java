package com.yedam.exam;

public class No4 {

	public static void main(String[] args) {
		String[] arr = {"010102-4", "991012-1", "960304-1", "881012-2","040403-3"};
		int boy = 0;
		int girl = 0;
		for(int i=0; i<arr.length; i++) {
			char gender = arr[i].charAt(7);
			switch(gender) {
			case '1':
			case '3':
				boy++;
				break;
			case '2':
			case '4':
				girl++;
			}
		}
		System.out.println("남 "+boy+" 여 "+girl);

	}

}
