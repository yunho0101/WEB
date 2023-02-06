package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		//정보중 기본 데이터에 속하는 정보를 변수에 넣고 출력
		//정수
		int age=28;
		//실수
		double eye= 0.8;
		//문자1
		char gender = '남';
		//논리
		boolean food=false;//true/false
		//기본데이터X==> 너무 많이 쓰기 때문에 기본형처럼 쓸 수 있는 유일한 데이터
		String name="홍길동";//여러글자 쓸때는""
		//스트링, 실, 문자열!
		//프린트
		System.out.println("나의 나이는 "+age);
		System.out.println("나의 시력은 "+eye);
		System.out.println("나의 성별은 "+gender);
		System.out.println("나의 아침은 "+food);
		System.out.println("나의 이름은 "+name);
	}

}
