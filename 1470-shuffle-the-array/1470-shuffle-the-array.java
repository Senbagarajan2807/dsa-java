class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left = 0;
        int right = n;
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
           if(i%2==0){
            ans[i]=nums[left];
            left++;
           }else{
            ans[i]=nums[right];
            right++;
           }
        }
        return ans;
    }
}