package InterviewQ.Array;

public class StringSplitAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaa bbb ccccdeeef";
		String [] arrayOfstr = input.split(" ");
		for(int i=0;i<arrayOfstr.length;i++) {
			System.out.println(arrayOfstr[i]);
		}
	}

}
