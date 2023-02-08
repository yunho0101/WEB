package 조건문;

import javax.swing.JOptionPane;

public class 설문조사 {

	public static void main(String[] args) {
		//10명에게 배부른가요??를 물어봐서
		//배부른사람, 안부른사람 몇명 카운트
		int full=0;
		int nofull=0;
		for (int i = 0; i < 10; i++) {
			String data=JOptionPane.showInputDialog("배부른가요? 1)배부름 2)안배부름");
			if(data.equals("1")) {
				//full=full+1;//0+1
				full++; //1만 증가시킬 때 쓰나요?
			}
			else if(data.equals("2")) {
				nofull++;
			}//else
		}//for
		System.out.println("배부른사람 몇명?"+ full+"명");
		System.out.println("안배부른사람 몇명?"+ nofull+"명");
	}

}
