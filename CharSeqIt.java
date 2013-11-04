
public class CharSeqIt{

	protected CharSeq theSequence;

	public CharSeqIt(CharSeq charseq){
		theSequence = charseq;
		return;
	}

	public boolean hasNext(){
		return false;
	}

	public char next(){
		return 'n';
	}

}