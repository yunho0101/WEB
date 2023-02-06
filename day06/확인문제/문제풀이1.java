package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이1{

	public static void main(String[] args) {
		String date=JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String what=JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		String result= "오늘 "+ date+"에 저는 수업이 끝나고 "+ what+ "할 예정입니다.";
		System.out.println(result);

	}

}