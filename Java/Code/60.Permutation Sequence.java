// 60. Permutation Sequence

class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int prod = 1;
        for(int i = 0; i < n; i++){
            numbers.add(i+1);
            prod *= (i+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = n; i > 1; i--){
            prod/=i;
            int pos = k/prod;
            if(k%prod != 0) pos++;
            pos = (pos==0)?numbers.size()-1:pos-1;
            sb.append(numbers.remove(pos));
            k = k%prod;
        }
        sb.append(numbers.get(0));
        return sb.toString();
    }
}