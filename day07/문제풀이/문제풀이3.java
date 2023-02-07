package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이3 {

	public static void main(String[] args) {
		String int1=JOptionPane.showInputDialog("정수1");
		String int2=JOptionPane.showInputDialog("정수2");
		int int11=Integer.parseInt(int1);
		int int22=Integer.parseInt(int2);
		
		if (int11>int22) {
		System.out.println(int11);
			}
		else if (int11<int22) {
			System.out.println(int22);
			}
		else {
			System.out.println("동일합니다");
		}
	}

}
