package 배열복습;

public class 스트링과배열연습 {

	public static void main(String[] args) {
		String s = " 010-245-1234 ";
		String s1= s.trim();
		System.out.println(s1);
		String[] s2=s1.split("-");
		System.out.println(s2[0]);
		
		if (s2[0]=="011") {
			System.out.println("sk");
		}
		else if (s2[0]=="019") {
			System.out.println("lg");
		}
		else {
			System.out.println("apple");
		}
		
		if (s2[1].length()>=4) {
			System.out.println("최신폰");
		}
		else {
			System.out.println("올드폰");
		}
		int total=s2[0].length()+s2[1].length()+s2[2].length();
		System.out.println(total);
		if(total>=10) {
			System.out.println("유효한 번호");
		}
		else {
			System.out.println("유효하지않은 번호");
		}
	}

}
