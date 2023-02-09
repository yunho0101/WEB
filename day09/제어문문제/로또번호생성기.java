package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		//아무값이나 발생시키는 부품==>Random
		Random r=new Random();//()안에 숫자를 넣으면: 씨앗값,seed값 
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호:" + r.nextInt(45));//0~44
		}

	}

}
