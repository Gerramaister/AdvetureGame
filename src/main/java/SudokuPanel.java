import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class SudokuPanel extends JPanel {
	
	private static SudokuPuzzle puzzle;

	public SudokuPanel() {
		this.setPreferredSize(new Dimension(540, 450)); // Sets the size of the white Sudoku panel background.
		this.puzzle = SudokuGenerator.generateRandomSudoku(SudokuPuzzleType.NINEBYNINE);
		System.out.println(this.puzzle);
	}

	@Override // From JPanel get the method paintComponent.
	protected void paintComponent(Graphics g) { //takes Graphics g as input into method.
		super.paintComponent(g); //Activates the paintComponent function inside JPanel and give it the Graphics variable "g".
		Graphics2D g2d = (Graphics2D) g; // define an object from the class Graphics2D that is needed to draw 2D-shapes.
		
		g2d.setColor(new Color(1.0f, 1.0f, 1.0f)); // Here you set the colour to fill with to white. ?

		g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); //Fill the rectangle with the colour above from 0 to the width and height.

		g2d.setColor(new Color(0.0f, 0.0f, 0.0f)); // Sets the colour of the strokes.

		int slotWidth = this.getWidth() / 9; // Distance between the lines/strokes.
		int slotHeight = this.getHeight() / 9;

		/**
		 * Checks if x is greater or equal to the width of the panel.
		 * If not, do stuff and increase with slot width.
		 */
		for (int x = 0; x <= getWidth(); x += slotWidth) {
			if ((x / slotWidth) % 3 == 0) { // Use the stroke type below on every third slot line.
				g2d.setStroke(new BasicStroke(2)); // Sets the stroke type for the drawLine function below.
				g2d.drawLine(x, 0, x, this.getHeight()); // Draws a line, using the current colour, between the points.
			} else {
				g2d.setStroke(new BasicStroke(1));
				g2d.drawLine(x, 0, x, this.getHeight()); 
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
