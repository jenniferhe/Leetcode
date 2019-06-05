### Test

```
public class Solution {
    public int searchInsert(int[] nums, int target) {return helper(nums, 0, nums.length, target);}
    private int helper(int[] nums, int left, int right, int target){
        if(right - left == 1){
            return (nums[left]>=target)?left:right;
        }else{
            int mid =(left+right)/2;int o = nums[mid];
            if(o==target){
                return mid;
            }else if(o > target){
                return helper(nums,left,mid,target);
            }else{  
                return helper(nums,mid,right,target);
            }
        }
    }
}
```

完成

