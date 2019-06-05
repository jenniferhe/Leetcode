//340. Longest Substring with At Most K Distinct Characters
class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0; 
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
            
            if(map.size()>k){
                res = Math.max(res, i-start);
                while(map.size()>k){
                    c = s.charAt(start);
                    if(map.get(c)>1)
                        map.put(c,map.get(c)-1);
                    else
                        map.remove(c);
                    start++;
                }
            }
        }
        return Math.max(res, s.length()-start);
    }
}