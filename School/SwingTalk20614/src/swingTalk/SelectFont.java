package swingTalk;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SelectFont extends JDialog implements ListSelectionListener, ActionListener{
	String[] name = {"굴림","굴림체","궁서","나눔손글씨 붓","휴먼고딕"};
	String[] style = {"보통","기울임","굵게","굵은 기울임"};
	String[] size = {"8","10","12","16","20","24","28","32"};
	
	JList fontName = new JList(name);
	JList fontStyle = new JList(style);
	JList fontSize = new JList(size);
	
	JLabel sample = new JLabel("AaBbYyZz 한글처리");
	
	JButton btnOK = new JButton("확인");
	JButton btnNO = new JButton("취소");
	
	boolean changeFont = false;
	
	SelectFont() {
		setModal(true);
		setBounds(1000,0,400,300);
		
		JPanel p0;
		p0 = new JPanel(null);
		add(p0);
		
		fontName.setBounds(10, 10, 180, 160);
		fontStyle.setBounds(200, 10, 100, 160);
		fontSize.setBounds(310, 10, 60, 160);
		p0.add(fontName);
		p0.add(fontStyle);
		p0.add(fontSize);
		
		fontName.setSelectedIndex(0);
		fontStyle.setSelectedIndex(0);
		fontSize.setSelectedIndex(0);
		
		sample.setBounds(200, 180, 170, 100);
		Border border = BorderFactory.createLineBorder(Color.GRAY, 1);
		sample.setBorder(border);
		p0.add(sample);
		
		btnOK.setBounds(200, 300, 80, 30);
		btnNO.setBounds(290, 300, 80, 30);
		p0.add(btnOK); p0.add(btnNO);
		
		fontName.addListSelectionListener(this);
		fontStyle.addListSelectionListener(this);
		fontSize.addListSelectionListener(this);
		btnOK.addActionListener(this);
		btnNO.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() ==  btnOK)
			changeFont = true;
		else if (e.getSource() == btnNO)
			changeFont = false;
		
		//폰트 설정 다이얼로그를 안보이게 처리한다.
		setVisible(false);
		}
	

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		//선택된 폰트 이름
		String name = fontName.getSelectedValue().toString();
		
		//선택된 폰트 스타일
		int style = 0;
		if (fontStyle.getSelectedIndex() == 0)
			style = Font.PLAIN;
		else if (fontStyle.getSelectedIndex() == 1)
			style = Font.ITALIC;
		else if (fontStyle.getSelectedIndex() == 2)
			style = Font.BOLD;
		else if (fontStyle.getSelectedIndex() == 3)
			style = Font.BOLD | Font.ITALIC;
		
		//선택된 폰트 크기
		String temp = fontSize.getSelectedValue().toString();
		int size = Integer.parseInt(temp);
				
		//선택한 폰트이름, 스타일 크기의 폰트를 sample의 폰트로 지정한다.
				
		Font font = new Font(name, style, size);
		sample.setFont(font);
	}
	

}
