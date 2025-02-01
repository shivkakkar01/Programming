class Solution {
    public int[] runningSum(int[] nums) {
        int [] ans = new int[nums.length];
        int sum=0;
        for (int i=0; i< nums.length; i++)
        {
            ans[i] = nums[i] + sum;
            sum= sum + nums[i];
        }
        return ans;
    }
}
