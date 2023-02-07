package 조건문;

import java.util.Date;

public class IF문4 {

	public static void main(String[] args) {
		//Date-년월일시분초, java.util.Date
		
		Date date = new Date();
		int hour= date.getHours();
		System.out.println(date.getHours());
		System.out.println(date.getYear()+1990);//1990부터 셈
		System.out.println(date.getDay());//요일! 0(일요일)부터 시작		
		//int hour= 15;
		
		if (hour<11) {
			System.out.println("굿모닝");
		}
		else if(hour<14) {
			System.out.println("굿애프터눈");
		}
		else if (hour<20) {
			System.out.println("굿이브닝");
		}
		else {
			System.out.println("굿나잇");
		}
	}
}