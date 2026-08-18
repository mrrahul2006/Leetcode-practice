class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int []arr={-1,-1};
        int a=0;
        int b=numbers.length-1;
        while(a<b){
            int sum=numbers[a]+numbers[b];
            if(sum==target){
                arr[0]=a+1;
                arr[1]=b+1;
                break;
            }
            if(sum<target){
                a++;
            }else{
                b--;
            }
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna