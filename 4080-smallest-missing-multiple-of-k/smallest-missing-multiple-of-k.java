class Solution {
    public int missingMultiple(int[] nums, int k) {
            int m = k;

        for (int j = 1; j <= nums.length + 1; j++) {

            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == m) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                return m;
            }
            m = m + k;
        }
        return m;
    }
}