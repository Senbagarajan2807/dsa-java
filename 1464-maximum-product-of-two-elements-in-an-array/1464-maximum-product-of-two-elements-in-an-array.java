class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length-1;
        int prod = 1;
        int maxProd = Integer.MIN_VALUE;
        for(int i = nums.length-2; i>=0;i--){
            prod = (nums[i]-1)*(nums[j]-1);
            maxProd = Math.max(prod,maxProd);
        }
        return maxProd;
    }
}