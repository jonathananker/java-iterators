
public class IntSeq	extends Seq {

	protected int numbersArray[];
	protected int length;



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


	public int posMax(){

		int position = -1;
		int temp;

		if(length == 0){
			return position;
		}

		temp = numbersArray[0];
		position = 0;

		for(int i = 0; i < length; i++){

			if(numbersArray[i] > temp){
				temp = numbersArray[i];
				position = i;
			}

		}

		return position;
	}

}