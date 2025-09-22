class Solution {
    int maxProduct(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int prod = 1;

        // Left to Right
        for (int i = 0; i < n; i++) {
            prod *= arr[i];
            max = Math.max(max, prod);
            if (prod == 0) prod = 1;
        }

        prod = 1;
        // Right to Left
        for (int i = n - 1; i >= 0; i--) {
            prod *= arr[i];
            max = Math.max(max, prod);
            if (prod == 0) prod = 1;
        }

        return max;
    }
}

