package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이4 {

	public static void main(String[] args) {
		String sno = JOptionPane.showInputDialog("사원번호를 입력하세여");
		char work = sno.charAt(0);
			System.out.println(work);
		if(work=='A') {
				System.out.println("기획부");
		}
		else if(work=='B') {
			System.out.println("총무부");
		}
		else if(work=='C') {
			System.out.println("개발부");
		}
		else {
			System.out.println("해당부서없음");
		}
	}
}
