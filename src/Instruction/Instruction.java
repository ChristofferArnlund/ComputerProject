package Instruction;

import Computer.*;
import Computer.Computer.ProgramCounter;

public interface Instruction{

	
	public void execute(Memory memory, ProgramCounter pc);
}
	


