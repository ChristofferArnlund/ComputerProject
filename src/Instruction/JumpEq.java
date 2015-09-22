package Instruction;

import Computer.*;
import Computer.Computer.ProgramCounter;
public class JumpEq extends IndexSensitiveClass {
	private Data data1;
	private Data data2;
	
	private int index;

	public JumpEq (int index, Data data1, Data data2){
		this.index = index;
		this.data1 = data1;
		this.data2=data2;
		
	}
	
	public void execute(Memory m, ProgramCounter pc) {
		if(data1.getWord().compareTo(data2.getWord())==0){
			pc.setIndex(index);
			
		}
	}
	public String toString() {
		
		return "JEQ "+ index +" "+ data1.toString() +" "+ data2.toString();
		
		
	}
}
