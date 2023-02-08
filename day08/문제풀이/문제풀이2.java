package 문제풀이;

import java.util.Scanner;

public class 문제풀이2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//컴퓨터.키보드
		System.out.print("구매할 사과 갯수");
		int fru1 = sc.nextInt(); 
		System.out.print("사과의 가격은?");
		int num1=sc.nextInt();
		System.out.print("구매할 딸기 갯수");
		int fru2 = sc.nextInt(); 
		System.out.print("딸기의 가격은?");
		int num2=sc.nextInt();
		int num11=fru1 * num1;
		int num22= num2 * fru2;
			
		System.out.println("사과의 구매가격은"+(fru1*num1)+"입니다");
		System.out.println("딸기의 구매가격은"+(fru2*num2)+"입니다");
		System.out.println("전체 구매가격은"+(num11+num22)+"입니다");
	sc.close();
	}

}
