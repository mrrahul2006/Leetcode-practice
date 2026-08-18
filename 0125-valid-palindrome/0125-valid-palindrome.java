class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        int rahul = 0, right = s.length() - 1;

        while (rahul < right) {
            if (s.charAt(rahul) != s.charAt(right)) {
                return false;
            }
            rahul++;
            right--;
        }
        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna