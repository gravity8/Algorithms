public class MinSubArraySum {
    public static void main(String[] args) {
        int[] nums= {2,3,1,2,4,3};
        int target = 7;
        int l=0;
        int sum =0; int minLen = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            // Move left pointer to find the smallest subarray that satisfies the condition
            while (sum >= target) {
                minLen = Math.min(minLen, r - l + 1);
                sum -= nums[l++];
            }
        }
        System.out.println(minLen==Integer.MAX_VALUE? 0 : minLen);
    }
}
