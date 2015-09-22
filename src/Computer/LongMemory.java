package Computer;

import java.awt.List;
import java.util.ArrayList;

public class LongMemory extends Memory {
	private int size;
	private ArrayList<LongWord> memoryList;

	public LongMemory(int size) {
		super(size);
		memoryList = new ArrayList<LongWord>();

	}

	public ArrayList<LongWord> getArrayList() {
		return memoryList;
	}

}
