class Solution {
    public int firstMissingPositive(int[] nums) {
        java.util.Arrays.sort(nums);
        int missing = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == missing) {
                missing++;
            }
        }

        return missing;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna