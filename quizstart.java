package nemonemologic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class quizstart extends JPanel {
	
	
	JButton start = new JButton("1");
	JButton start1 = new JButton("2");
	JButton start2 = new JButton("3");
	JButton start3 = new JButton("4");
	JButton exit = new JButton("종료");
	
	public quizstart() {
		JFrame q = new JFrame();
		q.getContentPane().add(this);
		q.setSize(300, 300);
		q.setTitle("네모네모로직 ");
		q.add(start);
		q.add(start1);
		q.add(start2);
		q.add(start3);
		q.add(exit);
		q.setVisible(true);
		
		start.setBounds(20, 20, 100, 100);
		start1.setBounds(125, 20, 100, 100);
		start2.setBounds(20, 125, 100, 100);
		start3.setBounds(125, 125, 100, 100);
		exit.setBounds(130, 130, 30, 20);
		
		
		ActionListener li = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == start) {
					tenbyten ten1 = new tenbyten();
				}
				else if(e.getSource() == start1) {
					tenbyten2 ten2 = new tenbyten2();
				}
			}
			
		};
		
		
		start.addActionListener(li);
		start1.addActionListener(li);
	}
	
	

	public static void main(String[] args) {
		new quizstart();

	}

}
