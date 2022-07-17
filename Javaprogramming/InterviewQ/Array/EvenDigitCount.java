package InterviewQ.Array;

public class EvenDigitCount {
	
public static int findNumbers(int [] nums) {
	
	int noOEvenDigit =0;
	for(int i=0;i<nums.length;i++) {
		int digit=nums[i];
		int digitCount =0;
		while(digit !=0) {
			digitCount++;
			digit = digit/10;
		}
		if(digitCount%2 == 0) {
			noOEvenDigit = noOEvenDigit + 1;
		}
		
	}
	return noOEvenDigit;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = {55,91,82};
int l = findNumbers(number);
System.out.println(l);
	}

}
