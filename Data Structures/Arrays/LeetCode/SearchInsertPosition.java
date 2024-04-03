class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i = 0; i < nums.length ; i++)
        {
            if(target == nums[i])
            {
                index = i;
                break;
            }
            if(target < nums[i])
            {
                index = i;
                break;
                
            }if(target > nums[i])
            {
                index = i+1;
                
            }
        }
        return index;
    }
}