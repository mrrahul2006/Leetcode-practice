class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < n; i++) {
            ans.add(mat[0][i]);
        }
        for (int i = 1; i < m; i++) {
            ans.add(mat[i][n - 1]);
        }
        if (m > 1) {
            for (int i = n - 2; i >= 0; i--) {
                ans.add(mat[m - 1][i]);
            }
        }
        if (n > 1) {
            for (int i = m - 2; i > 0; i--) {
                ans.add(mat[i][0]);
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna