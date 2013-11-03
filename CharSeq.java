
public class CharSeq extends Seq{

	String theString;


	public CharSeq(String v){
		theString = v;
		return;
	}


	public String toString(){

		String completeString = "{";

		completeString += theString.length();
		completeString += ": \"";
		completeString += theString;
		completeString += "\"}";


		return completeString;
	}


}