package 문제풀이;

import java.util.Scanner;

public class 심화문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//컴퓨터.키보드
		System.out.print("정수1");
		int n1 = sc.nextInt(); 
		System.out.print("정수2");
		int n2 = sc.nextInt();
		int sum=0;
		for (int i = n1; i <= n2; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		
	sc.close();
	}

}
