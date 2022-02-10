import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SudokuFrame extends JFrame {
	
	private SudokuPanel sPanel;

	/**
	 * HeadlessException is thrown when code that is dependent on a keyboard,
	 * display, or mouse is called in an environment that does not support a
	 * keyboard, display, or mouse.
	 */
	public SudokuFrame() throws HeadlessException {

		/**
		 * This part is for the game frame.
		 */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This exits the application when frame window is closed.

		this.setTitle("Sudoku"); // Set the title of the frame to "Sudoku"

		this.setMinimumSize(new Dimension(800, 600)); // Sets the frame to start size of minimum 800x600.

		/**
		 * This is for the MenuBar.
		 */
		JMenuBar menuBar = new JMenuBar(); // Needed to create a menu bar.
		JMenu file = new JMenu("Game"); // file variable name as in the "File"-menu in software.
		JMenu newGame = new JMenu("New Game"); // Set the name of the new game option variable.

		JMenuItem sixBySixGame = new JMenuItem("6 by 6 Game"); //Sets the string name for the item variable.
		JMenuItem nineByNineGame = new JMenuItem("9 by 9 Game");
		JMenuItem twelveByTwelveGame = new JMenuItem("12 by 12 Game");

		newGame.add(sixBySixGame); //Adds the variable item to the newGame menu drop down.
		newGame.add(nineByNineGame);
		newGame.add(twelveByTwelveGame);

		this.setJMenuBar(menuBar); // Instead of using private members and this = this in constructor?
		menuBar.add(file); // Add the "Game" drop down menu to the menu bar.
		file.add(newGame); // Add the "New Game" (newGame) option in the "Game" (file) menu.
		
		
		JPanel windowPanel = new JPanel(); 
		windowPanel.setLayout(new FlowLayout()); //Creates a layout with a centred alignment and a default 5-unit horizontal and vertical gap.

		
		windowPanel.setPreferredSize(new Dimension(800, 900)); //? Gör inget?
		
		sPanel = new SudokuPanel(); //Create a object to add to our window.
		
		windowPanel.add(sPanel); //Adds the white panel created in SudokuPanel to the window. ?
		
		this.add(windowPanel); //Shows the ?

	}

	/**
	 * SwingUtilites is a collection of utility methods for Swing. As Swing is
	 * single threaded, invokeLater together with the Runnable(), assigns the thread
	 * to the eventThread that handles gui. (invokeLater should not be used for
	 * database searches as it blocks user input until done.)
	 */
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				SudokuFrame frame = new SudokuFrame();
				frame.setVisible(true);
			}
		});
	}

}
