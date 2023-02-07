package 조건문;

import java.util.Date;

public class Switch문2 {

	public static void main(String[] args) {
		Date date = new Date();
		int month=date.getMonth() +1;//getmonth는 0-11로 세기떄문
		System.out.println(month);
		//int month =2;
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("봄");
			break;
		case 9: case 10: case 11:
			System.out.println("봄");
			break;
		default:
			System.out.println("겨울");
			break;
		}
	}
}