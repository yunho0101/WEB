package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
	
		//1.숫자누적
		//5부터 300까지 5의 배수만 모두 더해 출력
		int sum=0;
		for (int i = 5; i <= 300; i++) {
			if(i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println("전체의 합>>"+sum);
		//2.문자누적
		//먹고싶은 음식 4가지 입력받아
		String sum2="";
		for (int i = 0; i < 4; i++) {
			String data=JOptionPane.showInputDialog("먹고 싶은 음식");
			sum2=sum2+data+"랑";
		}
		System.out.println("먹고 싶은 음식 종류>>"+sum2);
	}
}
