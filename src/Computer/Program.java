package Computer;

import java.util.ArrayList;

import Instruction.Instruction;

public class Program {
	protected ArrayList<Instruction> instructionList;

	public Program() {
		instructionList = new ArrayList<Instruction>();

	}

	public void add(Instruction instruction) {
		
		instructionList.add(instruction);
		
	}
	public void remove(Instruction instruction) {
		instructionList.remove(instruction);
	}
	public String toString(){
	StringBuilder sb = new StringBuilder();
	int c = 0;
		for(Instruction i : instructionList){
			sb.append(c+" ");
			sb.append(i.toString());
			sb.append("\n");
			c++;
		}
		
	return sb.toString();
	}

}
