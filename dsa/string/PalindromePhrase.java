/**
Trick - Using the regex to replace special characters
Solution - Two pointer approach to compare characters
 */
class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(result);
        for(int i=0;i<result.length()/2;i++) {
            if(result.charAt(i) != result.charAt(result.length()-1-i)) return false;

        }
        return true;
    }
}
