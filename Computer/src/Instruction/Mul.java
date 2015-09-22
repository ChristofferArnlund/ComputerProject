package Instruction;

import Computer.*;
import Computer.Computer.ProgramCounter;



public class Mul extends Value {

	public Mul(Data value1, Data value2, Address address) {
		super(value1, value2, address);

	}

	public void execute(Memory memory, ProgramCounter pc) {
		super.execute(memory, pc);
	}


	@Override
	protected Word op(Word a, Word b) {
		Word product = a.mul(a.getValue(), b.getValue());
		return product;
		
	}
	public String toString() {
		
		return "MUL "+ value1.toString() +" "+ value2.toString() +" "+ address.toString();
		
		
	}

}
