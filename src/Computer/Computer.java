package Computer;

import Instruction.Instruction;


public class Computer {
	protected Memory memory;
	private ProgramCounter pc;
	private Program f; 
	public Computer(Memory memory){
		this.memory=memory;
		pc = new ProgramCounter();
	}
	public void load(Program program){
		
		f = new Factorial();
		
	}
	
	public void run(){
		while(pc.getCounter()>=0){
			int count = pc.getCounter();
			Instruction i = f.instructionList.get(count);
			pc.incrementCounter();
			i.execute(memory, pc);
			
			
		}
		
	}

	public class ProgramCounter {
		
		private int counter;
		
		private ProgramCounter() {
			counter = 0;
		}
		private void incrementCounter() {
			counter++;
		}
		public void setIndex(int i){
			counter = i;
		}
		public int getCounter(){
			return counter;
		}
	}
	
}
