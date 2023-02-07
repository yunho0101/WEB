package 조건문;

import java.util.Date;

public class IF문6 {

	public static void main(String[] args) {
		Date date = new Date();
		int year= date.getYear()+1900;
		int day= date.getDay();
		int month= date.getMonth()+1;
		System.out.println(year);
		System.out.println(day);
		System.out.println();
			if (year>=2000) {
			System.out.println("밀레니엄 세대시군요");
			}
			else {
			System.out.println("밀레니엄세대가 아니시군요");
			}
			if (day==0 ||day== 6) {
				System.out.println("쉬~~자");
			}
			else {
				System.out.println("열심히 공부하자");
			}
			if (month==2) {
				System.out.println("28일까지");
			}
			else if (month==4||month==6||month==9||month==11) {
				System.out.println("30일까지");
			}	
			else {
				System.out.println("31일까지");
			}
	}
}