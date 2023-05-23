package day18.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex02_Calc4 extends JFrame{
	public Ex02_Calc4() {
		super("계산기");
		
		JPanel jp1 = new JPanel();
		JTextField jtf = new JTextField(20);
		jp1.add(jtf);
		
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(5,3,5,5));
		JButton jb1 = new JButton("1");
		jp2.add(jb1);
		JButton jb2 = new JButton("2");
		jp2.add(jb2);
		JButton jb3 = new JButton("3");
		jp2.add(jb3);
		JButton jb4 = new JButton("4");
		jp2.add(jb4);
		JButton jb5 = new JButton("5");
		jp2.add(jb5);
		JButton jb6 = new JButton("6");
		jp2.add(jb6);
		JButton jb7 = new JButton("7");
		jp2.add(jb7);
		JButton jb8 = new JButton("8");
		jp2.add(jb8);
		JButton jb9 = new JButton("9");
		jp2.add(jb9);
		JButton jb10 = new JButton("0");
		jp2.add(jb10);
		JButton jb11 = new JButton("+");
		jp2.add(jb11);
		JButton jb12 = new JButton("-");
		jp2.add(jb12);
		JButton jb13 = new JButton("*");
		jp2.add(jb13);
		JButton jb14 = new JButton("/");
		jp2.add(jb14);
		JButton jb15 = new JButton("=");
		jp2.add(jb15);
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		// 부모 크기에(컴포넌트) 맞춰서 (설정한 창 크기에 맞춰서) 
		pack();
		
		
		
//		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
//		setBounds(ds.width/2-150, ds.height/2-180, 300, 360);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new Ex02_Calc4();
	}
}
