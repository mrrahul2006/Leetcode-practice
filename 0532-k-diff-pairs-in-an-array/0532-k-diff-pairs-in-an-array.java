class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                    if(Math.abs(nums[i]-nums[j])==k){
                        int a=Math.min(nums[i],nums[j]);
                        int b=Math.max(nums[i],nums[j]);
                        hs.put(a,b);
                    }
            }
        }
        return hs.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna