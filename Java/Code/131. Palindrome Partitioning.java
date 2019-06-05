//131. Palindrome Partitioning

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> item = new ArrayList<String>();
        if(s == null || s.length()==0) return res;
        dfs(s,0,res,item);
        return res;
    }
    private void dfs(String s, int start, List<List<String>>res, List<String> item){
        if(s.length()==start){
            res.add(new ArrayList<String>(item));
            return;
        }
        for(int i = start; i< s.length(); i++){
            if(isPalindrome(s.substring(start, i+1))){
                item.add(s.substring(start, i+1));
                dfs(s,i+1,res,item);
                item.remove(item.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}