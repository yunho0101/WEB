package 문제풀이;

import java.util.Scanner;

public class 문제풀이1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//컴퓨터.키보드
		System.out.print("아이디");
		String id = sc.next();
		System.out.print("비밀번호");
		String pw = sc.next();
		if(id.equals("root")&& pw.equals("1234")) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("로그인 실패!");
		}
	
	sc.close();
	}

}
