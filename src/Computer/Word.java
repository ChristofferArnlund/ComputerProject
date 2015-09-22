package Computer;

public interface Word extends Data {

	public Word getWord();
	
	public Word add(Number n1, Number n2);
	
	public Word mul(Number n1, Number n2);

	public Number getValue();

	public int compareTo(Word w1);
	
	public String toString();

}
