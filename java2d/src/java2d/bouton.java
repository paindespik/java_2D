package java2d;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.Enum;
import javax.swing.JButton;

	
public class bouton extends JButton implements MouseListener{
	
	private int couleur=0;
	private String name;
	public bouton(String str){
		super(str);
		this.name= str;
		this.addMouseListener(this);
	}
	
	
	
	
	
	public Color Couleur(int couleur) {
		
		
		if(couleur==1)
				return Color.YELLOW;
		else if (couleur==2)
				return Color.ORANGE;
		else
				return Color.blue;
		}
			
		
	
	public void paintComponent(Graphics g) {
		
		
		  Graphics2D g2d = (Graphics2D)g;
		    GradientPaint gp = new GradientPaint(0, 0, Couleur(couleur), 0, 20, Couleur(couleur), true);
		    g2d.setPaint(gp);
		    g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		    g2d.setColor(Color.white);
		    g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth()/ 2 /4), (this.getHeight() / 2) + 5);
		         
	}
	
	public void mouseClicked(MouseEvent event) {
		
	}
	public void mouseEntered(MouseEvent event) {
		couleur=1;
		
		
	}
	public void mouseExited(MouseEvent event) {
		couleur=0;
	}
	public void mouseReleased(MouseEvent event) {
		if(event.getX()>0 && event.getX()<this.getWidth() && event.getY()>0 && event.getY()<this.getHeight())
			couleur=1;
		else 
			couleur=0; 
	}





	public void mousePressed(MouseEvent arg0) {
		
		couleur=2;
	}
	
}
