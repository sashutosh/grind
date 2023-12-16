class Solution {
    public int[] productExceptSelf(int[] nums) {
        Map<Integer, List<Integer>> nmap = new HashMap<>();
        
        
            
            int[] productLeft=new int[nums.length];
            int[] productRight=new int[nums.length];
            productLeft[0] =nums[0];
            productRight[nums.length-1] = nums[nums.length-1];
            
            for(int j=1; j<nums.length;j++ ){
                productLeft[j] = productLeft[j-1]*nums[j];
                 System.out.println(productLeft[j]);
            }
            
            for(int k=nums.length-2; k>-1;k-- ){
                productRight[k] = productRight[k+1]*nums[k];
                System.out.println(productRight[k]);
            }
            
       
        
        

        int[] res = new int[nums.length];

        for(int i=0;i<nums.length;i++) {
            if(i==0){
            res[i] = productRight[i+1];
            }
            else if(i==nums.length-1) {
                res[i] = productLeft[i-1];
            }
            else{
                res[i] = productRight[i+1]* productLeft[i-1];
            }
        }

        return res;
    }
}
