class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximum = 0;
        for (int kid : candies) {
            maximum = Math.max(maximum, kid);
        }
        
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; ++i) {
            res.add(candies[i] + extraCandies >= maximum);
        }
        return res;
    }
}