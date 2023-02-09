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
public class 부품만들기2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(330, 600);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		ImageIcon icon = new ImageIcon("11.PNG");
		JButton b1 = new JButton("회원가입");
		JLabel b2 = new JLabel();
		b2.setIcon(icon);
		
		
		JLabel text1 = new JLabel();
		text1.setText("아이디 입력");
		
		JLabel text2 = new JLabel();
		text2.setText("패스워드 입력");
		
		JLabel text3 = new JLabel();
		text3.setText("이름 입력");
		
		JLabel text4 = new JLabel();
		text4.setText("전화번호 입력");
		
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);
		
		

		Font font = new Font("궁서", 1, 30);
		
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		text3.setFont(font);
		input3.setFont(font);
		text4.setFont(font);
		input4.setFont(font);
		
		
		b1.setBackground(Color.pink); 
		b1.setForeground(Color.blue); 
		input1.setBackground(Color.yellow); 
		input1.setForeground(Color.red); 
		input2.setBackground(Color.yellow); 
		input2.setForeground(Color.red); 
		text1.setForeground(Color.blue); 
		text2.setForeground(Color.blue); 
		text3.setForeground(Color.blue); 
		text4.setForeground(Color.blue); 
		input3.setBackground(Color.yellow); 
		input3.setForeground(Color.red);
		input4.setBackground(Color.yellow); 
		input4.setForeground(Color.red);
		
		f.add(b2);
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(text3);
		f.add(input3);
		f.add(text4);
		f.add(input4);
		f.add(b1);
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f,"회원가입 성공");
				}
		});
		
		
		
		f.setVisible(true);
	}
}



















