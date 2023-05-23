package day20.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Calc_0522 extends JFrame implements ActionListener,ItemListener{
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	ButtonGroup bg;
	JTextArea jta;
	JButton calc, exit, clear;
	
	public Calc_0522() {
		super("계산기");
		jp1 = new JPanel();
		jtf1 = new JTextField(5);
		jp1.add(new JLabel("수1 : "));
		jp1.add(jtf1);
		jtf2 = new JTextField(5);
		jp1.add(new JLabel("수2 : "));
		jp1.add(jtf2);
		
		jrb1 = new JRadioButton("+");
		jrb2 = new JRadioButton("-");
		jrb3 = new JRadioButton("*");
		jrb4 = new JRadioButton("/");
		
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);
		
		bg= new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		jta = new JTextArea(10,10);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		jp2 = new JPanel();
		calc = new JButton("계산");
		exit = new JButton("종료");
		clear = new JButton("초기화");
		
		jp2.add(calc);
		jp2.add(exit);
		jp2.add(clear);
				
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
			
		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);
		
		calc.addActionListener(this);
		exit.addActionListener(this);
		clear.addActionListener(this);
		
		jrb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String num1 = jtf1.getText();
				String num2 = jtf2.getText();
				
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				
				int sum = n1+n2;
				
				
			}
		});
		exit.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.exit(0); 
			}
		});
		
		
	}
	// 라디오 버튼 처리
	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton obj = (JRadioButton)e.getSource();
		if(e.getStateChange()==e.SELECTED) {
			if(jrb1.isSelected()){
				System.out.println();
			}
			
		}
		
	}
	// 버튼 처리(계산, 종료, 초기화)
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton)e.getSource();
		if(obj==calc) {
			System.out.println();
		}else if(obj==exit) {
			System.exit(0);
		}else if(obj==clear) {
			bg.clearSelection();
			jta.setText("");
			jtf1.setText("");
			jtf2.setText("");
		}
	}
	public static void main(String[] args) {
		new Calc_0522();
	}
}
