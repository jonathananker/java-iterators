
public class IntSeq	extends Seq {

	private int numbersArray[];
	private int length;


	public IntSeq(int ... numbers){
		numbersArray = numbers;
		length = numbers.length;

		return;
	}

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