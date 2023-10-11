package test;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingCounter extends JFrame implements ActionListener  {
	//전역변수 선언, 문제지 안내
	JPanel p = new JPanel();
	JLabel labelNumber = new JLabel("10");
	JButton btnInc = new JButton("증가");
	JButton btnDec = new JButton("감소");
	JButton btnCls = new JButton("초기화");
	JButton btnStart = new JButton("카운트다운");
	
	SwingCounter(){
		//타이머 숫자 폰트 지정, 문제지 안내
		labelNumber.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		//프레임 설정
		setTitle("간단 카운터");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//패널에 추가
		add(p);
		p.add(btnInc);
		p.add(btnDec);
		p.add(btnCls);
		p.add(btnStart);
		p.add(labelNumber);
		
		//버튼에 리스너 생성
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		btnStart.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingCounter();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnInc) {
			String str = labelNumber.getText().trim();
			int count = Integer.parseInt(str)+1; //숫자로 바꾸고 +1
			str=Integer.toString(count); //다시 숫자를 문자로 바꾸고
			labelNumber.setText(str); //숫자 라벨에 설정
		}
		else if(e.getSource()==btnDec) {
			String str = labelNumber.getText().trim();
			int count = Integer.parseInt(str); //숫자로 바꾸고 +1
			if(count >0) {
				count -= 1;
				str=Integer.toString(count);
				labelNumber.setText(str); 
			}
		}
		else if(e.getSource()==btnCls) {
			labelNumber.setText("0");
			btnStart.setEnabled(true);
		}
		else if(e.getSource()==btnStart) {
			//쓰레드에서 라벨에 접근할 수 있도록 객체를 생성자로 넘겨줌
			CountDownTimer runnable = new CountDownTimer(labelNumber);
			Thread thread=new Thread(runnable);
			thread.start();
			
			btnStart.setEnabled(false);
		}
	}

}
