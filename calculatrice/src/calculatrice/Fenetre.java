package calculatrice;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	JLabel output=new JLabel();
	JPanel nb = new JPanel();
	JPanel content=new JPanel();
	JPanel operateur = new JPanel();
	
	
	Bouton bouton1=new Bouton("1");
	Bouton bouton2=new Bouton("2");
	Bouton bouton3=new Bouton("3");
	Bouton bouton4=new Bouton("4");
	Bouton bouton5=new Bouton("5");
	Bouton bouton6=new Bouton("6");
	Bouton bouton7=new Bouton("7");
	Bouton bouton8=new Bouton("8");
	Bouton bouton9=new Bouton("9");
	
	public Fenetre() {
		this.setSize(500, 500);
		this.setTitle("calculatrice");
		this.setLocation(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setAlwaysOnTop(false);
		
		nb.setLayout(new GridLayout(3,3));
		nb.add(bouton1);
		nb.add(bouton2);
		nb.add(bouton3);
		nb.add(bouton4);
		nb.add(bouton5);
		nb.add(bouton6);
		nb.add(bouton7);
		nb.add(bouton8);
		nb.add(bouton9);
		
		
		this.add(operateur,BorderLayout.EAST);
		this.add(output,BorderLayout.NORTH);
		this.add(nb, BorderLayout.CENTER);
		this.setVisible(true);
	}
	

}
