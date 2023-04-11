package 문자열;

public class 스트링비교 {

	public static void main(String[] args) {
		String s="정길동";
		String s2="정길동";
		//String 은 s를 프린트 할때, 그 주소가 가르키는 char들 프린트 되게
		//재정의 되어있는 객체(toString()) 오버라이드
		System.out.println(s);
		System.out.println(s2);
		//String이 가르키는 char들이 동일한지 equal()
		System.out.println(s.equals(s2));
		System.out.println(s==s2);
		

	}

}
