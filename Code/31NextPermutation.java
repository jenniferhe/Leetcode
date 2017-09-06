//From right to left, find the first int that violate increase trend
//From it's right, find the first int that is larger than this int and swap the two.
//Reverse all digit on the right

//Quick tip: increase->swap->reverse

public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length<2) return;
        int l = nums.length;
        int p = 0;int q = 0;
        for(int i=l-1; i>0; i--){
            if(nums[i-1]<nums[i]){
                p=i-1;break;
            }    
        }
        for(int i=l-1; i>p; i--){
            if(nums[i]> nums[p]){
                q=i;break;
            }    
        }
        
        if(p==0 && q==0){
            reverse(nums, 0, l-1);
        }else{
            swap(nums,p,q);
            if(p<l-2)reverse(nums, p+1, l-1);
        }
    }
    
    private void swap(int[] nums, int p, int q){
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;
    }
    public void reverse(int[] nums, int p, int q){
        while(p<q){
            swap(nums,p,q);
            p++;q--;
        }
    }
}