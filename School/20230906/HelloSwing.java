package SwingEx;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class HelloSwing extends JFrame{
	HelloSwing(){
		
		setLayout(null);
//		JPanel p = new JPanel(new BorderLayout());
//		p.setLayout(new FlowLayout());
//		p.setLayout(new GridLayout(0,4));
//		p.setBackground(Color.cyan);
//		add(p);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setSize(70,40);
		btn1.setLocation(10, 30);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setBounds(150,30,90,20);
		
//		JButton btn3 = new JButton("버튼3");
//		JButton btn4 = new JButton("버튼4");
//		JButton btn5 = new JButton("버튼5");
//		JButton btn6 = new JButton("버튼6");
//		JButton btn7 = new JButton("버튼7");
		
		add(btn1);
		add(btn2);
//		p.add(btn3, BorderLayout.WEST);
//		p.add(btn4, BorderLayout.SOUTH);
//		p.add(btn5, BorderLayout.NORTH);
//		p.add(btn6);
//		p.add(btn7);	
		setTitle("안녕");
		setSize(300,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new HelloSwing();
}
}
