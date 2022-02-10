import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class SudokuPanel extends JPanel {

	public SudokuPanel() {
		this.setPreferredSize(new Dimension(540, 450)); // Sets the size of the white Sudoku panel background.
	}

	@Override // From JPanel get the method paintComponent.
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); //
		Graphics2D g2d = (Graphics2D) g; // define an object from the class Graphics2D.
		g2d.setColor(new Color(1.0f, 1.0f, 1.0f)); // Here you set the background to white. ?

		g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); // ?

		g2d.setColor(new Color(0.0f, 0.0f, 0.0f)); // Sets the colour of the strokes.

		int slotWidth = this.getWidth() / 9; // Distance between the lines/strokes.
		int slotHeight = this.getHeight() / 9;

		for (int x = 0; x <= getWidth(); x += slotWidth) { // checks if x is greater then the width of the panel. if
															// not, add one slot width....
			if ((x / slotWidth) % 3 == 0) {
				g2d.setStroke(new BasicStroke(2));
				g2d.drawLine(x, 0, x, this.getHeight());
			} else {
				g2d.setStroke(new BasicStroke(1)); // sets the stroke type for the drawLine function below.
				g2d.drawLine(x, 0, x, this.getHeight()); // Draws a line, using the current color, between the points.
			}
		}
		
		 // Same as for the vertical lines.
		for ( int y = 0; y <= getHeight(); y += slotHeight) {
			if ((y / slotWidth) % 3 == 0) {
				g2d.setStroke(new BasicStroke(2));
				g2d.drawLine(0,  y, this.getWidth(), y);
			}
			else {
				g2d.setStroke(new BasicStroke(1));
				g2d.drawLine(0,  y,  this.getWidth(), y);
			}
		}
		
	}
}
