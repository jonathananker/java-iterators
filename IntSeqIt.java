
public class IntSeqIt{

	protected IntSeq theSequence;
	protected int position;

	public IntSeqIt(IntSeq intseq){

		theSequence = intseq;
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

	public int next(){

		int element;

		if(this.hasNext()){
			element = theSequence.numbersArray[position];
			position++;
			return element;
		}
		else{
			System.err.println("Attempted to next() past final element.");
			System.exit(1);
			return 0;
		}
	}


}