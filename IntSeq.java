
public class IntSeq	extends Seq {

	private int numbersArray[];
	private int length;



	// constructor
	// @params numbers array
	public IntSeq(int ... numbers){
		numbersArray = numbers;
		length = numbers.length;

		return;
	}

	// print method
	public String toString(){
		String completeText = "[";

		completeText += Integer.toString(length);
		completeText += ":";

		for(int i = 0; i < length; i++){
			completeText += " " + numbersArray[i];
		}

		completeText += "]";

		return completeText;
	}


}