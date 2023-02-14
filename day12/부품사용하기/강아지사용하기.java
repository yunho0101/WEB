package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		
		강아지 p1= new 강아지();
		p1.price=1000;
		p1.kind="말티즈";
		p1.꼬리흔들기();
		System.out.println("p1의 가격: "+p1.price);
		System.out.println("p1의 종: "+p1.kind);
		
		강아지 p2= new 강아지();

		p2.price=2000;
		p2.kind="푸들";
		p2.짖는다();
		System.out.println("p2의 가격: "+p2.price);
		System.out.println("p2의 종+: "+p2.kind);
	}

}
