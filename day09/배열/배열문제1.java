package 배열;

public class 배열문제1 {

	public static void main(String[] args) {
	int[] week = {1, 2, 3, 4, 5, 6, 7};
	System.out.println(week[0]); 
	System.out.println(week[1]);
	System.out.println("전체 개수: " + week.length);
	week[4] = 10;
	week[6] = 12;
	System.out.println(week[4]);
	System.out.println(week[6]);
	
	}

}
