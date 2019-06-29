package calculatrice;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;

public class Bouton extends JButton{
	String name;
	public Bouton(String name) {
		super(name);
		this.name=name;
		
	}
	public void paintComponent(Graphics g) {
		 Graphics2D g2d = (Graphics2D)g;
		 g2d.drawString(this.name, this.getWidth()/2, this.getHeight()/2);
	}
}
