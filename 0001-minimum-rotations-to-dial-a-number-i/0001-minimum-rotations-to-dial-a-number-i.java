class Solution {
    public int minRotations(String s) {
        int c=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            int t=ch-'0';
            int d=Math.abs(t-c);
            ans+=Math.min(d,10-d);
            c=t;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna