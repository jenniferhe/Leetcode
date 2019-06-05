//159. Longest Substring with At Most Two Distinct Characters
class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int res = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
            if(map.size()>2){
                res = Math.max(res, i-start);
                while(map.size()>2){
                    char tmp = s.charAt(start);
                    if(map.get(tmp)==1)
                        map.remove(tmp);
                    else
                        map.put(tmp, map.get(tmp)-1);  
                    start++;
                }
            }
        }
        return Math.max(res, s.length()-start);
    }
}