package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이6 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("숫자1");
		String num2=JOptionPane.showInputDialog("숫자2");
		int num11=Integer.parseInt(num1);
		int num22=Integer.parseInt(num2);
		double result=num11/(double)num22;
		System.out.printf("%.2f",result);
	}

}
