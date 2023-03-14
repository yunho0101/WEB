package bookbuy;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		f.setSize(400, 1000);
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
		JButton b2 = new JButton("삭제");
		JButton b3 = new JButton("update");
		JButton b4 = new JButton("select");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText(); // APPLE
				String s2 = t2.getText(); // APPLE
				String s3 = t3.getText(); // APPLE

				BuyVO bag = new BuyVO();
				bag.setName(s1);
				bag.setaddress(s2);
				bag.setTel(s3);

				BuyDAO dao = new BuyDAO();
				dao.insert(bag);

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText(); // APPLE

				BuyVO bag = new BuyVO();
				bag.setName(s1);
			

				BuyDAO dao = new BuyDAO();
				dao.delete(bag);

			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText(); // APPLE
				String s2 = t2.getText(); // APPLE
				String s3 = t3.getText(); // APPLE

				BuyVO bag = new BuyVO();
				bag.setName(s1);
				bag.setaddress(s2);
				bag.setTel(s3);;
			

				BuyDAO dao = new BuyDAO();
				dao.update(bag);

			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText(); // APPLE
				
				BuyVO bag = new BuyVO();
				bag.setName(s1);
				

				BuyDAO dao = new BuyDAO();
				dao.select(bag);

			}
		});
		FlowLayout flow = new FlowLayout();
		Font font = new Font("궁서", Font.BOLD, 40);
		Font font1 = new Font("궁서", Font.BOLD, 60);

		f.setLayout(flow);

		f.add(S1);
		f.add(l1);
		f.add(book);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		S1.setFont(font1);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);

		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		t1.setBackground(Color.yellow);
		t1.setForeground(Color.blue);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.blue);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.blue);

		b1.setBackground(Color.pink); // 배경색
		b1.setForeground(Color.red);
		b2.setBackground(Color.pink); // 배경색
		b2.setForeground(Color.red);// 글자색
		b3.setBackground(Color.pink); // 배경색
		b3.setForeground(Color.red);
		b4.setBackground(Color.pink); // 배경색
		b4.setForeground(Color.red);
		f.setVisible(true);

	}

}
