public class minus{

	public static IntSeq minus (IntSeq int1, IntSeq int2) {
		int array[], pos = 0, isIn;
		for (int i = 0; i < int1.length; i++) {
			isIn = 0;
			for (int j = 0; i < int2.length; i++) {
				if (int1.numbers[i] == int1.numbers[j])
					isIn = 1;
			}			
			if (isIn == 0) {
				array[pos] = int1.numbers[i];
				pos++;
			}
			
				
		}
		intSeq iS = new intSeq(array);
		return iS;
		
		
	}
	public static CharSeq minus (CharSeq char1, CharSeq char2) {
		int array[], pos = 0, isIn;
		for (int i = 0; i < char1.length; i++) {
			isIn = 0;
			for (int j = 0; i < char2.length; i++) {
				if (char1.charAt[i] == char2.charAt[j])
					isIn = 1;
			}			
			if (isIn == 0) {
				array[pos] = char1.charAt[i];
				pos++;
			}
			
				
		}
		charSeq cS = new charSeq(array);
		return cS;
		
		
	}
	
	
	public static CharSeq minus (IntSeq, CharSeq)
	public static CharSeq minus (CharSeq, IntSeq)
