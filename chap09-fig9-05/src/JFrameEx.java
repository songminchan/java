import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class JFrameEx extends JFrame{
		public JFrameEx() {
				setTitle("프레임 구성");
				
				// 메뉴 생성
				JMenuBar mb = new JMenuBar();
				JMenu filemenu = new JMenu("File");
				JMenu editMenu = new JMenu("Edit");
				JMenu sourcemenu = new JMenu("Source");
				JMenu searchmenu = new JMenu("Search");
				JMenu windowmenu = new JMenu("Window");
				
				mb.add(filemenu);
				mb.add(editMenu);
				mb.add(sourcemenu);
				mb.add(searchmenu);
				mb.add(windowmenu);
				setJMenuBar(mb);
				
				// contentPane
				this.getContentPane().setLayout(new FlowLayout());
				this.getContentPane().setBackground(new Color(186,143,45));
				this.add(new JButton("add"));
				this.add(new JButton("sub"));
				this.add(new JButton("mul"));
				this.add(new JButton("div"));
				
				setSize(300,200);
				setVisible(true);
				
		}

		public static void main(String[] args) {
				new JFrameEx();
				
		}

}