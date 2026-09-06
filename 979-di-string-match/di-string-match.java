class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] nums = new int[n+1];
        int left = 0 , right = s.length();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                nums[i] = left;
                left++;
            }
            else if(s.charAt(i) == 'D'){
                nums[i] = right;
                right--;
            }
        }
        nums[n] = left;
        return nums;
    }
}
