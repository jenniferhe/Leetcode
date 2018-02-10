//479. Largest Palindrome Product

class Solution {
    public int largestPalindrome(int n) {
        if(n==0) return 0;
        if(n==1) return 9;
        long start = (long)Math.pow((Math.pow(10,n)-1),2) / (long)Math.pow(10,n)-1;
        long end = (long)Math.pow(10,n-1);
        for(long i = start; i > end; i--){
            String s = new StringBuilder(Long.toString(i)).reverse().toString();
            long formedPali = Long.parseLong(Long.toString(i) + s);
            if(canBeDivide(formedPali,n))  return (int)(formedPali%1337);
        }        
        return -1%1337;
    }
    
    private boolean canBeDivide(long n, int size){
        long div = (long)Math.pow(10,size)-1;
        while(n/div < div){
            if(n%div==0) return true;
            div--;
        }
        return false;
    }   
}