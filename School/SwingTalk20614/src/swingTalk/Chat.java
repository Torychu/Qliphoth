package swingTalk;

import javax.swing.JFrame;

public class Chat extends JFrame{
	String userId;
	
	public Chat(String userId) {
		this.userId = userId;
		
		setSize(320,620);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
}