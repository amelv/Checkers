import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class BoardGraphics extends JPanel {
	private BufferedImage image;
	
	public BoardGraphics () {
		try {
            image = ImageIO.read(new File("resources/board.png"));
        } catch (IOException ex) {
            System.out.print("can't find pic");
        }
	}
	public void paint(Graphics g){
		super.paintComponent(g);
		//g.setColor(Color.green);
		//g.fillOval(laneX, height, radius, radius);
		g.drawImage(image, 0, 0, null);
		g.setColor(Color.WHITE);
	}
}
