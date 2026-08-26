class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while(i < nums1.length && j < nums2.length){

            if(i > 0 && nums1[i] == nums1[i-1]){
                i++;
                continue;
            }

            if(j > 0 && nums2[j] == nums2[j-1]){
                j++;
                continue;
            }

            if(nums1[i] == nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        int[] res = new int[ans.size()];

        for(int k = 0; k < ans.size(); k++){
            res[k] = ans.get(k);
        }

        return res;
    }
}