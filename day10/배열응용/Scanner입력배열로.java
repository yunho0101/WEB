package 배열응용;

import java.util.Scanner;

public class Scanner입력배열로 {

	public static void main(String[] args) {
		//1.
		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자 입력>");
			num[i]=sc.nextInt();
		}
		System.out.println("첫번째+세번째:"+(num[0]+num[2]));
		
		//2.
		String[] words =new String[3];
		for (int i = 0; i < words.length; i++) {
			System.out.println("과목입력>");
			words[i]=sc.next();
			
		}
		System.out.println(words[0]+"보다는"+words[2]);
		
		sc.close();
	}

}
