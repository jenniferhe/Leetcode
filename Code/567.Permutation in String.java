//567. Permutation in String

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] hash = new int[256];
        for(int i = 0; i < s1.length();i++)
            hash[s1.charAt(i)]++;
        boolean finished = false;
        for(int i = 0; i <= s2.length()-s1.length(); i++){
            int[] tmp = hash.clone();
            for(int j = 0; j < s1.length(); j++){
                if(tmp[s2.charAt(i+j)]==0)break;
                if(j == s1.length()-1)finished = true;
                tmp[s2.charAt(i+j)]--;
            }
            if(finished) return true;
        }
        return false;
    }
}