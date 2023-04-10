package 배열;

import java.util.Arrays;

public class 정리문제3 {

	public static void main(String[] args) {
		String s1="참좋다";
		String s2="진짜 좋다";
		if(s1.equals(s2)) {
			System.out.println("문자열 동일");
		}
		else {
			System.out.println("문자열 다름");
		}
		if(s1.length()>s2.length()){
		System.out.println("s1이 더 길다");
		}
		else if (s1.length()<s2.length()) {
			System.out.println("s2가 더 길다");
		}

	}
	}

