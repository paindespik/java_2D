package java2d;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel{
	public int a=0;
	public void paintComponent(Graphics g) {
		a++;
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
		//Je verrais cette phrase à chaque fois que cette méthode sera invoquée
		System.out.println("Je suis exécutée une fois! a = " + a);
		
		// TODO rectangle centré : 
		
		//g.drawRect(x1, y1, x1*2, y1*2);
		
		// TODO croix sur toute la fenetre :
		
	/*	g.drawLine(0, 0, this.getWidth(), this.getHeight());
		g.drawLine(this.getWidth(), 0, 0, this.getHeight());
	*/	
		// TODO polygon : relie les points entre eux. Relie le dernier point au premier (pareil avec polyline mais ne relie pas le dernier point au premier)
	
		/*	g.setColor(Color.red);
		int x[] = {20, 30, 50, 60, 60, 50, 30, 20};
	    int y[] = {30, 20, 20, 30, 50, 60, 60, 50};
	    g.drawPolygon(x, y, 8);
	*/  
	    //TODO écrire du texte  : 
		
	/*	Font font = new Font("Courier",Font.BOLD,20);
		g.setFont(font);
		g.setColor(Color.red);
		
		g.drawString("beuleu", 10,20);
	*/	
		// TODO inserer une image avec drawImage() :
		
		try {
		      Image img = ImageIO.read(new File("Apple_black.jpg"));
		      g.drawImage(img, 0, 0, this);
		      //Pour une image de fond
		      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		
		
		
		
		
		
		
		
		
	}
	
}
