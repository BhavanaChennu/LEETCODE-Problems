class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0 , right = nums.length-1;
        int sum = 0 , max = 0;
        while(left < right){
            sum = nums[left] + nums[right];
            max = Math.max(max, sum);
            left++ ; right--;
        }
        return max;
    }
}