package Computer;

public class Address  implements Data{
	
	private int index;
	private Word w;

	public Address(int index) {
		this.index = index;
		
	}
	
	public Word getWord() {
		return w;
	}
	
	public void setWord(Word w1) {
	w= w1 ;
	}
	public String toString(){
		String s = "["+index+"]";
		return s;
	}
	
}
