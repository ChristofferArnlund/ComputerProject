package Instruction;

import Computer.*;
import Computer.Computer.ProgramCounter;

public abstract class Value implements Instruction {
	protected Data value1;
	protected Data value2;
	protected Address address;
	
	protected  Value(Data value1, Data value2, Address address) {
		this.value1 = value1;
		this.value2 = value2;
		this.address = address;
	}
	
	public void execute(Memory memory, ProgramCounter pc) {
		Word a = value1.getWord();
		Word b = value2.getWord();
		Word c = op(a, b);
		address.setWord(c);
	}
	
	protected abstract Word op(Word a, Word b);
	
	

}