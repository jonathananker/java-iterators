
public class CharSeq extends Seq{

	String theString;

	//constructor
	//@params String v used internally
	public CharSeq(String v){
		theString = v;
		return;
	}


	// print method
	public String toString(){

		String completeString = "{";

		completeString += theString.length();
		completeString += ": \"";
		completeString += theString;
		completeString += "\"}";


		return completeString;
	}


}