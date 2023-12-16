class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> elements = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            elements.put(nums[i],i);
        }
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++) {
            result[0] =i;
            int val = target-nums[i];
            
            if(elements.containsKey(val)){
                if(i == elements.get(val)){
                    continue;
                }
                result[1]= elements.get(val);
                break;
            }
        }
        return result;
        
    }
}
