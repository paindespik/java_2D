package java2d;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fenetre extends JFrame{

	public fenetre() {
		
		// TODO Instancier une JFrame
		this.setSize(100, 150);
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
		
		this.setContentPane(new Panneau());
		
		
		
		
		// TODO Afficher la JFrame
		this.setVisible(true);
	}
}
