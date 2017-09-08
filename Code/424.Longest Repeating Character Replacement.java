//424. Longest Repeating Character Replacement
class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int maxCount = 0;
        int start = 0;  
        int res = 0;
           for(int i = 0; i < s.length();i++){
               map[s.charAt(i)-'A']++;
               maxCount = Math.max(maxCount, map[s.charAt(i)-'A']);
               while(i+1-start-maxCount > k){
                   map[s.charAt(start)-'A']--;
                   start++;
               }
               res = Math.max(res, i-start+1);
           }
        return res;
    }
}