package swingTalk;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AppMain extends JFrame implements ActionListener{
	
	String userId;
	
	JButton btn_login;
	JTextField txt_login;
	
	JLabel profile;
	JLabel status;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AppMain();
	}
	
	public AppMain() {
		setSize(320,600);
		setTitle("RobotChat Login");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(254,229,0));
		
		txt_login = new JTextField("20614 정윤환");
		btn_login = new JButton("확인");
		
		ImageIcon image = new ImageIcon("img/pikachu.jpg");
		profile = new JLabel(image);
		status = new JLabel("피카츄 초-카와이");
		status.setHorizontalAlignment(SwingConstants.CENTER);
		
		txt_login.setBounds(50,400,200,30);
		btn_login.setBounds(50,440,200,30);
		profile.setBounds(50,100,200,200);
		status.setBounds(70,330,150,20);
		
		panel.add(btn_login);
		panel.add(txt_login);
		panel.add(profile);
		panel.add(status);
		add(panel);
		
		setVisible(true);
		
		btn_login.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn_login) {
			String userId = txt_login.getText().trim();
			if(userId.length()==0) {
				JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
			}else {
				new Chat(userId);
				dispose();
			}
		}
	}

}	
