package nemonemologic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class logic extends JPanel{
	
	JButton start = new JButton("시작");
	JButton exit = new JButton("종료");
	JButton a = new JButton("네모네모로직 ");
	
	//메인화면
	public logic() {
		JFrame puzzle = new JFrame();
		puzzle.getContentPane().add(this);
		puzzle.setSize(500, 200);
		puzzle.setBackground(Color.white);
		puzzle.setTitle("네모네모로직");
		
		//버튼 
		puzzle.add(start);
		puzzle.add(exit);
		puzzle.add(a);
		start.setBounds(150, 100, 100, 30);
		exit.setBounds(250, 100, 100, 30);
		a.setBounds(0, 0, 10, 10);

		puzzle.setVisible(true);
		showButton();
		
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.drawString("네모네모로직", 50, 50);
	}
	
	

	//버튼 기능 
	public void showButton() {

		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 quiz();
			}
		});
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
				

	}
	
	
	public void quiz() {	
		quizstart q = new quizstart();
	}

	
	public static void main(String[] args) {
		new logic();
		
	}

}
