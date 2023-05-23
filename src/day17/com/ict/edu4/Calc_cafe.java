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

public class Calc_cafe extends JFrame{
	public Calc_cafe() {
		super("카페 주문");
		
		JTextField jtf1 = new JTextField(5); 
		JTextField jtf2 = new JTextField(5); 
		
		JPanel np = new JPanel();
		np.add(new JLabel("원하는 음료를 선택하세요"));
		
		JPanel jp = new JPanel();
		JRadioButton ame = new JRadioButton("아메리카노");
		jp.add(ame);
		JRadioButton mocha = new JRadioButton("카페모카");
		jp.add(mocha);
		JRadioButton latte = new JRadioButton("카페라떼");
		jp.add(latte);
		JRadioButton juice = new JRadioButton("과일쥬스");
		jp.add(juice);
		
		// ButtonGroup
		ButtonGroup bg = new ButtonGroup();
		bg.add(ame);
		bg.add(mocha);
		bg.add(latte);
		bg.add(juice);
		
		
		JPanel ap = new JPanel();
		ap.add(new JLabel("수량 : "));	
		ap.add(jtf1);
		ap.add(new JLabel("입급액 : "));	
		ap.add(jtf2);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(np, BorderLayout.NORTH);
		mainPanel.add(jp, BorderLayout.CENTER);
		mainPanel.add(ap, BorderLayout.SOUTH);
		
	
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
		new Calc_cafe();
	}
}