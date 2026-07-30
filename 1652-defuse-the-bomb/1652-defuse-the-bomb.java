class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) {
            return ans;
        }

        int start, end;


        if (k > 0) {
            start = 1;
            end = k;
        } else {
            start = n + k;
            end = n - 1;
            k = -k; // make window size positive
        }

        int windowSum = 0;
        for (int i = start; i <= end; i++) {
            windowSum += code[i % n];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = windowSum;

          
            windowSum -= code[start % n];

            start++;
            end++;

            windowSum += code[end % n];
        }

        return ans;
    }
}