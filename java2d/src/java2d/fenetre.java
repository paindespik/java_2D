package java2d;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fenetre extends JFrame{
	Panneau pan =new Panneau();
	JButton bouton = new JButton("remettre au centre");
	JPanel Jbouton=new JPanel();
	public fenetre() {
		
		
		
		// TODO Instancier une JFrame
		this.setSize(500, 500);
		this.setTitle("votre première fenêtre SWING avec Objis");
		this.setLocation(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setAlwaysOnTop(false);
		
	/*	// Instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		//définition de sa couleur de fond
		pan.setBackground(Color.ORANGE);
		// On prévient notre JFrame que notre JPanel sera sont content pane
		this.setContentPane(pan);
		
		*/
		
		this.add(pan,BorderLayout.CENTER);
		
		this.add(bouton,BorderLayout.SOUTH);
		
		
		
		
		
		// TODO Afficher la JFrame
		this.setVisible(true);
		go();
	}
	
	private void go() {
		
		boolean backX=false;
		boolean backY=true;
		
		
		for (;;) {
			
			
			bouton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					pan.setPosX(pan.getWidth()/2);
					pan.setPosY(pan.getHeight()/2);
				}
			});
			
			
			
			
			
			int posX = pan.getPosX();
			int posY = pan.getPosY();
			int coinPosX=pan.getWidth()-pan.getPosX();
			int coinPosY=pan.getHeight()-pan.getPosY();
			
			if(posX<1) {
				backX=false;
			}
			if(posY<1) {
				backY=false;
			}
			if(coinPosX<51) {
				backX=true;
			}
			if (coinPosY<51) {
				backY=true;
			}
			
			
			
			
			
			if(backX==false) {
				posX++;
			}
			else{
				posX--;
			}
			
			if(backY==false) {
				posY++;
			}
			else {
				posY--;
			}
			
			
			
			pan.setPosX(posX);
			pan.setPosY(posY);
			pan.repaint();
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
}
