package 배열;

import java.util.Scanner;

public class 배열최소값구하기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//자바프로그램과 콘솔(키보드)를 스트림(강물) open
		int[] s = new int[5];//{0,0,0}==>{11,33,22}
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt();
		}
		sc.close();
		int min=s[0];
		for (int x:s) {
			if(x<min) min=x;
		}
		System.out.println("최소값은"+min);
	}
	}

