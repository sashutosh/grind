/*
Summary - Insert first String into Map of type Char->Count
Lookup second String into Map character by character
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> strMap = new HashMap<>();
        for(int i=0 ;i<s.length(); i++) {
            if(strMap.containsKey(s.charAt(i))) {
                int curCount = strMap.get(s.charAt(i));
                strMap.put(s.charAt(i), curCount+1);
            }
            else{
                strMap.put(s.charAt(i), 1);
            }
        }
        for(int i=0 ;i<t.length(); i++) {
            if(!strMap.containsKey(t.charAt(i))) {
                return false;
            }
            int curCount = strMap.get(t.charAt(i));
            curCount= curCount-1;
            if(curCount==0) {
                strMap.remove(t.charAt(i));
            }
            else strMap.put(t.charAt(i), curCount);

        }
        return true;

    }
}
