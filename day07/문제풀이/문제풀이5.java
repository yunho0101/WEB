package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이5 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("숫자1");
		String num2=JOptionPane.showInputDialog("숫자2");
		String arith=JOptionPane.showInputDialog("사칙연산");
		double num11=Double.parseDouble(num1);
		double num22=Double.parseDouble(num2);
		if (arith == "+") {
			System.out.println(num11+num22);
		}
		else if (arith == "-") {
			System.out.println(num11-num22);
		}
		else if (arith == "*") {
			System.out.println(num11*num22);
		}
		else {
			System.out.println(num11/num22);
		}
		
	}

}
