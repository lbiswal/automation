package InterviewQ.Array;

public class BiggestNo {

	public static void main(String[] args) {

		int numbers[] = {23,45,12,46};
		int bigNum = numbers[0];
		int smallNum = 0;
		for(int i=1;i<numbers.length;i++ ) {
			if(bigNum<numbers[i]) {
				bigNum=numbers[i];
			}
			else if(numbers[i]<bigNum) {
				smallNum =numbers[i];
			}
		}
		System.out.println(bigNum +" -" +smallNum);
		
	}

}
