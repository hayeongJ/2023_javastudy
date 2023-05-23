package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

public class Calc_Grade extends JFrame{
	public Calc_Grade() {
		super("성적계산");
		
		JTextField jtf1 = new JTextField(5); 
		JTextField jtf2 = new JTextField(5); 
		JTextField jtf3 = new JTextField(5);
		JTextField jtf4 = new JTextField(5);
		JTextField jtf5 = new JTextField(5);
		JTextField jtf6 = new JTextField(5);
		
		JPanel np = new JPanel();
		np.add(new JLabel("이름 : "));
		np.add(jtf1);
		
		JPanel jp = new JPanel();
		jp.add(new JLabel("국어 : "));	
		jp.add(jtf2);
		jp.add(new JLabel("영어 : "));	
		jp.add(jtf3);
		jp.add(new JLabel("수학 : "));	
		jp.add(jtf4);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(np, BorderLayout.NORTH);
		mainPanel.add(jp, BorderLayout.CENTER);
	
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true); // 자동 줄바꾸기
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//편집 불가능하게 만들자
		jta.setEditable(false);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		add(mainPanel,BorderLayout.NORTH);
		add(jta,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-300, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new Calc_Grade();
	}
}
