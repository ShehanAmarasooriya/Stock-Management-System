/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Dulitha Dissanayake
 */
import javax.swing.*;
import java.awt.*;
public class View extends JFrame{
	private JPanel cardPanel;
	private JLabel background;
	private JLabel card1,card2,card3,card4,card5,card6,card7,card8;
	public View(){
		initComponents();
	}
	
	private void initComponents(){
		style();
		setBackLayer();
		setCardPanel();
		setCard();
	}
	
	private void style(){
		setSize(1024,730);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
	}
	
	private void setBackLayer(){
		background=new JLabel();
		background.setBounds(0,0,1024,730);
		background.setBackground(Color.WHITE);
		background.setOpaque(true);
		add(background);
	}
	
	private void setCardPanel(){
		cardPanel=new JPanel(null);
		cardPanel.setBounds(67,450,880,140);
		cardPanel.setBackground(new Color(0,128,0));
		background.add(cardPanel);
	}
	
	private void setCard(){
		card1=new JLabel();
		card1.setBounds(0,0,100,140);
		card1.setBackground(new Color(0,0,0));
		card1.setOpaque(true);
		cardPanel.add(card1);
		
		card2=new JLabel();
		card2.setBounds(110,0,100,140);
		card2.setBackground(new Color(0,0,0));
		card2.setOpaque(true);
		cardPanel.add(card2);
		
		card3=new JLabel();
		card3.setBounds(220,0,100,140);
		card3.setBackground(new Color(0,0,0));
		card3.setOpaque(true);
		cardPanel.add(card3);
		
		card4=new JLabel();
		card4.setBounds(330,0,100,140);
		card4.setBackground(new Color(0,0,0));
		card4.setOpaque(true);
		cardPanel.add(card4);
		
		card5=new JLabel();
		card5.setBounds(440,0,100,140);
		card5.setBackground(new Color(0,0,0));
		card5.setOpaque(true);
		cardPanel.add(card5);
		
		card6=new JLabel();
		card6.setBounds(550,0,100,140);
		card6.setBackground(new Color(0,0,0));
		card6.setOpaque(true);
		cardPanel.add(card6);
		
		card7=new JLabel();
		card7.setBounds(660,0,100,140);
		card7.setBackground(new Color(0,0,0));
		card7.setOpaque(true);
		cardPanel.add(card7);
		
		card8=new JLabel();
		card8.setBounds(770,0,100,140);
		card8.setBackground(new Color(0,0,0));
		card8.setOpaque(true);
		cardPanel.add(card8);
	}
			
	public static void main(String args[]){
		View view=new View();
		view.setVisible(true);
	}
}
