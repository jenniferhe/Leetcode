//634. Find the Derangement of An Array


class Solution {
    public int findDerangement(int n) {
        long res = (n<2)?0:1;
        long s1 = 0;
        long s2 = 1;
        for(int i = 3; i <= n; i++){
            res = (i-1)*((s1+s2))%1000000007;
            s1 = s2;
            s2 = res;
        }
        return (int)res;
    }
}