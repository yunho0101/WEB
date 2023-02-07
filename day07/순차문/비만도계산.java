package 순차문;

import javax.swing.JOptionPane;

public class 비만도계산 {

	public static void main(String[] args) {
		String data1=JOptionPane.showInputDialog("신장");
		String data2=JOptionPane.showInputDialog("체중");
		double data11=Double.parseDouble(data1);
		double data22=Double.parseDouble(data2);
		double stand = (data11-100)*0.9;
		double result = (data22/stand)*100;
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
		
				

	}

}
