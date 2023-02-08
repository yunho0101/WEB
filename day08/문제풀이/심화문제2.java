package 문제풀이;

import java.util.Scanner;

public class 심화문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//컴퓨터.키보드
		System.out.print("정수1");
		int n1 = sc.nextInt(); 
		System.out.print("정수2");
		int n2 = sc.nextInt();
		System.out.print("점프값");
		int n3 = sc.nextInt();
		int sum=0;
		
		for (int i = n1; i <= n2; i+=n3) {
			sum=sum+i;
			if (sum>100){
				break;
			}
		
		}
		System.out.println(sum);
	sc.close();
	}
}
