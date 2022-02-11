
public class SudokuPuzzle {

	protected String[][] board;
	private final int ROWS;
	private final int COLUMNS;
	private final int BOXWIDTH;
	private final int BOXHEIGHT;
	private final String[] VALIDVALUES;
	
	public SudokuPuzzle(int rows, int columns, int boxwidth, int boxheight, String[] validvalues) {
		this.ROWS = rows;
		this.COLUMNS = columns;
		this.BOXWIDTH = boxwidth;
		this.BOXHEIGHT = boxheight;
		this.VALIDVALUES = validvalues;
		this.board = new String[ROWS][COLUMNS];
		initializeBoard();
	}
	
	public int getNumRows() {
		return ROWS;
	}
	
	public int getNumColumns() {
		return COLUMNS;
	}
	
	public int getBOXWIDTH() {
		return BOXWIDTH;
	}
	
	public int getBOXHEIGHT() {
		return BOXHEIGHT;
		
	}
	
	public String[] getVALIDVALUES() {
		return VALIDVALUES;
	}
	
	@Override
	public String toString() {
		String str = "Gameboard\n";
		for(int row = 0; row < this.ROWS; row++) {
			for(int col = 0; col < this.COLUMNS; col++) {
				str += this.board[row][col] + " ";
			}
			str += "\n";
		}
		return str + "\n";
	}
	private void initializeBoard() {
		for(int row = 0; row < this.ROWS; row++) {
			for(int col = 0; col < this.COLUMNS; col++) {
				this.board[row][col] = "";
			}
		}
	}
}

