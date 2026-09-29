class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        Arrays.sort(nums);
        int a=0;
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            if(nums[a]==i){
                a++;
            }else{
                ls.add(i);
            }
        }
        return ls;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna