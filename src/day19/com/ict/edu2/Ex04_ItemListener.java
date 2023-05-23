package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex04_ItemListener extends JFrame implements ItemListener, ActionListener{
	JPanel jp, sp;
	JCheckBox jc1, jc2, jc3, jc4;
	JButton jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;
	public Ex04_ItemListener() {
		super("체크박스 이벤트 처리");
		
		jp = new JPanel();
		jc1= new JCheckBox("축구");
		jc2 = new JCheckBox("야구");
		jc3 = new JCheckBox("농구");
		jc4 = new JCheckBox("배구");
		
		jp.add(jc1);
		jp.add(jc2);
		jp.add(jc3);
		jp.add(jc4);
		
		jta = new JTextArea(20,0);
		jta.setLineWrap(true); // 자동 줄바꾸기
		jta.setEditable(false);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		sp = new JPanel();
		jb1 = new JButton("exit");
		jb2 = new JButton("clear");
		
		sp.add(jb1);
		sp.add(jb2);
		
		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(sp, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
		// 체크박스에 ItemListener를 달자
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
	}
	// ItemListener 해결하는 추상 메소드
	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox obj = (JCheckBox)e.getSource();
		if(e.getStateChange()== e.SELECTED) {
			jta.append(obj.getText()+"선택\n"); // \n >> 다음꺼를 위해 엔터
		}else if(e.getStateChange()== e.DESELECTED) {
			jta.append(obj.getText()+"해제\n");
		}
	}
	// ActionListener 해결해주는 추상 메소드 (버튼)
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton)e.getSource();
		if(obj==jb1){
			System.exit(0);
		}else if(obj==jb2) {
			// clear; (초기화 하자)
			// 체크박스에 선택된 것을 모두 지우자
			jc1.setSelected(false);
			jc2.setSelected(false);
			jc3.setSelected(false);
			jc4.setSelected(false);
			jta.setText("");
		}
				
		
	}
	
	public static void main(String[] args) {
		new Ex04_ItemListener();
	}


	
}
