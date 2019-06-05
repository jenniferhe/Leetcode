//46. Permutations

public List<List<Integer>> permute(int[] nums) {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<Integer>(), nums);
        return res;
    }
    private void helper(List<List<Integer>> res, List<Integer> tmp, int[] nums){
        if(tmp.size() == nums.length){
          res.add(new ArrayList<Integer>(tmp));
        }else{
          for(int i = 0; i < nums.length; i++){
            if(tmp.contains(nums[i])) continue;
            tmp.add(nums[i]);
            helper(res, tmp, nums);
            tmp.remove(tmp.size()-1);
          }
        }
    }
}