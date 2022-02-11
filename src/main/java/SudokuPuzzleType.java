
public enum SudokuPuzzleType {
	
	NINEBYNINE(9, 9, 3, 3, new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}); //Sets the enum's.
	
	private final int ROWS;
	private final int COLOUMS;
	private final int BOXWIDTH;
	private final int BOXHEIGHT;
	private final String[] VALIDVALUS;
	
	private SudokuPuzzleType(int ROWS, int COLOUMS, int BOXWIDTH, int BOXHEIGHT, String[] VALIDVALUS) { //Constructor for the enums.
		this.ROWS = ROWS;
		this.COLOUMS = COLOUMS;
		this.BOXWIDTH = BOXWIDTH;
		this.BOXHEIGHT = BOXHEIGHT;
		this.VALIDVALUS = VALIDVALUS; //String array of numbers as an enum.
	}

	public int getROWS() {
		return ROWS;
	}

	public int getCOLOUMS() {
		return COLOUMS;
	}

	public int getBOXWIDTH() {
		return BOXWIDTH;
	}

	public int getBOXHEIGHT() {
		return BOXHEIGHT;
	}

	public String[] getVALIDVALUS() {
		return VALIDVALUS;
	}
}
