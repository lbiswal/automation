package InterviewQ.Array;

public class CharOcurrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "aanhtnhtnaka";
		frequency(word);

	}

	private static void frequency(String word) {
		
		while(word.length()>0) {
			char ch =word.charAt(0);
			System.out.println(ch+"-"+countChar(word,ch));
			word = word.replace(""+ch, "");
		}
	}

	private static int countChar(String word, char ch) {
		int count =0;
		while(word.indexOf(ch) != -1) {
			count++;
			word = word.substring(word.indexOf(ch)+1);
		}
		
		return count;
	}

}
