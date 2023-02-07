package 순차문;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class 부품만들기3 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(450, 700);
		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("*");
		JButton b4 = new JButton();
		b4.setText("/");
		
		JLabel text1 = new JLabel(); 
		text1.setText("숫자1");
		
		JLabel text2 = new JLabel(); 
		text2.setText("숫자2");
		JLabel blank1 = new JLabel();  
		blank1.setText(" ");
		
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("궁서", 1, 40);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		
		text1.setForeground(Color.blue);
		text2.setForeground(Color.blue);
		b1.setBackground(Color.blue); 
		b1.setForeground(Color.white); 
		b2.setBackground(Color.blue); 
		b2.setForeground(Color.white);
		b3.setBackground(Color.blue); 
		b3.setForeground(Color.white);
		b4.setBackground(Color.blue); 
		b4.setForeground(Color.white);
		
		input1.setBackground(Color.yellow); 
		input1.setForeground(Color.white); 
		input2.setBackground(Color.yellow); 
		input2.setForeground(Color.white); 
		
		ImageIcon icon = new ImageIcon("cal.png");
		
		
		blank1.setIcon(icon);
		
		f.add(blank1);
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setVisible(true);
	}
}
