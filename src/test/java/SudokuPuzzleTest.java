import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;

public class SudokuPuzzleTest {
	
	private SudokuPuzzle puzzle;

	@BeforeAll
	public void setUp() {
		String [][] board = new String [][] {
			{"0","0","8","3","4","2","9","0","0"},
			{"0","0","9","0","0","0","7","0","0"},
			{"4","0","0","0","0","0","0","0","0"},
			{"0","0","6","4","7","3","2","0","3"},
			{"0","3","0","0","0","0","0","1","0"},
			{"0","0","2","8","5","1","6","0","0"},
			{"7","0","0","0","0","0","0","0","8"},
			{"0","0","4","0","0","0","1","0","0"},
			{"0","0","3","6","9","7","5","0","0"}
		};
		
		puzzle = new SudokuPuzzleForTesting(board);
	}	
	
	@Test
	public void testNumInRow() {
		assertTrue(puzzle.numInRow(0, "9"));
		assertTrue(puzzle.numInRow(1, "7"));
		assertFalse(puzzle.numInRow(8, "1"));
	}
	
	@Test
	public void testNumInCol() {
		assertTrue(puzzle.numInCol(0, "4"));
		assertTrue(puzzle.numInCol(5, "2"));
		assertFalse(puzzle.numInCol(8, "1"));
	}
	
	@Test
	public void testNumInBox() {
		assertTrue(puzzle.numInBox(6, 1, "4"));
		assertFalse(puzzle.numInBox(4, 4, "2"));
		assertTrue(puzzle.numInBox(4, 4, "8"));
	}
	
		private class SudokuPuzzleForTesting extends SudokuPuzzle {
			public SudokuPuzzleForTesting(String[][] board) {
				super(9, 9, 3, 3, new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"});
				this.board = board;
			}
		}
	
}
