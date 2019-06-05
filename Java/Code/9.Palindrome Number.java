//9. Palindrome Number

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        if(x<10)return true;
        int div = 1;
        while(x/div>=10) div*=10;
        while(x>0){
            if(x/div != x%10) return false;
            x = (x%div)/10;
            div/=100;
        }
        return true;
    }
}