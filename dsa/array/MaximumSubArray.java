class Solution {
    public int maxSubArray(int[] nums) {
       int max =nums[0]; 
       int cursum=nums[0];

       for (int i=1;i < nums.length;i++) {
           cursum  = Math.max (cursum + nums[i], nums[i]);
           if(cursum > max) {
               max = cursum;
           } 
       }
       return max; 
    }
}
