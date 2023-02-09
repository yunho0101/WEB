package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 인기투표JFrame {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(450, 900);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("궁서", 1, 20);
		Font font2 = new Font("궁서", 1, 30);
		
		JLabel l1 = new JLabel();
		l1.setText("인기투표 시스템을 시작합니다");
		l1.setFont(font2);
		
		JLabel l2 = new JLabel();
		l2.setText("아이유");
		l2.setFont(font1);
		
		JLabel l3 = new JLabel();
		l3.setText("프로미스나인");
		l3.setFont(font1);
		
		JLabel l4 = new JLabel();
		l4.setText("스테이씨");
		l4.setFont(font1);
		
		JLabel l5 = new JLabel();//아이유 투표 프린트 라벨
		JLabel l6 = new JLabel();//프로미스나인 투표 프린트 라벨
		JLabel l7 = new JLabel();//스테이씨 투표 프린트 라벨
		l5.setForeground(Color.red);
		l6.setForeground(Color.red);
		l7.setForeground(Color.red);
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton("종료");
		
		b4.setFont(font1);
		
		ImageIcon icon1 = new ImageIcon("iu.PNG");
		ImageIcon icon2 = new ImageIcon("f9.PNG");
		ImageIcon icon3 = new ImageIcon("st.PNG");
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		f.add(l1);
		f.add(b1);
		f.add(l2);
		f.add(l5);
		
		f.add(b2);
		f.add(l3);
		f.add(l6);
		
		f.add(b3);
		f.add(l4);
		f.add(l7);
		
		f.add(b4);
		
		b1.addActionListener(new ActionListener() {
			int iu=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭마다 처리할 내용
				iu++;
				l5.setText(iu+"표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int f9=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭마다 처리할 내용
				f9++;
				l6.setText(f9+"표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int st=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭마다 처리할 내용
				st++;
				l7.setText(st+"표");
			}
		});
		
		f.setVisible(true);
	}

}
