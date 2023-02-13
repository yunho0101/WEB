package 배열복습;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정렬할 때는 Arrays
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		// for: 입력, 출력, i 활용가능
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1; // 1~1000
		}
		// for-each: 알아서 위치값을 옮겨주면서 하나씩 꺼내옵니다
		// 출력용!
		for (int x : jumsu) {
			System.out.println(x);
		}
		// 오름차순(작->큰), 내림차순(큰->작)
		Arrays.sort(jumsu);
		// sort(jumsu)==>jumsu가 바뀜(원본 파괴)
		// 파괴형 함수
		String n = JOptionPane.showInputDialog("숫자입력");
		int n2 = Integer.parseInt(n);
		// parseInt(n)==> ram에 저장된 n이 변경된건 아님(원본 비파괴)
		// 비파괴형 함수
		System.out.println("----------------");

		for (int x : jumsu) {
			System.out.println(x);
		}
		// 정렬후, 최대값,최소값을 프린트
		System.out.println("최소값: " + jumsu[0]);
		System.out.println("최대값: " + jumsu[jumsu.length - 1]);
		//상위 30%, 인원 3000명, 높은 점수부터 3000개 추출
		int sum30=0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30=sum30+jumsu[i];//sum+i
		}
		System.out.println("상위 30%의 평균: "+(sum30/3000.0));
		//하위30%
		int sum0=0;
		for (int i = 0; i < 3000; i++) {
			sum0+=jumsu[i];
		}
		System.out.println("하위 30%평균: "+sum0/(3000.0));
		String result= Arrays.toString(jumsu);//비파괴, String
		System.out.println(result);
	}

}
