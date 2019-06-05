//125. Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int l = 0;
        int r = actual.length()-1;
        while(l<r){
            if(actual.charAt(l)!= actual.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}