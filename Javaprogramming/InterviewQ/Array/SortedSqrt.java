package InterviewQ.Array;

public class SortedSqrt {
	
	public int[] sortedSquares(int[] nums) {
        int[] sqrt = null;
       for(int i=0;i<nums.length;i++){
              sqrt[i] = nums[i]*nums[i];
       }
       
      return sqrt;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
