package 배열응용;

import java.util.Scanner;

public class 입력받아배열넣기확인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] voy1 = new String[3];
		String[] voy2 = new String[3];

		for (int i = 0; i < voy1.length; i++) {
			System.out.println("작년에 가고 싶었던 곳");
			voy1[i] = sc.next();
		}

		for (int i = 0; i < voy2.length; i++) {
			System.out.println("올해가고싶은 곳");
			voy2[i] = sc.next();
		}
		int count = 0;
		for (int i = 0; i < voy2.length; i++) {
			if (voy1[i].equals(voy2[i])) {
				count++;
			}
		}
		System.out.println("작년과 올해 가고싶은 곳과 우선순위가 동일한 곳은: " +count+ "곳");

		sc.close();
	}
}
