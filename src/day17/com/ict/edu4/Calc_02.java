package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Calc_02 extends JFrame{
	public Calc_02() {
		super("계산기");
		
		JPanel jp = new JPanel();
		JLabel jl1 = new JLabel();
		JTextField jtf1 = new JTextField(15);
		
		jp.add(jl1);
		jp.add(jtf1);
		
		JPanel np = new JPanel();
		np.setLayout(new GridLayout(5,3,5,5));
		
		
		JButton jb1 = new JButton("1");
		np.add(jb1);
		JButton jb2 = new JButton("2");
		np.add(jb2);
		JButton jb3 = new JButton("3");
		np.add(jb3);
		JButton jb4 = new JButton("4");
		np.add(jb4);
		JButton jb5 = new JButton("5");
		np.add(jb5);
		JButton jb6 = new JButton("6");
		np.add(jb6);
		JButton jb7 = new JButton("7");
		np.add(jb7);
		JButton jb8 = new JButton("8");
		np.add(jb8);
		JButton jb9 = new JButton("9");
		np.add(jb9);
		JButton jb10 = new JButton("0");
		np.add(jb10);
		JButton jb11 = new JButton("+");
		np.add(jb11);
		JButton jb12 = new JButton("-");
		np.add(jb12);
		JButton jb13 = new JButton("*");
		np.add(jb13);
		JButton jb14 = new JButton("/");
		np.add(jb14);
		JButton jb15 = new JButton("=");
		np.add(jb15);
		
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true); // 자동 줄바꾸기
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//편집 불가능하게 만들자
		jta.setEditable(false);
		
		add(jp,BorderLayout.NORTH);
		add(np,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-120, ds.height/2-150, 240, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new Calc_02();
	}
}
