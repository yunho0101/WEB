package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 주문서 {
	
	static int count; //0으로 초기화, 전역변수
	final static int PRICE = 5000;
	//상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로 
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("주문시스템");
		f.setSize(400, 550);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", Font.BOLD, 22);
		Font font2 = new Font("궁서", Font.BOLD, 35);

		JLabel textlabel = new JLabel("개수: ");
		textlabel.setFont(font);
		JLabel countlabel = new JLabel("0개");
		countlabel.setFont(font);
		JLabel imglabel = new JLabel();
		ImageIcon icon = new ImageIcon("44.PNG");
		imglabel.setIcon(icon);
		JLabel result = new JLabel("결제금액은: 0원 ");
		result.setFont(font2);

		JButton btn1 = new JButton("소주");
		btn1.setBackground(Color.gray);
		btn1.setFont(font);
		JButton btn2 = new JButton("맥주");
		btn2.setBackground(Color.gray);
		btn2.setFont(font);
		JButton btn3 = new JButton("양주");
		btn3.setBackground(Color.gray);
		btn3.setFont(font);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("11.PNG");
				imglabel.setIcon(icon);
				count++;
				countlabel.setText(count+"개");
				result.setText("결제금액은 "+(count*PRICE)+"원");
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("22.PNG");
				imglabel.setIcon(icon);
				count++;
				countlabel.setText(count+"개");
				result.setText("결제금액은: "+(count*PRICE)+"원");
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("33.PNG");
				imglabel.setIcon(icon);
				count++;
				countlabel.setText(count+"개");
				result.setText("결제금액은 "+(count*PRICE)+"원");
			}
		});

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(textlabel);
		f.add(countlabel);
		f.add(imglabel);
		f.add(result);

		f.setVisible(true);
	}

}
