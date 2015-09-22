package Instruction;

import Computer.*;
import Computer.Computer.ProgramCounter;

public class Copy implements Instruction {

	private Data value;
	private Address address;

	public Copy(Data value, Address address) {
		this.value = value;
		this.address = address; 
	}


	@Override
	public void execute(Memory memory, ProgramCounter pc) {
		address.setWord(value.getWord());
		
	}
	public String toString() {
		
		return "CPY"+" "+ value.toString() +" "+ address.toString();
		
		
	}

}
