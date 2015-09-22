package Instruction;

import Computer.Computer.ProgramCounter;
import Computer.*;
import Computer.Memory;

public class Print implements Instruction {
	private Data data;
	
	public Print(Data data) {
		this.data = data;
	}

	public void execute(Memory memory, ProgramCounter pc) {
		System.out.println(data.getWord().toString());
	}

	public String toString() {
		String s = "PRT " + data.toString();
		return s;
	}
}
	