//187. Repeated DNA Sequences
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        if(s == null || s.length() < 10) return res;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < s.length()-9;i++){
            String tmp = s.substring(i,i+10);
            int tmpCount = (map.containsKey(tmp))?map.get(tmp)+1:1;
            map.put(tmp, tmpCount);
        }
        for(String ss : map.keySet()){
            if(map.get(ss)>1)res.add(ss);
        }
        return res;
    }
}