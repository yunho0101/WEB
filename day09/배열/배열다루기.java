package 배열;

public class 배열다루기 {
	//코드 정리 ctrl +shift +f
	public static void main(String[] args) {
		int[] x = new int[10]; // length: 10 // 총 저장공간 12개
		// index는 0부터 시작, 마지막 위치의 인덱스는 10보다 작음
		// 0~9
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;
		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
		// System.out.println(x[0]);
		// System.out.println(x[1]);
		// System.out.println(x[2]);
		// 우리가족의 성별을 char[]로 저장, 프린트
		// 우리가족의 이름을 String[]으로 저장, 프린트
		// 우리가족의 시력을 double[]로 저장, 프린트
		System.out.println();
		char[] gender = { '남', '여', '남', '남' };
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		String[] name = { "정", "김", "정", "정" };
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		double[] eye = { 1.0, 0.8, 0.8, 1.2 };
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		boolean[] food = { true, false, true, false };
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}
		String[] s=new String[3];
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
