package java_button;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	
	
	JButton bouton = new JButton("Mon premier bouton");
	JButton bouton2 = new JButton("Mon premier bouton");
	public Fenetre() {
		
		
		// TODO setLayout est un objet de JFrame. boderlayout pour dire qu'on veut un agencement cardinal de notre layout.
		// TODO on peut utiliser sinon un jpanel qui placer les trucs à leurs emplacement par défaut
		
		//this.setLayout(new BorderLayout());
		 
		// pour faire une grille : premier paramètre nombre de ligne, deuxième nombre de colonnes
		 this.setLayout(new GridLayout(3, 2));
		
		
		
		// TODO Instancier une JFrame 
		this.setSize(500, 500);
		this.setTitle("Animation");
		this.setLocation(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setAlwaysOnTop(false);
		this.setVisible(true);
		
		
	   
	    //On ajoute le bouton au content pane de la JFrame
	    this.add(bouton);
	    this.add(bouton2);
	    this.setVisible(true);
		
	}
}
