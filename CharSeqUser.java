
public class CharSeqUser{

	protected CharSeq theSequence;

	public CharSeqUser(CharSeq charseq){
		theSequence = charseq;
		return;
	}


	public static int posMax1(CharSeq s){

		CharSeqIt itr = new CharSeqIt(s);
		char max;
		char temp;
		int position = 0;

		if(itr.hasNext()){
			max = itr.next();
		}
		else{
			return -1;
		}
		while(itr.hasNext()){
			temp = itr.next();
			if(max < temp){
				max = temp;
				position = itr.position -1;
			}
		}


		return position;
	}


}