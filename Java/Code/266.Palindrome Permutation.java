//266. Palindrome Permutation
public class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] dict = new int[256];
        for (int i = 0; i<s.length();i++){
            dict[(int)s.charAt(i)]++;
        }
        boolean flag = false;
        for(int i =0; i < 256;i++){
            if(dict[i]%2 != 0){
                if(flag)return false;
                flag=true;
            }
        }
        return true;
    }
}