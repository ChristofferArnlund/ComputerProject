package Instruction;

import Computer.*;
import Computer.Computer.ProgramCounter;
public class JumpEq extends IndexSensitiveClass {
	private Data d1;
	private Data d2;
	
	private int index;

	public JumpEq (int index, Data d1, Data d2){
		this.index = index;
		this.d1 = d1;
		this.d2=d2;
		
	}
	
	public void execute(Memory m, ProgramCounter pc) {
		if(d1.getWord().compareTo(d2.getWord())==0){
			pc.setIndex(index);
			
		}
	}
	public String toString() {
		
		return "JEQ "+ index +" "+ d1.toString() +" "+ d2.toString();
		
		
	}
}
