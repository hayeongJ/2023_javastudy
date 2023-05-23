package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_main extends JFrame {
	// 객체를 생성
	public Ex10_main() {
		super("JTab_2");
		
		// JPanel을 상속한 클래스로 객체를 만들기
		Ex10_LightGray lg= new Ex10_LightGray();
		Ex10_Gray g = new Ex10_Gray();
		Ex10_DarkGray dg = new Ex10_DarkGray();
		
		// JPanel을 -> JTab에 넣어줌
		JTabbedPane jtab = new JTabbedPane();
		jtab.addTab("라이트그레이2", lg);
		jtab.addTab("그레이2", g);
		jtab.addTab("다크그레이2", dg);
		
		// JTab -> JFrame
		add(jtab);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex10_main();
	}
}
