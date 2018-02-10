//384. Shuffle an Array

class Solution {
    private int[] res;
    private Random rdm = new Random();
    public Solution(int[] nums) {
        res = new int[nums.length];
        for(int i = 0; i< nums.length;i++){
            res[i]=nums[i];
        }
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return res;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] newRes = new int[res.length];
        //boolean[] used = new boolean[res.length];
        int count = 0;
        while(count < res.length){
            int num = rdm.nextInt(res.length);
            if(newRes[num]==0 ){
                newRes[num]=res[count];
                count++;
            }
        }
        return newRes;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */