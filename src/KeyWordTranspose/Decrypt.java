package KeyWordTranspose;

public class Decrypt {
	
	
	private static String cipher_ex1 = "FKYVYSTDDBYQYLPUHFVGFTPUHGFFKYJPLENFYVJYUFYVUYIFSYYAFPEVPFYHFFKYVYHFVTJFTPUHPUYUVPDDLYUFHTUJPLENFYVHJTYUJYJPNVHYHTUFKYRGDDFKYJPLENFYVJYUFYVSTDDBYJDPHYQQNVTUCFKYEVPFYHFHGUQJNVVYUFJPLENFYVHJTYUJYHFNQYUFHFPDQFPVNUFKYTVEVPCVGLHGFJPLENFYVHGFPFKYVDPUCTHDGUQHJKPPDH";
	private static String cipher_post = "FJYHPKKYRHYKYRFHYVYKPRQYISFIFPRNAVPPUDQCCAYJYCOQRFJYRYDTQYCOJPMIYFJQINYSVTPVFJYTQVIFFQKYQRFJYESIFIFMOYRFIJSWYPTFYRKQIAYJQWYOQRSVPDONRPQINTSIJQPRPMFIQOYQFQIJPEYOFJSFFJYQROPPVIYFFQRBDQCCAVQRBPMFFJYAYIFQRFJQINYSVIBVSOMSFQRBHCSIIFJYVYDQCCAYRPOYCQWYVQYIPTOPKQRPIEQXXSSCCPDYOQRIQOY";
	
	// second keyword length === 4
	private static String cipher_final = "QCKJWCCXZCIBKKWBNJIKEILDTNSXTXOKEFOKTZLNACOOEBMJIRFASFASSFSSYHLTJVASYWKYYBFFWOVJQEIYOFFLEVPSAFNBNJIBNOLDGFXYIOCDOKLXNGASSFSJYCWTTJILEZIHEFXYCNOPIZOYQFIPSFXYKJYFKIWBTZAKNWQVKBUPELCBFCOAWWSVDCSYGNCTZCSRFTTKQNQJATLVEBGBFCKGEILVNLLSXFXPQLFXTVOSJEEJALICNJOKTKNYATQDEZ";
	
	public static void main(String[] args) {

		//FirstCodeword.parse(cipher_ex1);
		//FirstCodeword.parse(cipher_post);
		//FirstCodeword.parse(cipher_final);
		for(int i=4; i< 7; ++i){
			System.out.println("Second keyword length: "+i+", I.C. : "+ SecondCodeword.calculatePrintIOC(cipher_final, i) );
		}
		
		//SecondCodeword.printAlphabetFreqs(cipher_final, 4);
		int[] bestOffsets = SecondCodeword.alignAlphabets(cipher_final, 4);
		SecondCodeword.printAlignedAlphabets(cipher_final, 4, bestOffsets);
	}

}