package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5;// 오전손님
		int count2 = 4;// 오후손님

		// 계산기 3이용
		// 1. 전체손님 수 반환 받아 오늘 온 손님의 총 합은 9명입니다 프린트
		int result1=cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총합은 "+result1+"입니다");
		// 2. 오전과 오후 손님 수 차이 프린트
		int result2=cal3.minus(count1, count2);
		System.out.println("오늘 오전과 오후 손님 수 차이는 "+Math.abs(result2)+"입니다");
		// 3. 오전에 들어온 손님의 결제 금액은?
		int result3=cal3.mul(price, count1);
		System.out.println("오전에 들어온 손님의 결제 금액은 "+result3+"입니다");
		// 4. 오후에 들어온 손님의 결제 금액은?
		int result4=cal3.mul(price, count2);
		System.out.println("오후에 들어온 손님의 결제 금액은 "+result4+"입니다");
		// 5.오전과 오후에 들어온 손님의 총 결제금액은?
		int result5= cal3.add(result3,result4);
		System.out.println("오전과 오후에 들어온 손님의 총 결제 금액은 "+result5+"입니다");
		//6.1인당 결제금액은?
		int result6= cal3.div(result5, result1);
		System.out.println("1인당 결제금액은 "+result6+"입니다");
	}

}
