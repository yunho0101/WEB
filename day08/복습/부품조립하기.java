package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		//1.자주써서 RAM에 언제든 사용할 수 있도록 준비되어있음
		//	망치
		//	부품명.기능
		//2.쓸 때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어
		//	RAM에 저장해두고 사용
		//	벽돌
		//	벽돌 b1 =new 벽돌()
		//	벽돌 b2 =new 벽돌()
		//	벽돌 b3 =new 벽돌()
		
		JFrame f =new JFrame();
		f.setSize(400,500);
		
		f.getContentPane().setBackground(Color.green);
		
		JLabel l =new JLabel(); //윗글자
		l.setText("당신이 생각한 숫자를 입력");
		
		JTextField text = new JTextField();//입력칸
		JButton b =new JButton();//버튼
		FlowLayout flow=new FlowLayout();
		Font font=new Font("궁서",1,20);
		Font font2=new Font("궁서",1,30);

		//윗부분에 글자 들어가는 부분
		l.setFont(font);
		l.setForeground(Color.red);
		//버튼 배경,글자색, 폰트 지정
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		b.setFont(font2);
		b.setText("Number Game");
		
		//JFrame에 배치를 물 흐르듯이 순서대로 붙여주는 부품
		f.setLayout(flow);
		
		//입력칸 색, 폰트 설정
		text.setBackground(Color.cyan);
		text.setForeground(Color.blue);
		text.setFont(font2);
		
		f.add(l);//f라는 부품위에 조립해서 올려놓기
		//JTextField 를 add 해주세요
		f.add(b);
		
		
		
		f.setVisible(true);
		
	}

}
