package com.objis.demoswing.fenetres;

import javax.swing.JFrame;

public class fenetre2 extends JFrame{
	
	fenetre2(){
		JFrame maFenetre1 = new JFrame();	
		maFenetre1.setSize(400, 300);
		maFenetre1.setTitle("votre première fenêtre SWING avec Objis");
		maFenetre1.setLocationRelativeTo(null);
		maFenetre1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maFenetre1.setResizable(false);
	}

}
