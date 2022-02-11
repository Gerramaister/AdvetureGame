import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SudokuGenerator {

	public SudokuPuzzle generateRandomSudoku(SudokuPuzzleType puzzleType) {
		SudokuPuzzle puzzle = new SudokuPuzzle(puzzleType.getROWS(), puzzleType.getCOLOUMS(),
				puzzleType.getBOXWIDTH(), puzzleType.getBOXHEIGHT(), puzzleType.getVALIDVALUES());
		
		
		
			Random randomGenerator = new Random();
			List<String> notUsedValidValues = new ArrayList<> (Arrays.asList(puzzle.getVALIDVALUES()));
			for (int i = 0; i < puzzle.getNumRows(); i++) {
				int randomValue = randomGenerator.nextInt(notUsedValidValues.size());
				puzzle.makeMove(i, 0, notUsedValidValues.get(randomValue));
				notUsedValidValues.remove(randomValue);
			}
			return puzzle;
	}
}
