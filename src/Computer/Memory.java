package Computer;

import java.util.ArrayList;

public abstract class Memory{

	protected int size;
	protected ArrayList<? extends Word> memoryList;
	
	public Memory(int size){
		this.size = size;
		
	}
	public ArrayList<? extends Word> getArrayList(){
		return memoryList;
	}
	
}
