package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		int count1 = 0;
		int count2 = 0;
		// 1.1학기보다 성적 오른 학생 몇명?
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1++;
			}
		}
		System.out.println("1학기보다 성적이 오른 학생은: " + count1 + "명");
		System.out.println("------------------------------------");
		// 2.성적이 동일한 학생 몇명?

		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
			}
		}
		System.out.println("1,2학기 성적이 동일한 학생은: " + count2 + "명");
		System.out.println("------------------------------------");
		// 3.2학기 학생중 만점인 학생의 이름과 번호는?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println(i + 1 + "번 " + names[i] + "학생이 100점을 받았습니다.");
			}
		}
		System.out.println("------------------------------------");
		// 4.1학기, 2학기 평균 중 누가 더 높나요?
		int sum1 = 0;
		for (int i = 0; i < term1.length; i++) {
			sum1 = sum1 + term1[i];
		}
		double avg1 = (double) sum1 / term1.length;
		int sum2 = 0;
		for (int i = 0; i < term2.length; i++) {
			sum2 = sum2 + term2[i];
		}
		double avg2 = (double) sum2 / term2.length;
		if (avg1 > avg2) {
			System.out.println("1학기 성적 평균이 더 높음");
		} else if (avg1 < avg2) {
			System.out.println("2학기 성적 평균이 더 높음");
		} else {
			System.out.println("1,2학기 평균이 같음");
		}
		System.out.println("------------------------------------");
		// 5.뉴진스의 1학기 성적,2학기 성적은?
		for (int i = 0; i < names.length; i++) {
			if (names[i] == "뉴진스") {
				System.out.println("뉴진스의 1학기 성적은 " + term1[i] + "점이고, 2학기 성적 은" + term2[i] + "점 입니다");
			}
		}

	}

}