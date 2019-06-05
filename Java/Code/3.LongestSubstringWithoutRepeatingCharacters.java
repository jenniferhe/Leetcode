public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] pos = new int[256];
        int res = 0;
        int start = 0;
        for(int i = 0; i < s.length();i++){
            if(pos[s.charAt(i)]==0){
                pos[s.charAt(i)] = i+1;
            }else{
                if((i-start) > res)res = i-start;
                start = Math.max(pos[s.charAt(i)],start);
                pos[s.charAt(i)] = i+1;
            }
        }
        res = Math.max(res, s.length()-start);
        return res;
    }
}