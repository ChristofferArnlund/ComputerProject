package Instruction;

import Computer.Computer.ProgramCounter;
import Computer.Memory;

public class Halt implements Instruction {

	
	public Halt() {
	}
	
	public void execute(Memory memory, ProgramCounter pc) {
		pc.setIndex(-1);
	}
	
	public String toString() {
		String s = "HLT";
		return s;
	}
}
