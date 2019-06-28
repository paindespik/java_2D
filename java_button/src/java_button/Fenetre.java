package java_button;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	
	
	JButton bouton = new JButton("Mon premier bouton");
	JButton bouton2 = new JButton("Mon premier bouton");
	
	
	CardLayout cl = new CardLayout();
	JPanel content = new JPanel();
	String[] listContent = {"CARD_1","CARD_2","CARD_3"};
	int indice=0;
	
	
	public Fenetre() {
		
		
		
		
		// TODO Instancier une JFrame 
		this.setSize(500, 500);
		this.setTitle("Animation");
		this.setLocation(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setAlwaysOnTop(false);
		
		
		JPanel boutonPane = new JPanel();
		JPanel card1=new JPanel();
		card1.setBackground(Color.blue);
		JPanel card2=new JPanel();
		card2.setBackground(Color.GREEN);
		JPanel card3=new JPanel();
		card3.setBackground(Color.ORANGE);
		
		content.add(card1, listContent[0]);
		content.add(card2, listContent[1]);
		content.add(card3, listContent[2]);
		
		
		JButton  bouton = new JButton("contenu suivant");
		
		bouton.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){
		        
		        cl.next(content);
		      }
		    });
		JButton  bouton2= new JButton("contenu par indice");
		
		
		bouton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (++indice>2)
					indice=0;
				
				cl.show(content, listContent[indice]);
			}
		});
		
		
		
		
		
		boutonPane.add(bouton);
		boutonPane.add(bouton2);
		
		 
		
		
		content.setLayout(cl);
		this.add(content,BorderLayout.CENTER);
		this.add(boutonPane,BorderLayout.NORTH);
		
			
		
		
		// TODO setLayout est un objet de JFrame. boderlayout pour dire qu'on veut un agencement cardinal de notre layout.
		// TODO on peut utiliser sinon un jpanel qui placer les trucs à leurs emplacement par défaut
		
		//this.setLayout(new BorderLayout());
		 
		// pour faire une grille : premier paramètre nombre de ligne, deuxième nombre de colonnes
		
		//this.setLayout(new GridLayout(3, 2));
		
		
		
	
		
		
		/*
	   // TODO BoxLayout : 
	    //On ajoute le bouton au content pane de la JFrame
	  
		 JPanel b1 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		    b1.add(new JButton("Bouton 1"));

		    JPanel b2 = new JPanel();
		    //Idem pour cette ligne
		    b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
		    b2.add(new JButton("Bouton 2"));
		    b2.add(new JButton("Bouton 3"));

		    JPanel b3 = new JPanel();
		    //Idem pour cette ligne
		    b3.setLayout(new BorderLayout());
		    b3.add(new JButton("Bouton 4"),BorderLayout.NORTH);
		    b3.add(new JButton("Bouton 5"),BorderLayout.SOUTH);
		    b3.add(new JButton("Bouton 6"),BorderLayout.WEST);

		    JPanel b4 = new JPanel();
		    //On positionne maintenant ces trois lignes en colonne
		    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
		    b4.add(b1);
		    b4.add(b2);
		    b4.add(b3);
	    
	    
		    this.add(b4);
		    
		    */
		    
			
			
		
		
		
		
		this.setVisible(true);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}
}
