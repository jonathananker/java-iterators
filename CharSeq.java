
public class CharSeq extends Seq{

	protected String theString;
	protected int length;

	//constructor
	//@params String v used internally
	public CharSeq(String v){
		theString = v;
		length = theString.length();
		return;
	}


	// print method
	public String toString(){

		String completeString = "{";

		completeString += length;
		completeString += ": \"";
		completeString += theString;
		completeString += "\"}";

		return completeString;
	}


	//compares characters using the integer > operators
	public int posMax(){

		int position = -1;
		char temp;

		if(length == 0){
			return position;
		}

		temp = theString.charAt(0);
		position = 0;

		for(int i = 0; i < length; i++){

			if(theString.charAt(i) > temp){
				temp = theString.charAt(i);
				position = i;
			}

		}

		return position;
	}




}