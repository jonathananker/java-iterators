
public class CharSeqIt{

	protected CharSeq theSequence;
	protected int position;

	public CharSeqIt(CharSeq charseq){
		theSequence = charseq;
		position = 0;

		return;
	}

	public boolean hasNext(){

		if(position < theSequence.length){
			return true;
		}
		else{
			return false;
		}
	}

	public char next(){

		char element;

		if(this.hasNext()){
			element = theSequence.theString.charAt(position);
			position++;
			return element;
		}
		else{
			System.err.println("Attempted to next() past final element.");
			System.exit(1);
			return 'n';
		}
	}



}