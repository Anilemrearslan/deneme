package Practice;

public class ejwrtj {
    public int sum67(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length ; i++){

            if(nums[i]==6) {
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[k] == 7) {
                        i = k;
                        break;
                    }
                }
            } else if(nums[i]==6) {
                sum = sum + nums[i];
            } else {
                sum = sum + nums[i];
            }
        }
        return sum;
    }
}
