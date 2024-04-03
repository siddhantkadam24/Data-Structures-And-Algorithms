class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length; int n = nums2.length;
        int [] nums = new int[m+n];
        double median = 0;
        for(int i =0 ;i<m;i++)
        {
            nums[i] = nums1[i];
        }
        int c= 0;
        for(int i = m ;i<m+n;i++)
        {
            nums[i] = nums2[c++];
        }
        Arrays.sort(nums);
        if(nums.length % 2==1)
        {
            median = nums[(int)(nums.length/2)];
        }
        else
        {
            median = (double)(nums[nums.length/2]+nums[(nums.length/2)-1])/2;
        }

        return median;

    }
}