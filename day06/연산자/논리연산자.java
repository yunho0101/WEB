package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		//논리적으로 판단을 하고 싶은데, 조건이 2개 이상이여서
		//어떻게 판단할지 모르는 경우 사용
		int id=1111;
		int id2=2222;
		
		int pw=3333;
		int pw2=3333;
		
		System.out.println(id==id2);
		System.out.println(pw==pw2);
		//&&, and조건, 두 조건이 모두 맞아야 true
		//로그인 처리
		System.out.println(id==id2&&pw==pw2);
		
		int mem1=111;//=는 대입연산자
		int mem2=232;
		//||,or조건, 조건 중에서 하나만 맞아도 true
		System.out.println(mem1== 111|| mem2==222);

	}

}
