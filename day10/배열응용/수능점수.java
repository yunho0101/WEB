package 배열응용;

import java.util.Random;

public class 수능점수 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];
		Random r = new Random(42);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);
		}
		// 1.
		int per = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 450) {
				per++;
				int index = i;

				System.out.println(index + 1 + "번 수험생이 만점");

			}

		}
		System.out.println("만점자는" + per + "명");
		System.out.println("------------------------");

		// 2. 0점 몇명인지
		int zero = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 0) {
				zero++;
			}
		}
		System.out.println("0점자는" + zero + "명");
		System.out.println("------------------------");
		// 3.합계,평균
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum = sum + jumsu[i];
		}
		double avg = (double) sum / jumsu.length;
		System.out.println("합계는:" + sum);
		System.out.println("평균은: " + avg);
		System.out.println("------------------------");

		// 4.평균보다 +-50점인 학생 카운트
		int sco = 0;
		for (int i = 0; i < jumsu.length; i++) {
			double sco1 = avg + 50;
			double sco2 = avg - 50;
			if (sco1 >= jumsu[i] && sco2 <= jumsu[i]) {
				sco++;
			}
		}
		System.out.println("평균+-50내에 학생은: " + sco + "명");
		System.out.println("------------------------");

		// 5.상위 30% 몇명, 평균
		int top = 0;
		int jumsu2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (315 < jumsu[i]) {
				top++;
				jumsu2 = jumsu2 + jumsu[i];
			}
		}
		double avg1 = (double) jumsu2 / top;
		System.out.println("상위 30%학생은: " + top + "명");
		System.out.println("상위 30%의 평균은: " + avg1 + "점");

	}
}
