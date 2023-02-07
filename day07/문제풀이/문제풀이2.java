package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이2 {

	public static void main(String[] args) {
		String pass=JOptionPane.showInputDialog("당신이 먹고싶은 메뉴는?(자장면,라면,회)에서 선택");
		if (pass.equals("자장면")) {
			System.out.println("중국집으로가요");
		}
		else if (pass.equals("라면")) {
			System.out.println("분식집으로가요");
		}
		else if (pass.equals("회")) {
			System.out.println("횟집으로가요");
		}
		else {
			System.out.println("그냥 안먹어요");
		}
	}

}
