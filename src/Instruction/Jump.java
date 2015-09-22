package Instruction;

import Computer.*;
import Computer.Computer.ProgramCounter;
public class Jump extends IndexSensitiveClass {
	
	private int index;

	public Jump(int index){
		this.index = index;
		
	}
	
	public void execute(Memory m, ProgramCounter pc) {
			pc.setIndex(index);
			
	}
	public String toString() {
		
		return "JMP "+index;
		
		
	}
}
