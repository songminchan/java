import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AonnymousClassListener extends JFrame {
		public AonnymousClassListener() {
				setTitle("Action �̺�Ʈ ������ �ۼ�");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Container c = getContentPane();
				c.setLayout(new FlowLayout());
				JButton btn = new JButton("Action");
				c.add(btn);
				btn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
								JButton b = (JButton)e.getSource();
								if(b.getText().equals("Action")) 
									b.setText("�׼�");
								else 
									b.setText("Action");
								
								// AnonymousClassListener�� ����� JFrame�� ����� ȣ���� �� ����
								setTitle(b.getText());
							}
						});
						
						setSize(350, 150);
						setVisible(true);
					}	
					public static void main(String [] args) {
						new AonnymousClassListener();
					}
				}
					