package Instruction;

import Computer.*;
import Computer.Computer.ProgramCounter;

public class Add extends Value {
	
	public Add(Data value1, Data value2, Address address) {
		super(value1, value2, address);
	}
	public void execute(Memory memory, ProgramCounter pc){
		super.execute(memory,pc);
		
	}
	
	public String toString() {
		
		return "ADD "+ value1.toString() +" "+ value2.toString() +" "+ address.toString();
		
		
	}
	
	protected Word op(Word a, Word b) {
		 Word added = a.add(a.getValue(), b.getValue());
		 return added;
		 
		
	}


	
}
