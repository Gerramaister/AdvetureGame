
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SudokuPanel extends JPanel {

	public SudokuPanel() {
		this.setPreferredSize(new Dimension(540, 450));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
}
