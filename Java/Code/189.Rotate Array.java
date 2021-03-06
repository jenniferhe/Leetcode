//189. Rotate Array
//Rotate an array of n elements to the right by k steps.
//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].


public class Solution {
    public void rotate(int[] nums, int k) {
        int digit = nums.length - k%nums.length;
        reverse(nums,0,digit);
        reverse(nums,digit,nums.length);
        reverse(nums,0,nums.length);
    }
    private void reverse(int[] nums, int start, int end){
        for(int i = 0; i < (end-start)/2;i++){
            int tmp = nums[i+start];
            nums[i+start] = nums[end-i-1];
            nums[end-i-1] = tmp;
        }
    }
}