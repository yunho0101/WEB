package 조건문;

import javax.swing.JOptionPane;

public class 인기투표 {

	public static void main(String[] args) {
		int iu=0;
		int yu=0;
		int bts=0;
		int none=0;
		for (int i = 0; i < 10; i++) {
			String data=JOptionPane.showInputDialog("좋아하는 연예인은? 1)아이유 2)유재석 3)BTS");
			if(data.equals("1")) {
				iu++; 
			}
			else if(data.equals("2")) {
				yu++;
			}
			else if(data.equals("3")) {
				bts++;
			}
			else {
				none++;
			}
		}
		System.out.println("아이유 "+ iu+"명");
		System.out.println("유재석 "+ yu+"명");
		System.out.println("BTS "+ bts+"명");
		System.out.println("무효표 "+ none+"명");
	}

}
