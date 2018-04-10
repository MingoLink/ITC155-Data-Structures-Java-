/**
 * @author Tom Brady
 * ITC 155: Data Structures
 * Assignment 1
 * 4/5/18
 */

package testGraphics;

import java.awt.Color;
import java.awt.Graphics;

public class Assignment1 {

	public static void main(String[] args) {
		
		// draw panel and set background color
		DrawingPanel panel = new DrawingPanel(220,150);
		panel.setBackground(Color.YELLOW);
		
		//get instance of a graphics object to draw on the panel
		Graphics g = panel.getGraphics();
		
		// two blue ovals
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		// red square
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		// black line
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
		


	}

}
