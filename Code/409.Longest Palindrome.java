//409. Longest Palindrome
public class Solution {
    public int longestPalindrome(String s) {
        int[] uppermap = new int[26];
        int[] lowermap = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c - 'a' < 0)
                uppermap[s.charAt(i)-'A']++;
            else
                lowermap[s.charAt(i)-'a']++;
        }
        int maxSingle = 0;
        int totalSingle = 0;
        for(int i = 0; i < 26; i++){
            if(uppermap[i]%2!=0){
                totalSingle += uppermap[i];
                maxSingle = Math.max(maxSingle, uppermap[i]);
            }
            if(lowermap[i]%2!=0){
                totalSingle += lowermap[i];
                maxSingle = Math.max(maxSingle, lowermap[i]);
            }
        }
        return s.length()-(totalSingle-maxSingle);
    }  
}