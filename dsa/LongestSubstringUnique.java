/***
Trick - Sliding window technique
Solution - Iterate the String each Character at a time using while
    adding it to a new string if constraint is met.
    increment the right pointer
if constraint is not met 
    increment the left pointer till constraint is met
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        if(s.length()==0)
        return 0;
        int left =0;
        int right=1;
        int max=1;
        Set<Character> current = new HashSet<>();
        current.add(s.charAt(0)); 
        while(right < s.length()) {
            Character curChar = s.charAt(right);
            if(current.contains(curChar)) {
                if(current.size() > max) {
                    max = current.size();
                }
                current.remove(s.charAt(left));
                left++;

            }
            else {
                current.add(curChar);
                right++;
            }
        }
        if(current.size() > max) {
            max = current.size();
        }
        return max;
    }
}
