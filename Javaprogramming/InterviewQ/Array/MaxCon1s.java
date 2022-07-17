package InterviewQ.Array;

public class MaxCon1s {
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int count =0, maxOnes=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 1) {
				count++;
			}
			if(maxOnes <count) {
				maxOnes = count;
			}else if(nums[i] == 0) {
				count =0;
			}
		}
		return maxOnes;
	}

	public static void main(String[] args) {
		int[] nums =  {1,1,0,1,1,1};
		int l = findMaxConsecutiveOnes(nums);
		System.out.println(l);
	}

}
