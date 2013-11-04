
public class IntSeqIt{

	protected IntSeq theSequence;
	protected int position;

	public IntSeqIt(IntSeq intseq){

		theSequence = intseq;
		position = 0;

		return;

	}

	//uses length and position members to determine next value
	public boolean hasNext(){

		if(position < theSequence.length){
			return true;
		}
		else{
			return false;
		}
	}

	//returns current character and advance forward
	public int next(){

		int element;

		if(this.hasNext()){
			element = theSequence.numbersArray[position];
			position++;
			return element;
		}
		else{
			System.err.println("IntSeqIt called past end");
			System.exit(1);
			return 0;
		}
	}


}