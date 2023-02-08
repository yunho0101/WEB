package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 확인문제 {

	public static void main(String[] args) {
		JFrame f =new JFrame();
		f.setSize(330,350);
		
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow=new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 =new JButton();
		JButton b2 =new JButton();
		JButton b3 =new JButton();
		JButton b4 =new JButton();
		
		Font font=new Font("궁서",1,45);
		
		b1.setBackground(Color.pink);
		b1.setForeground(Color.black);
		b1.setFont(font);
		b1.setText("별10개");
		
		b2.setBackground(Color.cyan);
		b2.setForeground(Color.black);
		b2.setFont(font);
		b2.setText("커피 5개");
		
		b3.setBackground(Color.pink);
		b3.setForeground(Color.black);
		b3.setFont(font);
		b3.setText("커피*우유 3개");
		
		b4.setBackground(Color.cyan);
		b4.setForeground(Color.black);
		b4.setFont(font);
		b4.setText("1: 짱!");
		
		//1)버튼에다가 액션기능을 추가하겠다고 설정
		//2)클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게 할건지 코딩
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을때 처리 내용을 여기에 써주세요
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피");
				}
				System.out.println();
			}
		});
		b3.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.print("커피*우유 ");
				}
				System.out.println();
			}
		});
		b4.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println((i+1)+":짱!");
				}
				System.out.println();
			}
		});
		
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setVisible(true);
	}

}
