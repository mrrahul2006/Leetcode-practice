class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int []arr1=new int[arr.length];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            if(arr[i]!=0){
                arr1[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr1[i];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna