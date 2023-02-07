package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이1 {
	public static void main(String[] args) {
			String pass=JOptionPane.showInputDialog("암호를대시오");
			if (pass.equals("pass")) {
				System.out.println("들어오세요");
			}
			else {
				System.out.println("나가세요");
			}

	}

}
