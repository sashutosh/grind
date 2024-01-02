
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return subsets(0,nums);
    }

    public List<List<Integer>> subsets(int index, int[] array) {
         //The base case for an empty set return a List with Empty list
	 if(index > array.length-1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }

        int element = array[index];
        List<List<Integer>> combinations = subsets(index + 1, array);
	
	//The trick - Keep the original combinations intact
        List<List<Integer>> result= new ArrayList<>(combinations);
	
	//Add the current element in the remaining combinations
        for(List<Integer> comb:combinations){
            List<Integer> currentComb = new ArrayList<>(comb);
            currentComb.add(element);
            result.add(currentComb);
        }
        return result;
        
    }
}
