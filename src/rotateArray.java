public class rotateArray {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;  // Handle cases where k is greater than the length of the array

            // Step 1: Reverse the entire array
            reverse(nums, 0, n - 1);

            // Step 2: Reverse the first k elements
            reverse(nums, 0, k - 1);

            // Step 3: Reverse the remaining n - k elements
            reverse(nums, k, n - 1);
        }

    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
