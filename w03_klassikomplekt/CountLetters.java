//kood ei ole minu oma, kuna is ei osanud teha.
// Ainuke idee oli teha iga tähe alphabetis for loopi, mis tundus suht stupid.
// Kuigi proovisin koodi aru saada ja kirjutasin komentaare ja 
//soovin teada kas sain aru korrektselt :)


class CountLetters {

	// Driver Code
	public static void main(String[] args)
	{
		String str = "mmmm";
		getOccuringChar(str);
	}
	static final int MAX_CHAR = 256;

	static void getOccuringChar(String str)
	{
		
		// Create an array of size 256  ehk tekkitab massiivi nimega count suurusega 256 
        //ja variable len mille sees on number mis tähistab stringi pikkust
		
		int count[] = new int[MAX_CHAR];

		int len = str.length();

		// Initialize count array index ehk lisab iga stringi tähe uhekaupa massiivi count
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		// Create an array of given String size ehk tekkitab empty masiivi  "ch" nii suure kui on string
        // for loop vottab uhe i ehk täht ja  scännib s6na ule ja kontrollib kui on veel sama tähte
        // mis juhtub kui i-ks saab sama täht mis oli juba laguses? Kuidas ta ei anna double resutaati v6i veateade?
        // Ma lugesin palju aga ikkagi ei saanud aru mis charAt teeb just siin.
		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				// If any matches found
				if (str.charAt(i) == ch[j])
					find++;
			}

			if (find == 1) //prindib välja iga täht mis esineb vähemalt 1 kord
				System.out.println(
					"Number of Occurrence of "
					+ str.charAt(i)
					+ " is:" + count[str.charAt(i)]);
		}
	}


}
