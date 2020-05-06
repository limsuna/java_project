package nemonemologic;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tenbyten extends JPanel implements MouseListener{
	
	//int[][] ten = new int[10][10];
	int[][] ten1 = new int[10][10];
	int[][] ten = {{0,0,1,1,0,0,0,0,0,0},{1,1,1,1,1,0,0,0,0,0},{1,1,1,1,1,0,0,0,1,0},{0,0,1,1,1,0,0,0,0,1},{0,0,1,0,0,0,0,0,0,1},{0,1,1,1,0,0,0,1,1,0},{0,1,1,1,1,1,1,1,1,0},{0,0,1,1,0,0,0,1,1,0},{0,0,0,1,0,0,0,0,1,0},{0,0,1,1,0,0,0,1,1,0}};
	private int m_x;
	private int m_y;
	private int x;
	private int y;

	//1
	int count0 = 0;
	int count1 = 0;
	int count2 = 0;
	int count3 = 0;
	int count4 = 0;
	int count5 = 0;
	int count6 = 0;
	int count7 = 0;
	int count8 = 0;
	int count9 = 0;
	
	//2
	int count10 = 0;
	int count11 = 0;
	int count12 = 0;
	int count13 = 0;
	int count14 = 0;
	int count15 = 0;
	int count16 = 0;
	int count17 = 0;
	int count18 = 0;
	int count19 = 0;
	
	//3
	int count20 = 0;
	int count21 = 0;
	int count22 = 0;
	int count23 = 0;
	int count24 = 0;
	int count25 = 0;
	int count26 = 0;
	int count27 = 0;
	int count28 = 0;
	int count29 = 0;
	
	//4
	int count30 = 0;
	int count31 = 0;
	int count32 = 0;
	int count33 = 0;
	int count34 = 0;
	int count35 = 0;
	int count36 = 0;
	int count37 = 0;
	int count38 = 0;
	int count39 = 0;
	
	//5
	int count40 = 0;
	int count41 = 0;
	int count42 = 0;
	int count43 = 0;
	int count44 = 0;
	int count45 = 0;
	int count46 = 0;
	int count47 = 0;
	int count48 = 0;
	int count49 = 0;
	
	//6
	int count50 = 0;
	int count51 = 0;
	int count52 = 0;
	int count53 = 0;
	int count54 = 0;
	int count55 = 0;
	int count56 = 0;
	int count57 = 0;
	int count58 = 0;
	int count59 = 0;

	//7
	int count60 = 0;
	int count61 = 0;
	int count62 = 0;
	int count63 = 0;
	int count64 = 0;
	int count65 = 0;
	int count66 = 0;
	int count67 = 0;
	int count68 = 0;
	int count69 = 0;
	
	//8
	int count70 = 0;
	int count71 = 0;
	int count72 = 0;
	int count73 = 0;
	int count74 = 0;
	int count75 = 0;
	int count76 = 0;
	int count77 = 0;
	int count78 = 0;
	int count79 = 0;
	
	//9
	int count80 = 0;
	int count81 = 0;
	int count82 = 0;
	int count83 = 0;
	int count84 = 0;
	int count85 = 0;
	int count86 = 0;
	int count87 = 0;
	int count88 = 0;
	int count89 = 0;
	
	//10
	int count90 = 0;
	int count91 = 0;
	int count92 = 0;
	int count93 = 0;
	int count94 = 0;
	int count95 = 0;
	int count96 = 0;
	int count97 = 0;
	int count98 = 0;
	int count99 = 0;


	

	//int[][] hint_x = new int[3][9];
	//int[][]hint_y = new int [9][3];
	//int[][] hint_x = {{0,0,0,0,0,0,0,0,0},{0,2,8,4,3,0,0,3,1,0},{2,2,1,5,1,1,1,1,5,2}};
	//int[][] hint_y = {{0,0,2},{0,0,5},{0,5,1},{0,3,1},{0,1,1},{0,3,2},{0,0,8},{0,2,2},{0,1,1},{0,2,2}};

	public tenbyten() {
		JFrame ten = new JFrame();
		ten.getContentPane().add(this);
		ten.setSize(390,410);
		ten.setBackground(Color.white);
		ten.setTitle("10X10");
		ten.addMouseListener(this);
		ten.setVisible(true);
		
		
	}
	

	public void mouseClicked(MouseEvent e) {
		Object a = e.getSource();
		m_x = e.getX();
		m_y = e.getY();
		System.out.println(x +" , " +y);
		this.repaint();
	}
	

	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.drawRect(0, 0, 390, 390);
		g.drawRect(0, 0, 90, 90);
		for(int i = 90; i<390; i+=30) {
			//세로 
			g.drawRect(0, i, 90, 30);
		}
		for(int i = 90; i<390; i+=30) {
			//가로 
			g.drawRect(i, 0, 30, 90);
		}
		//내부 네모 
		for(int i = 90; i<390; i+=30) {
			g.drawRect(i, 90, 30, 30);
			g.drawRect(i, 120, 30, 30);
			g.drawRect(i, 150, 30, 30);
			g.drawRect(i, 180, 30, 30);
			g.drawRect(i, 210, 30, 30);
			g.drawRect(i, 240, 30, 30);
			g.drawRect(i, 270, 30, 30);
			g.drawRect(i, 300, 30, 30);
			g.drawRect(i, 330, 30, 30);
			g.drawRect(i, 360, 30, 30);
		}
		
		//가로힌트 
		String k0 = "        2      8      4     3                   3      1";
		String k1 = "2      2      1      5     1     1     1     1     5     2";
		g.drawString(k1, 100, 80);
		g.drawString(k0, 100, 50);
			
		//세로힌트
		String k2 = "2";
		g.drawString(k2, 75, 110);
		String k3 = "5";
		g.drawString(k3, 75, 140);
		String k4 = "5 1";
		g.drawString(k4, 65, 170);
		String k5 = "3 1";
		g.drawString(k5, 65, 200);
		String k6 = "1 1";
		g.drawString(k6, 65, 230);
		String k7 = "3 2";
		g.drawString(k7, 65, 260);
		String k8 = "8";
		g.drawString(k8, 75, 295);
		String k9 = "2 2";
		g.drawString(k9, 65, 320);
		String k10 = "1 1";
		g.drawString(k10, 65, 350);
		String k11 = "2 2";
		g.drawString(k11, 65, 380);
		//g.fillRect(92, 92, 28, 28);
		x = m_x;
		y = m_y;
		

		
		
		
		
		//클릭하면 색칠 
		//1
		
		if(90<x && x<120 && 90<y && y<140) {	
			ten1[0][0] = 1;
			count0 += 1;
		}
		if(120<x && x<150 && 90<y && y<140) {
			ten1[0][1] = 1;
			count1 += 1;
		}
		if(150<x && x<180 && 90<y && y<140) {
			ten1[0][2] = 1;
			count2 += 1;
		}
		if(180<x && x<210 && 90<y && y<140) {
			ten1[0][3] = 1;
			count3 += 1;
		}
		if(210<x && x<240 && 90<y && y<140) {
			ten1[0][4] = 1;
			count4 += 1;
		}
		if(240<x && x<270 && 90<y && y<140) {
			ten1[0][5] = 1;
			count5 += 1;
		}
		if(270<x && x<300 && 90<y && y<140) {
			ten1[0][6] = 1;
			count6 += 1;
		}
		if(300<x && x<330 && 90<y && y<140) {
			ten1[0][7] = 1;
			count7 += 1;
		}
		if(330<x && x<360 && 90<y && y<140) {
			ten1[0][8] = 1;
			count8 += 1;
		}
		if(360<x && x<390 && 90<y && y<140) {
			ten1[0][9] = 1;
			count9 += 1;
		}
		
		
		if(ten1[0][0] == 1) {
			if(count0%2 == 1) {
				g.setColor(Color.black);
				ten1[0][0] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[0][0] = 0;
			}
			g.fillRect(92, 92, 27, 27);
		}
		if(ten1[0][1] == 1) {
			if(count1%2 == 1) {
				g.setColor(Color.black);
				ten1[0][1] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[0][1] = 0;
			}
			g.fillRect(122, 92, 27, 27);
		}
		if(ten1[0][2] == 1) {
			if(count2%3 == 1) {
				g.setColor(Color.black);
				ten1[0][2] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[0][2] = 0;
			}
			g.fillRect(152, 92, 27, 27);
		}
		if(ten1[0][3] == 1) {
			if(count3%2 == 1) {
				g.setColor(Color.black);
				ten1[0][3] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[0][3] = 0;
			}
			g.fillRect(182, 92, 27, 27);
		}
		if(ten1[0][4] == 1) {
			if(count4%2 == 1) {
				g.setColor(Color.black);
				ten1[0][4] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[0][4] = 0;
			}
			g.fillRect(212, 92, 27, 27);
		}
		if(ten1[0][5] == 1) {
			if(count5%2 == 1) {
				g.setColor(Color.black);
				ten1[0][5] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[0][5] = 0;
			}
			g.fillRect(242, 92, 27, 27);
		}
		if(ten1[0][6] == 1) {
			if(count6%2 == 1) {
				g.setColor(Color.black);
				ten1[0][6] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[0][6] = 0;
			}
			g.fillRect(272, 92, 27, 27);
		}
		if(ten1[0][7] == 1) {
			if(count7%2 == 1) {
				g.setColor(Color.black);
				ten1[0][7] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[0][7] = 0;
			}
			g.fillRect(302, 92, 27, 27);
		}
		if(ten1[0][8] == 1) {
			if(count8%2 == 1) {
				g.setColor(Color.black);
				ten1[0][8] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[0][8] = 0;
			}
			g.fillRect(332, 92, 27, 27);
		}
		if(ten1[0][9] == 1) {
			if(count9%2 == 1) {
				g.setColor(Color.black);
				ten1[0][9] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[0][9] = 0;
			}
			g.fillRect(362, 92, 27, 27);
		}

		//2
		if(90<x&& x<120 && 140<y && y<170) {	
			ten1[1][0] = 1;
			count10 += 1;
		}
		if(120<x && x<150 && 140<y && y<170) {
			ten1[1][1] = 1;
			count11 += 1;
		}
		if(150<x && x<180 && 140<y && y<170) {
			ten1[1][2] = 1;
			count12 += 1;
		}
		if(180<x && x<210 && 140<y && y<170) {
			ten1[1][3] = 1;
			count13 += 1;
		}
		if(210<x && x<240 && 140<y && y<170) {
			ten1[1][4] = 1;
			count14 += 1;
		}
		if(240<x && x<270 && 140<y && y<170) {
			ten1[1][5] = 1;
			count15 += 1;
		}
		if(270<x && x<300 && 140<y && y<170) {
			ten1[1][6] = 1;
			count16 += 1;
		}
		if(300<x && x<330 && 140<y && y<170) {
			ten1[1][7] = 1;
			count17 += 1;
		}
		if(330<x && x<360 && 140<y && y<170) {
			ten1[1][8] = 1;
			count18 += 1;
		}
		if(360<x && x<390 && 140<y && y<170) {
			ten1[1][9] = 1;
			count19 += 1;
		}
		
		
		if(ten1[1][0] == 1) {
			if(count10%2 == 1) {
				g.setColor(Color.black);
				ten1[1][0] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[1][0] = 0;
			}
			g.fillRect(92, 122, 27, 27);
		}
		if(ten1[1][1] == 1) {
			if(count11%2 == 1) {
				g.setColor(Color.black);
				ten1[1][1] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[1][1] = 0;
			}
			g.fillRect(122, 122, 27, 27);
		}
		if(ten1[1][2] == 1) {
			if(count12%2 == 1) {
				g.setColor(Color.black);				
				ten1[1][2] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[1][2] = 0;
			}
			g.fillRect(152, 122, 27, 27);
		}
		if(ten1[1][3] == 1) {
			if(count13%2 == 1) {
				g.setColor(Color.black);
				ten1[1][3] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[1][3] = 0;
			}
			g.fillRect(182, 122, 27, 27);
		}
		if(ten1[1][4] == 1) {
			if(count14%2 == 1) {
				g.setColor(Color.black);
				ten1[1][4] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[1][4] = 0;
			}
			g.fillRect(212, 122, 27, 27);
		}
		if(ten1[1][5] == 1) {
			if(count15%2 == 1) {
				g.setColor(Color.black);
				ten1[1][5] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[1][5] = 0;
			}
			g.fillRect(242, 122, 27, 27);
		}
		if(ten1[1][6] == 1) {
			if(count16%2 == 1) {
				g.setColor(Color.black);
				ten1[1][6] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[1][6] = 0;
			}
			g.fillRect(272, 122, 27, 27);
		}
		if(ten1[1][7] == 1) {
			if(count17%2 == 1) {
				g.setColor(Color.black);
				ten1[1][7] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[1][7] = 0;
			}
			g.fillRect(302, 122, 27, 27);
		}
		if(ten1[1][8] == 1) {
			if(count18%2 == 1) {
				g.setColor(Color.black);
				ten1[1][8] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[1][8] = 0;
			}
			g.fillRect(332, 122, 27, 27);
		}
		if(ten1[1][9] == 1) {
			if(count19%2 == 1) {
				g.setColor(Color.black);
				ten1[1][9] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[1][9] = 0;
			}
			g.fillRect(362, 122, 27, 27);
		}
		
		//3
		if(90<x&& x<120 && 170<y && y<200) {	
			ten1[2][0] = 1;
			count20 += 1;
		}
		if(120<x&& x<150 && 170<y && y<200) {	
			ten1[2][1] = 1;
			count21 += 1;
		}
		if(150<x&& x<180 && 170<y && y<200) {	
			ten1[2][2] = 1;
			count22 += 1;
		}
		if(180<x&& x<210 && 170<y && y<200) {	
			ten1[2][3] = 1;
			count23 += 1;
		}
		if(210<x&& x<240 && 170<y && y<200) {	
			ten1[2][4] = 1;
			count24 += 1;
		}
		if(240<x&& x<270 && 170<y && y<200) {	
			ten1[2][5] = 1;
			count25 += 1;
		}
		if(270<x&& x<300 && 170<y && y<200) {	
			ten1[2][6] = 1;
			count26 += 1;
		}
		if(300<x&& x<330 && 170<y && y<200) {	
			ten1[2][7] = 1;
			count27 += 1;
		}
		if(330<x&& x<360 && 170<y && y<200) {	
			ten1[2][8] = 1;
			count28 += 1;
		}
		if(360<x&& x<390 && 170<y && y<200) {	
			ten1[2][9] = 1;
			count29 += 1;
		}
		
		
		
		if(ten1[2][0] == 1) {
			if(count20%2 == 1) {
				g.setColor(Color.black);
				ten1[2][0] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[2][0] = 0;
			}
			g.fillRect(92, 152, 27, 27);
		}
		if(ten1[2][1] == 1) {
			if(count21%2 == 1) {
				g.setColor(Color.black);
				ten1[2][1] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[2][1] = 0;
			}
			g.fillRect(122, 152, 27, 27);
		}
		if(ten1[2][2] == 1) {
			if(count22%2 == 1) {
				g.setColor(Color.black);
				ten1[2][2] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[2][2] = 0;
			}
			g.fillRect(152, 152, 27, 27);
		}
		if(ten1[2][3] == 1) {
			if(count23%2 == 1) {
				g.setColor(Color.black);
				ten1[2][3] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[2][3] = 0;
			}
			g.fillRect(182, 152, 27, 27);
		}
		if(ten1[2][4] == 1) {
			if(count24%2 == 1) {
				g.setColor(Color.black);
				ten1[2][4] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[2][4] = 0;
			}
			g.fillRect(212, 152, 27, 27);
		}
		if(ten1[2][5] == 1) {
			if(count25%2 == 1) {
				g.setColor(Color.black);
				ten1[2][5] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[2][5] = 0;
			}
			g.fillRect(242, 152, 27, 27);
		}
		if(ten1[2][6] == 1) {
			if(count26%2 == 1) {
				g.setColor(Color.black);
				ten1[2][6] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[2][6] = 0;
			}
			g.fillRect(272, 152, 27, 27);
		}
		if(ten1[2][7] == 1) {
			if(count27%2 == 1) {
				g.setColor(Color.black);
				ten1[2][7] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[2][7] = 0;
			}
			g.fillRect(302, 152, 27, 27);
		}
		if(ten1[2][8] == 1) {
			if(count28%2 == 1) {
				g.setColor(Color.black);
				ten1[2][8] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[2][8] = 0;
			}
			g.fillRect(332, 152, 27, 27);
		}
		if(ten1[2][9] == 1) {
			if(count29%2 == 1) {
				g.setColor(Color.black);
				ten1[2][9] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[2][9] = 0;
			}
			g.fillRect(362, 152, 27, 27);
		}
		
		//4
		if(90<x&& x<120 && 200<y && y<230) {	
			ten1[3][0] = 1;
			count30 += 1;
		}
		if(120<x&& x<150 && 200<y && y<230) {	
			ten1[3][1] = 1;
			count31 += 1;
		}
		if(150<x&& x<180 && 200<y && y<230) {	
			ten1[3][2] = 1;
			count32 += 1;
		}
		if(180<x&& x<210 && 200<y && y<230) {	
			ten1[3][3] = 1;
			count33 += 1;
		}
		if(210<x&& x<240 && 200<y && y<230) {	
			ten1[3][4] = 1;
			count34 += 1;
		}
		if(240<x&& x<270 && 200<y && y<230) {	
			ten1[3][5] = 1;
			count35 += 1;
		}
		if(270<x&& x<300 && 200<y && y<230) {	
			ten1[3][6] = 1;
			count36 += 1;
		}
		if(300<x&& x<330 && 200<y && y<230) {	
			ten1[3][7] = 1;
			count37 += 1;
		}
		if(330<x&& x<360 && 200<y && y<230) {	
			ten1[3][8] = 1;
			count38 += 1;
		}
		if(360<x&& x<390 && 200<y && y<230) {	
			ten1[3][9] = 1;
			count39 += 1;
		}
		
		
		if(ten1[3][0] == 1) {
			if(count30%2 == 1) {
				g.setColor(Color.black);
				ten1[3][0] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[3][0] = 0;
			}
			g.fillRect(92, 182, 27, 27);
		}
		if(ten1[3][1] == 1) {
			if(count31%2 == 1) {
				g.setColor(Color.black);
				ten1[3][1] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[3][1] = 0;
			}
			g.fillRect(122, 182, 27, 27);
		}
		if(ten1[3][2] == 1) {
			if(count32%2 == 1) {
				g.setColor(Color.black);
				ten1[3][2] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[3][1] = 0;
			}
			g.fillRect(152, 182, 27, 27);
		}
		if(ten1[3][3] == 1) {
			if(count33%2 == 1) {
				g.setColor(Color.black);
				ten1[3][3] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[3][3] = 0;
			}
			g.fillRect(182, 182, 27, 27);
		}
		if(ten1[3][4] == 1) {
			if(count34%2 == 1) {
				g.setColor(Color.black);
				ten1[3][4] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[3][4] = 0;
			}
			g.fillRect(212, 182, 27, 27);
		}
		if(ten1[3][5] == 1) {
			if(count35%2 == 1) {
				g.setColor(Color.black);
				ten1[3][5] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[3][5] = 0;
			}
			g.fillRect(242, 182, 27, 27);
		}
		if(ten1[3][6] == 1) {
			if(count36%2 == 1) {
				g.setColor(Color.black);
				ten1[3][6] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[3][6] = 0;
			}
			g.fillRect(272, 182, 27, 27);
		}
		if(ten1[3][7] == 1) {
			if(count37%2 == 1) {
				g.setColor(Color.black);
				ten1[3][7] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[3][7] = 0;
			}
			g.fillRect(302, 182, 27, 27);
		}
		if(ten1[3][8] == 1) {
			if(count38%2 == 1) {
				g.setColor(Color.black);
				ten1[3][8] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[3][8] = 0;
			}
			g.fillRect(332, 182, 27, 27);
		}
		if(ten1[3][9] == 1) {
			if(count39%2 == 1) {
				g.setColor(Color.black);
				ten1[3][9] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[3][9] = 0;
			}
			g.fillRect(362, 182, 27, 27);
		}
		
		//5
		if(90<x&& x<120 && 230<y && y<260) {	
			ten1[4][0] = 1;
			count40 += 1;
		}
		if(120<x&& x<150 && 230<y && y<260) {	
			ten1[4][1] = 1;
			count41 += 1;
		}
		if(150<x&& x<180 && 230<y && y<260) {	
			ten1[4][2] = 1;
			count42 += 1;
		}
		if(180<x&& x<210 && 230<y && y<260) {	
			ten1[4][3] = 1;
			count43 += 1;
		}
		if(210<x&& x<240 && 230<y && y<260) {	
			ten1[4][4] = 1;
			count44 += 1;
		}
		if(240<x&& x<270 && 230<y && y<260) {	
			ten1[4][5] = 1;
			count45 += 1;
		}
		if(270<x&& x<300 && 230<y && y<260) {	
			ten1[4][6] = 1;
			count46 += 1;
		}
		if(300<x&& x<330 && 230<y && y<260) {	
			ten1[4][7] = 1;
			count47 += 1;
		}
		if(330<x&& x<360 && 230<y && y<260) {	
			ten1[4][8] = 1;
			count48 += 1;
		}
		if(360<x&& x<390 && 230<y && y<260) {	
			ten1[4][9] = 1;
			count49 += 1;
		}
		
		if(ten1[4][0] == 1) {
			if(count40%2 == 1) {
				g.setColor(Color.black);
				ten1[4][0] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[4][0] = 0;
			}
			g.fillRect(92, 212, 27, 27);
		}
		if(ten1[4][1] == 1) {
			if(count41%2 == 1) {
				g.setColor(Color.black);
				ten1[4][1] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[4][1] = 0;
			}
			g.fillRect(122, 212, 27, 27);
		}
		if(ten1[4][2] == 1) {
			if(count42%2 == 1) {
				g.setColor(Color.black);
				ten1[4][2] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[4][2] = 0;
			}
			g.fillRect(152, 212, 27, 27);
		}
		if(ten1[4][3] == 1) {
			if(count43%2 == 1) {
				g.setColor(Color.black);
				ten1[4][3] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[4][3] = 0;
			}
			g.fillRect(182, 212, 27, 27);
		}
		if(ten1[4][4] == 1) {
			if(count44%2 == 1) {
				g.setColor(Color.black);
				ten1[4][4] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[4][4] = 0;
			}
			g.fillRect(212, 212, 27, 27);
		}
		if(ten1[4][5] == 1) {
			if(count45%2 == 1) {
				g.setColor(Color.black);
				ten1[4][5] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[4][5] = 0;
			}
			g.fillRect(242, 212, 27, 27);
		}
		if(ten1[4][6] == 1) {
			if(count46%2 == 1) {
				g.setColor(Color.black);
				ten1[4][6] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[4][6] = 0;
			}
			g.fillRect(272, 212, 27, 27);
		}
		if(ten1[4][7] == 1) {
			if(count47%2 == 1) {
				g.setColor(Color.black);
				ten1[4][7] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[4][7] = 0;
			}
			g.fillRect(302, 212, 27, 27);
		}
		if(ten1[4][8] == 1) {
			if(count48%2 == 1) {
				g.setColor(Color.black);
				ten1[4][8] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[4][8] = 0;
			}
			g.fillRect(332, 212, 27, 27);
		}
		if(ten1[4][9] == 1) {
			if(count49%2 == 1) {
				g.setColor(Color.black);
				ten1[4][9] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[4][9] = 0;
			}
			g.fillRect(362, 212, 27, 27);
		}
		
		//6
		if(90<x&& x<120 && 260<y && y<290) {	
			ten1[5][0] = 1;
			count50 += 1;
		}
		if(120<x&& x<150 && 260<y && y<290) {	
			ten1[5][1] = 1;
			count51 += 1;
		}
		if(150<x&& x<180 && 260<y && y<290) {	
			ten1[5][2] = 1;
			count52 += 1;
		}
		if(180<x&& x<210 && 260<y && y<290) {	
			ten1[5][3] = 1;
			count53 += 1;
		}
		if(210<x&& x<240 && 260<y && y<290) {	
			ten1[5][4] = 1;
			count54 += 1;
		}
		if(240<x&& x<270 && 260<y && y<290) {	
			ten1[5][5] = 1;
			count55 += 1;
		}
		if(270<x&& x<300 && 260<y && y<290) {	
			ten1[5][6] = 1;
			count56 += 1;
		}
		if(300<x&& x<330 && 260<y && y<290) {	
			ten1[5][7] = 1;
			count57 += 1;
		}
		if(330<x&& x<360 && 260<y && y<290) {	
			ten1[5][8] = 1;
			count58 += 1;
		}
		if(360<x&& x<390 && 260<y && y<290) {	
			ten1[5][9] = 1;
			count59 += 1;
		}
		
		if(ten1[5][0] == 1) {
			if(count50%2 == 1) {
				g.setColor(Color.black);
				ten1[5][0] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[5][0] = 0;
			}
			g.fillRect(92, 242, 27, 27);
		}
		if(ten1[5][1] == 1) {
			if(count51%2 == 1) {
				g.setColor(Color.black);
				ten1[5][1] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[5][1] = 0;
			}
			g.fillRect(122, 242, 27, 27);
		}
		if(ten1[5][2] == 1) {
			if(count52%2 == 1) {
				g.setColor(Color.black);
				ten1[5][2] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[5][2] = 0;
			}
			g.fillRect(152, 242, 27, 27);
		}
		if(ten1[5][3] == 1) {
			if(count53%2 == 1) {
				g.setColor(Color.black);
				ten1[5][3] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[5][3] = 0;
			}
			g.fillRect(182, 242, 27, 27);
		}
		if(ten1[5][4] == 1) {
			if(count54%2 == 1) {
				g.setColor(Color.black);
				ten1[5][4] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[5][4] = 0;
			}
			g.fillRect(212, 242, 27, 27);
		}
		if(ten1[5][5] == 1) {
			if(count55%2 == 1) {
				g.setColor(Color.black);
				ten1[5][5] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[5][5] = 0;
			}
			g.fillRect(242, 242, 27, 27);
		}
		if(ten1[5][6] == 1) {
			if(count56%2 == 1) {
				g.setColor(Color.black);
				ten1[5][6] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[5][6] = 0;
			}
			g.fillRect(272, 242, 27, 27);
		}
		if(ten1[5][7] == 1) {
			if(count57%2 == 1) {
				g.setColor(Color.black);
				ten1[5][7] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[5][7] = 0;
			}
			g.fillRect(302, 242, 27, 27);
		}
		if(ten1[5][8] == 1) {
			if(count58%2 == 1) {
				g.setColor(Color.black);
				ten1[5][8] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[5][8] = 0;
			}
			g.fillRect(332, 242, 27, 27);
		}
		if(ten1[5][9] == 1) {
			if(count59%2 == 1) {
				g.setColor(Color.black);
				ten1[5][9] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[5][9] = 0;
			}
			g.fillRect(362, 242, 27, 27);
		}
		
		//7
		if(90<x&& x<120 && 290<y && y<320) {	
			ten1[6][0] = 1;
			count60 += 1;
		}
		if(120<x&& x<150 && 290<y && y<320) {	
			ten1[6][1] = 1;
			count61 += 1;
		}
		if(150<x&& x<180 && 290<y && y<320) {	
			ten1[6][2] = 1;
			count62 += 1;
		}
		if(180<x&& x<210 && 290<y && y<320) {	
			ten1[6][3] = 1;
			count63 += 1;
		}
		if(210<x&& x<240 && 290<y && y<320) {	
			ten1[6][4] = 1;
			count64 += 1;
		}
		if(240<x&& x<270 && 290<y && y<320) {	
			ten1[6][5] = 1;
			count65 += 1;
		}
		if(270<x&& x<300 && 290<y && y<320) {	
			ten1[6][6] = 1;
			count66 += 1;
		}
		if(300<x&& x<330 && 290<y && y<320) {	
			ten1[6][7] = 1;
			count67 += 1;
		}
		if(330<x&& x<360 && 290<y && y<320) {	
			ten1[6][8] = 1;
			count68 += 1;
		}
		if(360<x&& x<390 && 290<y && y<320) {	
			ten1[6][9] = 1;
			count69 += 1;
		}
		
		if(ten1[6][0] == 1) {
			if(count60%2 == 1) {
				g.setColor(Color.black);
				ten1[6][0] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[6][0] = 0;
			}
			g.fillRect(92, 272, 27, 27);
		}
		if(ten1[6][1] == 1) {
			if(count61%2 == 1) {
				g.setColor(Color.black);
				ten1[6][1] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[6][1] = 0;
			}
			g.fillRect(122, 272, 27, 27);
		}
		if(ten1[6][2] == 1) {
			if(count62%2 == 1) {
				g.setColor(Color.black);
				ten1[6][2] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[6][2] = 0;
			}
			g.fillRect(152, 272, 27, 27);
		}
		if(ten1[6][3] == 1) {
			if(count63%2 == 1) {
				g.setColor(Color.black);
				ten1[6][3] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[6][3] = 0;
			}
			g.fillRect(182, 272, 27, 27);
		}
		if(ten1[6][4] == 1) {
			if(count64%2 == 1) {
				g.setColor(Color.black);
				ten1[6][4] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[6][4] = 0;
			}
			g.fillRect(212, 272, 27, 27);
		}
		if(ten1[6][5] == 1) {
			if(count65%2 == 1) {
				g.setColor(Color.black);
				ten1[6][5] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[6][5] = 0;
			}
			g.fillRect(242, 272, 27, 27);
		}
		if(ten1[6][6] == 1) {
			if(count66%2 == 1) {
				g.setColor(Color.black);
				ten1[6][6] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[6][6] = 0;
			}
			g.fillRect(272, 272, 27, 27);
		}
		if(ten1[6][7] == 1) {
			if(count67%2 == 1) {
				g.setColor(Color.black);
				ten1[6][7] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[6][7] = 0;
			}
			g.fillRect(302, 272, 27, 27);
		}
		if(ten1[6][8] == 1) {
			if(count68%2 == 1) {
				g.setColor(Color.black);
				ten1[6][8] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[6][8] = 0;
			}
			g.fillRect(332, 272, 27, 27);
		}
		if(ten1[6][9] == 1) {
			if(count69%2 == 1) {
				g.setColor(Color.black);
				ten1[6][9] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[6][9] = 0;
			}
			g.fillRect(362, 272, 27, 27);
		}
		
		//8
		if(90<x&& x<120 && 320<y && y<350) {	
			ten1[7][0] = 1;
			count70 += 1;
		}
		if(120<x&& x<150 && 320<y && y<350) {	
			ten1[7][1] = 1;
			count71 += 1;
		}
		if(150<x&& x<180 && 320<y && y<350) {	
			ten1[7][2] = 1;
			count72 += 1;
		}
		if(180<x&& x<210 && 320<y && y<350) {	
			ten1[7][3] = 1;
			count73 += 1;
		}
		if(210<x&& x<240 && 320<y && y<350) {	
			ten1[7][4] = 1;
			count74 += 1;
		}
		if(240<x&& x<270 && 320<y && y<350) {	
			ten1[7][5] = 1;
			count75 += 1;
		}
		if(270<x&& x<300 && 320<y && y<350) {	
			ten1[7][6] = 1;
			count76 += 1;
		}
		if(300<x&& x<330 && 320<y && y<350) {	
			ten1[7][7] = 1;
			count77 += 1;
		}
		if(330<x&& x<360 && 320<y && y<350) {	
			ten1[7][8] = 1;
			count78 += 1;
		}
		if(360<x&& x<390 && 320<y && y<350) {	
			ten1[7][9] = 1;
			count79 += 1;
		}
		
		if(ten1[7][0] == 1) {
			if(count70%2 == 1) {
				g.setColor(Color.black);
				ten1[7][0] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[7][0] = 0;
			}
			g.fillRect(92, 302, 27, 27);
		}
		if(ten1[7][1] == 1) {
			if(count71%2 == 1) {
				g.setColor(Color.black);
				ten1[7][1] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[7][1] = 0;
			}
			g.fillRect(122, 302, 27, 27);
		}
		if(ten1[7][2] == 1) {
			if(count72%2 == 1) {
				g.setColor(Color.black);
				ten1[7][2] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[7][2] = 0;
			}
			g.fillRect(152, 302, 27, 27);
		}
		if(ten1[7][3] == 1) {
			if(count73%2 == 1) {
				g.setColor(Color.black);
				ten1[7][3] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[7][3] = 0;
			}
			g.fillRect(182, 302, 27, 27);
		}
		if(ten1[7][4] == 1) {
			if(count74%2 == 1) {
				g.setColor(Color.black);
				ten1[7][4] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[7][4] = 0;
			}
			g.fillRect(212, 302, 27, 27);
		}
		if(ten1[7][5] == 1) {
			if(count75%2 == 1) {
				g.setColor(Color.black);
				ten1[7][5] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[7][5] = 0;
			}
			g.fillRect(242, 302, 27, 27);
		}
		if(ten1[7][6] == 1) {
			if(count76%2 == 1) {
				g.setColor(Color.black);
				ten1[7][6] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[7][6] = 0;
			}
			g.fillRect(272, 302, 27, 27);
		}
		if(ten1[7][7] == 1) {
			if(count77%2 == 1) {
				g.setColor(Color.black);
				ten1[7][7] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[7][7] = 0;
			}
			g.fillRect(302, 302, 27, 27);
		}
		if(ten1[7][8] == 1) {
			if(count78%2 == 1) {
				g.setColor(Color.black);
				ten1[7][8] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[7][8] = 0;
			}
			g.fillRect(332, 302, 27, 27);
		}
		if(ten1[7][9] == 1) {
			if(count79%2 == 1) {
				g.setColor(Color.black);
				ten1[7][9] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[7][9] = 0;
			}
			g.fillRect(362, 302, 27, 27);
		}
		
		//9
		if(90<x&& x<120 && 350<y && y<380) {	
			ten1[8][0] = 1;
			count80 += 1;
		}
		if(120<x&& x<150 && 350<y && y<380) {	
			ten1[8][1] = 1;
			count81 += 1;
		}
		if(150<x&& x<180 && 350<y && y<380) {	
			ten1[8][2] = 1;
			count82 += 1;
		}
		if(180<x&& x<210 && 350<y && y<380) {	
			ten1[8][3] = 1;
			count83 += 1;
		}
		if(210<x&& x<240 && 350<y && y<380) {	
			ten1[8][4] = 1;
			count84 += 1;
		}
		if(240<x&& x<270 && 350<y && y<380) {	
			ten1[8][5] = 1;
			count85 += 1;
		}
		if(270<x&& x<300 && 350<y && y<380) {	
			ten1[8][6] = 1;
			count86 += 1;
		}
		if(300<x&& x<330 && 350<y && y<380) {	
			ten1[8][7] = 1;
			count87 += 1;
		}
		if(330<x&& x<360 && 350<y && y<380) {	
			ten1[8][8] = 1;
			count88 += 1;
		}
		if(360<x&& x<390 && 350<y && y<380) {	
			ten1[8][9] = 1;
			count89 += 1;
		}
		
		if(ten1[8][0] == 1) {
			if(count80%2 == 1) {
				g.setColor(Color.black);
				ten1[8][0] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[8][0] = 0;
			}
			g.fillRect(92, 332, 27, 27);
		}
		if(ten1[8][1] == 1) {
			if(count81%2 == 1) {
				g.setColor(Color.black);
				ten1[8][1] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[8][1] = 0;
			}
			g.fillRect(122, 332, 27, 27);
		}
		if(ten1[8][2] == 1) {
			if(count82%2 == 1) {
				g.setColor(Color.black);
				ten1[8][2] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[8][2] = 0;
			}
			g.fillRect(152, 332, 27, 27);
		}
		if(ten1[8][3] == 1) {
			if(count83%2 == 1) {
				g.setColor(Color.black);
				ten1[8][3] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[8][3] = 0;
			}
			g.fillRect(182, 332, 27, 27);
		}
		if(ten1[8][4] == 1) {
			if(count84%2 == 1) {
				g.setColor(Color.black);
				ten1[8][4] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[8][4] = 0;
			}
			g.fillRect(212, 332, 27, 27);
		}
		if(ten1[8][5] == 1) {
			if(count85%2 == 1) {
				g.setColor(Color.black);
				ten1[8][5] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[8][5] = 0;
			}
			g.fillRect(242, 332, 27, 27);
		}
		if(ten1[8][6] == 1) {
			if(count86%2 == 1) {
				g.setColor(Color.black);
				ten1[8][6] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[8][6] = 0;
			}
			g.fillRect(272, 332, 27, 27);
		}
		if(ten1[8][7] == 1) {
			if(count87%2 == 1) {
				g.setColor(Color.black);
				ten1[8][7] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[8][7] = 0;
			}
			g.fillRect(302, 332, 27, 27);
		}
		if(ten1[8][8] == 1) {
			if(count88%2 == 1) {
				g.setColor(Color.black);
				ten1[8][8] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[8][8] = 0;
			}
			g.fillRect(332, 332, 27, 27);
		}
		if(ten1[8][9] == 1) {
			if(count89%2 == 1) {
				g.setColor(Color.black);
				ten1[8][9] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[8][9] = 0;
			}
			g.fillRect(362, 332, 27, 27);
		}
		
		//10
		if(90<x&& x<120 && 380<y && y<410) {	
			ten1[9][0] = 1;
			count90 += 1;
		}
		if(120<x&& x<150 && 380<y && y<410) {	
			ten1[9][1] = 1;
			count91 += 1;
		}
		if(150<x&& x<180 && 380<y && y<410) {	
			ten1[9][2] = 1;
			count92 += 1;
		}
		if(180<x&& x<210 && 380<y && y<410) {	
			ten1[9][3] = 1;
			count93 += 1;
		}
		if(210<x&& x<240 && 380<y && y<410) {	
			ten1[9][4] = 1;
			count94 += 1;
		}
		if(240<x&& x<270 && 380<y && y<410) {	
			ten1[9][5] = 1;
			count95 += 1;
		}
		if(270<x&& x<300 && 380<y && y<410) {	
			ten1[9][6] = 1;
			count96 += 1;
		}
		if(300<x&& x<330 && 380<y && y<410) {	
			ten1[9][7] = 1;
			count97 += 1;
		}
		if(330<x&& x<360 && 380<y && y<410) {	
			ten1[9][8] = 1;
			count98 += 1;
		}
		if(360<x&& x<390 && 380<y && y<410) {	
			ten1[9][9] = 1;
			count99 += 1;
		}
		
		if(ten1[9][0] == 1) {
			if(count90%2 == 1) {
				g.setColor(Color.black);
				ten1[9][0] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[9][0] = 0;
			}
			g.fillRect(92, 362, 27, 27);
		}
		if(ten1[9][1] == 1) {
			if(count91%2 == 1) {
				g.setColor(Color.black);
				ten1[9][1] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[9][1] = 0;
			}
			g.fillRect(122, 362, 27, 27);
		}
		if(ten1[9][2] == 1) {
			if(count92%2 == 1) {
				g.setColor(Color.black);
				ten1[9][2] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[9][2] = 0;
			}
			g.fillRect(152, 362, 27, 27);
		}
		if(ten1[9][3] == 1) {
			if(count93%2 == 1) {
				g.setColor(Color.black);
				ten1[9][3] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[9][3] = 0;
			}
			g.fillRect(182, 362, 27, 27);
		}
		if(ten1[9][4] == 1) {
			if(count94%2 == 1) {
				g.setColor(Color.black);
				ten1[9][4] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[9][4] = 0;
			}
			g.fillRect(212, 362, 27, 27);
		}
		if(ten1[9][5] == 1) {
			if(count95%2 == 1) {
				g.setColor(Color.black);
				ten1[9][5] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[9][5] = 0;
			}
			g.fillRect(242, 362, 27, 27);
		}
		if(ten1[9][6] == 1) {
			if(count96%2 == 1) {
				g.setColor(Color.black);
				ten1[9][6] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[9][6] = 0;
			}
			g.fillRect(272, 362, 27, 27);
		}
		if(ten1[9][7] == 1) {
			if(count97%2 == 1) {
				g.setColor(Color.black);
				ten1[9][7] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[9][7] = 0;
			}
			g.fillRect(302, 362, 27, 27);
		}
		if(ten1[9][8] == 1) {
			if(count98%2 == 1) {
				g.setColor(Color.black);
				ten1[9][8] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[9][8] = 0;
			}
			g.fillRect(332, 362, 27, 27);
		}
		if(ten1[9][9] == 1) {
			if(count99%2 == 1) {
				g.setColor(Color.black);
				ten1[9][9] = 1;
			}
			else {
				g.setColor(Color.white);
				ten1[9][9] = 0;
			}
			g.fillRect(362, 362, 27, 27);
		}
		
		
		int same = 0;
		
		//비교 
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				if(ten[i][j] == ten1[i][j]) {
					same += 1;
				}
			}
		}
		if(same == 100) {
			JOptionPane.showMessageDialog(null, "정답!");
		}
	}

	public void mousedemo() {
		m_x = 0;
		m_y = 0;
		
	}
	//마우스 이벤트
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}


	
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	public static void main(String[] args) {
		new tenbyten();
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	

}


