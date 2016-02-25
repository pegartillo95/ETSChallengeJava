package ETS.Pruebas;

public class PalindromeAnalyzer {
	PalindromeAnalyzer(){}
	
	public long SummaryLength(String text[]){
		long l = 0;
		String completeString = "";
		String actualSubstring;
		long substringDim = 0;
		int offset=0;
		boolean notLimit = true;
		int j;

		for (int i = 0; i < text.length; i++) {
			completeString += text[i];
		}

		l = completeString.length();
		for (int k = 0; k < 2; k++) {
			for (int i = 0; i < completeString.length(); i++) {//In the first loop I work with the even palindromes and in the second one I work with the odd palindromes
				notLimit = true;
				if (k == 0) {
					substringDim = 2;
					offset = 1;
				}
				else if (k == 1) {
					substringDim = 3;
					offset = 2;
				}

				j = i;
				while ((j + offset < completeString.length()) && (completeString.charAt(j) == completeString.charAt(j + offset)) && notLimit) {
					l += substringDim;
					if ((j == 0) || (j + offset == completeString.length() - 1)) {
						notLimit = false;
					}
					else {
						j--;
						offset += 2;
						substringDim += 2;
					}
				}
			}
		}
		
		return l;
	}
}
