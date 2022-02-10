
public enum SudokuPuzzleType {
	
	NINEBYNINE(9, 9, 3, 3, new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"});
	
	public final int ROWS;
	public final int COLOUMS;
	public final int BOXWIDTH;
	public final int BOXHEIGHT;
	public final String[] VALIDVALUS;
	
	private SudokuPuzzleType(int ROWS, int COLOUMS, int BOXWIDTH, int BOXHEIGHT, String[] VALIDVALUS) {
		this.ROWS = ROWS;
		this.COLOUMS = COLOUMS;
		this.BOXWIDTH = BOXWIDTH;
		this.BOXHEIGHT = BOXHEIGHT;
		this.VALIDVALUS = VALIDVALUS;
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
