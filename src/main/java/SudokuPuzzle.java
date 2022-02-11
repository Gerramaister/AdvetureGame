
public class SudokuPuzzle {

	protected String[][] board; //Use a 2D-array to keep track of row's and coloum's.
	private final int ROWS;
	private final int COLOUMS;
	private final int BOXWIDTH;
	private final int BOXHEIGHT;
	private final String[] VALIDVALUE;

	public SudokuPuzzle(int ROWS, int COLOUMS, int BOXWIDTH, int BOXHEIGHT, String[] VALIDVALUE) {
		this.ROWS = ROWS;
		this.COLOUMS = COLOUMS;
		this.BOXWIDTH = BOXWIDTH;
		this.BOXHEIGHT = BOXHEIGHT;
		this.VALIDVALUE = VALIDVALUE;
		this.board = new String[ROWS][COLOUMS];
		initializeBoard(); // Activates the "checker" board.
	}

	public int getNumRows() {
		return ROWS;
	}

	public int getNumColoums() {
		return COLOUMS;
	}

	public int getBOXWIDTH() {
		return BOXWIDTH;
	}

	public int getBOXHEIGHT() {
		return BOXHEIGHT;
	}

	public String[] getVALIDVALUE() {
		return VALIDVALUE;
	}

	private void initializeBoard() {
		for (int row = 0; row < this.ROWS; row++) {
			for (int col = 0; col < this.COLOUMS; col++) {
				this.board[row][col] = "";
			}
		}
	}
	
	@Override
	public String toString() {
		String str = "Game Board:\n";
		for (int row = 0; row < this.ROWS; row++) {
			for (int col = 0; col < this.COLOUMS; col++) {
				str += this.board[row][col] + " ";
			}
			str += "\n";
		}
		return str + "\n";
	}
	
	void makeMove(int row, int col, String value) {
		this.board[row][col] = value;
	}
	
	public boolean numInRow(int row, String value) {
		if (row <= this.ROWS) {
			for (int col = 0; col < this.COLOUMS; col++) {
				if (this.board[row][col].equals(value)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean numInCol(int col, String value) {
		if(col <= this.COLOUMS) {
			for(int row = 0; row < this.ROWS; row++)
				if(this.board[row][col].equals(value)) {
					return true;
				}
		}
		
		return false;
	}
	
	public boolean numInBox(int row, int col, String value) {
			if (inRange(row, col)) {
				int boxRow = row / this.BOXHEIGHT;
				int boxCol = col / this.BOXWIDTH;
				int startingRow = boxRow * this.BOXHEIGHT;
				int startingCol = boxCol * this.BOXWIDTH;
				for(int r = startingRow; r <= (startingRow + this.BOXHEIGHT) - 1; r++) {
					for(int c = startingCol; c <= (startingCol + this.BOXWIDTH) -1; c++) {
						if(this.board[r][c].equals(value)) {
							return true;
						}
					}
				}
			}
			
			return false;
	}

	private boolean inRange(int row, int col) {
		return row <= this.ROWS && col <= this.COLOUMS && row >= 0 && col >= 0;
	}
}
