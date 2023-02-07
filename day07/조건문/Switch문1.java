package 조건문;

public class Switch문1 {

	public static void main(String[] args) {
		int myTour=10;
		switch(myTour) {
		case 10:
			System.out.println("VVIP");
			break;//switch문은 수동으로 break 써주어야함
		case 6:
			System.out.println("VIP");
			break;
		default:
			System.out.println("Normal");
		}
	}
}