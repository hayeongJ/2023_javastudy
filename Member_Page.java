package Project_com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class Member_Page extends JFrame{
	JPanel jp1, jp2, jp3, jp4,j;
	JMenuItem show;
	JMenuBar jmb;
	JLabel jl;
	JTable jt;
	JScrollPane jsp;
	JComboBox<String> jcom;
	DefaultTableModel dt;
	JTextField jtf1;
	JButton search,delete,update, back, exit;
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int result = 0;
	
	public Member_Page() {
		super("Member_Page");
		
		//jtable
		jp1 = new JPanel();
		String[]info = {"CustID","회원아이디","비밀번호","생년월일","이메일"};
		dt = new DefaultTableModel(info,0);
		jt = new JTable(dt);
		jt.setBackground(Color.WHITE);
		
		jsp = new JScrollPane(jt);
		jp1.add(jsp);
		jp1.setBackground(new Color(255, 240, 245));
		
		setJMenuBar(jmb);
		
		jp2 = new JPanel();
		jl = new JLabel("회원 정보");
		jp2.add(jl);
		Font font = new Font("굴림", Font.BOLD, 25);
		jl.setFont(font);
		jl.setForeground(Color.white);
		jp2.setBackground(new Color(65, 105, 225));
		
		jp3 = new JPanel();
		String[] cominfo = {"전체","회원 ID","CustID","생년월일","이메일"};
		jcom = new JComboBox<>(cominfo);
		jtf1 = new JTextField(20);
		jtf1.setBounds(200, 250, 200, 25);
		search = new JButton("검색");
		search.setForeground(new Color(255, 240, 245));
		search.setBackground(new Color(65, 105, 225));
		search.setFont(new Font("돋움", Font.BOLD | Font.ITALIC, 14));
		search.setBounds(130, 420, 100, 30);
		
		update = new JButton("수정");
		update.setForeground(new Color(255, 240, 245));
		update.setBackground(new Color(65, 105, 225));
		update.setFont(new Font("돋움", Font.BOLD | Font.ITALIC, 14));
		update.setBounds(130, 420, 100, 30);
		
		
		delete = new JButton("삭제");
		delete.setForeground(new Color(255, 240, 245));
		delete.setBackground(new Color(65, 105, 225));
		delete.setFont(new Font("돋움", Font.BOLD | Font.ITALIC, 14));
		delete.setBounds(130, 420, 100, 30);
		
		jp3.add(jcom);
		jp3.add(jtf1);
		jp3.add(search);
		jp3.add(update);
		jp3.add(delete);
		jp3.setBackground(new Color(255, 240, 245));
		
		jp4 = new JPanel();
		back = new JButton("BACK");
		back.setForeground(new Color(255, 240, 245));
		back.setBackground(new Color(65, 105, 225));
		back.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 14));
		back.setBounds(130, 420, 100, 30);
		exit = new JButton("EXIT");
		exit.setForeground(new Color(255, 240, 245));
		exit.setBackground(new Color(65, 105, 225));
		exit.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 14));
		exit.setBounds(130, 420, 100, 30);
		jp4.setBackground(new Color(255, 240, 245));
		jp4.add(back);
		jp4.add(exit);
		
		j = new JPanel();
		j.setLayout(new BorderLayout());
		j.add(jp2,BorderLayout.NORTH);
		j.add(jp3, BorderLayout.SOUTH);
		
		add(j, BorderLayout.NORTH);
		add(jp1, BorderLayout.CENTER);
		add(jp4, BorderLayout.SOUTH);
		
		
		// pack();
		setSize(1000,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Member_Page();
	}
}
