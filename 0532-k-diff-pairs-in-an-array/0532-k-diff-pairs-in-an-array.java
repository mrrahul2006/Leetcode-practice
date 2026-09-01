class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        HashMap<Integer,Integer> hss=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int element =nums[i]+k;
            int el=nums[i]-k;
            if(hs.containsKey(element)){
                hss.put(nums[i],element);
            }
            if(hs.containsKey(el)){
                hss.put(el,nums[i]);
            }
            hs.put(nums[i],i);

        }
        return hss.size();
       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna