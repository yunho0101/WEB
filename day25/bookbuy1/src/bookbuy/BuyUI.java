package bookbuy;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BuyUI {

	public static void main(String[] args) {
			JFrame f = new JFrame();
			f.setTitle("도서 구매");
			f.setSize(600, 500);
			JLabel book = new JLabel();
			
			JLabel S1 = new JLabel("도서 구매");
			JLabel l1 = new JLabel("도서제목");
			JLabel l2 = new JLabel("주문자");
			JLabel l3 = new JLabel("배송지");
			JLabel l4 = new JLabel("전화번호");
			
			JTextField t1 = new JTextField(10);
			JTextField t2 = new JTextField(10);
			JTextField t3 = new JTextField(10);
			ImageIcon icon = new ImageIcon("book.jpg");
			book.setIcon(icon);
			JButton b1 = new JButton("결제");
			
			
			FlowLayout flow = new FlowLayout();
			Font font = new Font("궁서", Font.BOLD, 40);
			Font font1 = new Font("궁서", Font.BOLD, 60);
			
			f.setLayout(flow);
			
			f.add(S1);
			f.add(l1);
			f.add(book);
			f.add(l2); f.add(t1);
			f.add(l3); f.add(t2);
			f.add(l4); f.add(t3);
			f.add(b1);
			S1.setFont(font1);
			l1.setFont(font);
			l2.setFont(font);
			l3.setFont(font);
			l4.setFont(font);
			
			t1.setFont(font);
			t2.setFont(font);
			t3.setFont(font);
			
			b1.setFont(font);
			
			
			t1.setBackground(Color.yellow);
			t1.setForeground(Color.blue);
			t2.setBackground(Color.yellow);
			t2.setForeground(Color.blue);
			t3.setBackground(Color.yellow);
			t3.setForeground(Color.blue);
			
			
			b1.setBackground(Color.pink); //배경색
			b1.setForeground(Color.red); //글자색 
			
			f.getContentPane().setBackground(Color.green);
			f.setVisible(true);

	}

}
