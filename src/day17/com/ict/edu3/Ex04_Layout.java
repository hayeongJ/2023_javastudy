package day17.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex04_Layout extends JFrame {
	public Ex04_Layout() {
		super("JPanel을 BorderLayout 변경");
		// 아무것도 하지 않으면 자동으로 FlowLayout이다.
		
		// JPanel을 BorderLayout으로 변경하자
		// 방법 1)
//		JPanel jp = new JPanel(new BorderLayout());
	
		
		// 방법 2)
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
	
		
		jp.add(jb1,BorderLayout.NORTH);
		jp.add(jb2,BorderLayout.SOUTH);
		jp.add(jb3,BorderLayout.EAST);
		jp.add(jb4,BorderLayout.WEST);
		jp.add(jb5,BorderLayout.CENTER);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			
	}
	public static void main(String[] args) {
		new Ex04_Layout();
		
	}
}
