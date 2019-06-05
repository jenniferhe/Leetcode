//47. Permutations II


class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<Integer>(), nums, new boolean[nums.length]);
        return res;
    }
    
    private void helper(List<List<Integer>> res, ArrayList<Integer> tmp, int[] nums, boolean[] visited){
        if(tmp.size() == nums.length){
            res.add(new ArrayList<Integer>(tmp));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(visited[i]==true||(i>0 && nums[i]==nums[i-1] && visited[i-1]==false))continue;
                tmp.add(nums[i]);
                visited[i] = true;
                helper(res, tmp, nums, visited);
                tmp.remove(tmp.size()-1);
                visited[i] = false;
            }
        }
    }
}