package Computer;

public class LongWord implements Word {
private long word;

public LongWord(long word){
	this.word = word;
}

@Override
public LongWord getWord() {
	return this;
}
	
public Number getValue(){
	return word;
}

public Word add(Number l1, Number l2){
	long l3 =l1.longValue()+l2.longValue();
	return new LongWord(l3);
	
}

public Word mul(Number l1, Number l2) {
	long l3 =l1.longValue() *l2.longValue();
	return new LongWord(l3);
}

@Override
public int compareTo(Word w2) {
	if (this.getValue().longValue()==w2.getValue().longValue()){
		return 0;
	}
	else if (this.getValue().longValue()>w2.getValue().longValue()){
		return 1;
	}
	else {
		return -1;
	}
}

public String toString(){
	return Long.toString(word);
	
}

}