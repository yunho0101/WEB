package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 나의영화앨범 {

	static int index = 2; // 현재 2부터 시작

	public static void main(String[] args) {
		String[] title = { "1위.조커", "2위.탑건", "3위.극한직업", "4위.범죄도시2", "5위.바빌론" };
		String[] img = { "1.PNG", "2.PNG", "3.PNG", "4.PNG", "5.PNG" };
		double[] score = { 4.8, 4.2, 3.8, 3.7, 3.4 };

		JFrame f = new JFrame();
		f.setSize(430, 300);
		f.getContentPane().setBackground(Color.green);

		Font font = new Font("궁서", Font.BOLD, 40);// 객체생성 하는데, 특정 입력값을 넣지 않으면 못만들게 할 수도
		Font font2 = new Font("궁서", Font.BOLD, 20);// 객체생성 하는데, 특정 입력값을 넣지 않으면 못만들게 할 수도

		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 세팅
		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.red);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH);

		JLabel center = new JLabel();
		center.setHorizontalAlignment(0);
		center.setFont(font);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);

		// String.valueOf(): int, double...=>String으로 변환
		// Integer.parse(): double,String ... =>int 로 변환
		// Double.parse():int, String...=> double 로 변환

		JLabel under = new JLabel(score[2] + "");// score는 double이라 string으로 만들기
		under.setHorizontalAlignment(0);
		under.setForeground(Color.red);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);

		JButton left = new JButton("<  <  <");
		left.setBackground(Color.green);
		left.setFont(font2);
		f.add(left, BorderLayout.WEST);
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(index>0) {
				top.setText(title[index - 1]);
				ImageIcon icon = new ImageIcon(img[index - 1]);
				center.setIcon(icon);
				under.setText(score[index - 1] + "");
				index = index - 1;// index--; , index-=1;
				} 
				else {
					top.setText(title[4]);
					ImageIcon icon = new ImageIcon(img[4]);
					center.setIcon(icon);
					under.setText(score[4] + "");
					index=4;
				}
			}
		});

		JButton right = new JButton(">  >  >");
		right.setBackground(Color.green);
		right.setFont(font2);
		f.add(right, BorderLayout.EAST);
		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(index<4) {
				top.setText(title[index + 1]);
				ImageIcon icon = new ImageIcon(img[index + 1]);
				center.setIcon(icon);
				under.setText(score[index + 1] + "");
				index = index + 1;// index++; , index+=1;
				}
				else {
					top.setText(title[0]);
					ImageIcon icon = new ImageIcon(img[0]);
					center.setIcon(icon);
					under.setText(score[0] + "");
					index=0;
				}

			}
		});

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}

}
