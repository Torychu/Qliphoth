package swingTalk;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class SelectRGB extends JDialog{
	JLabel label_r, label_g, label_b,sample;
	JButton btnOK, btnNo;
	JScrollBar RS,GS,BS;
	
	SelectRGB(){
		setTitle("RGB값을 조절하여 배경색을 선택하세요");
		setBounds(1000,0,500,250);
		setModal(true);
		
		JPanel p0 = new JPanel(null); add(p0);
		
		RS = new JScrollBar(JScrollBar.HORIZONTAL, 127,1,0,256);
		GS = new JScrollBar(JScrollBar.HORIZONTAL, 127,1,0,256);
		BS = new JScrollBar(JScrollBar.HORIZONTAL, 127,1,0,256);
		
		RS.setBounds(10,40,300,20); p0.add(RS);
		GS.setBounds(10,70,300,20); p0.add(GS);
		BS.setBounds(10,100,300,20); p0.add(BS);
		
		label_r = new JLabel("RED");
		label_g = new JLabel("GREEN");
		label_b = new JLabel("BLUE");
		
		
		label_r.setBounds(320, 40, 50, 20); p0.add(label_r);
		label_g.setBounds(320, 70, 50, 20); p0.add(label_g);
		label_b.setBounds(320, 100, 50, 20); p0.add(label_b);
		
		sample = new JLabel("SAMPLE");
		sample.setOpaque(true);
		sample.setBounds(400,40,80,80);
		sample.setBackground(Color.BLACK);
		p0.add(sample);
		
		btnOK = new JButton("확인");
		btnNo = new JButton("취소");
		btnOK.setBounds(300,150,80,20);
		btnNo.setBounds(400,150,80,20);
		p0.add(btnOK);
		p0.add(btnNo);
		setVisible(true);

	}
}
