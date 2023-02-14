package 배열복습;

public class 스트링과배열1 {

	public static void main(String[] args) {
		// 스트링의 일부를 추출, 확인하는 메소드
		String s = "나는 프로그래머야";
		String s2 = "진짜!";
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0));
		char c =s.charAt(0);
		System.out.println(s.endsWith("야"));
		boolean result =s.endsWith("야");
		String result2 =s.substring(3);
		String result3 =s.substring(3,8);
		
	}

}
