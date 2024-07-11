public class ContainsNearbyAlmostDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,5};
        int indexDiff = 3;
        int valueDiff=0;
        int i=0; int j=i+1;

        if(nums.length==2){
            System.out.println(nums[i]!=nums[j]&&Math.abs(i - j) <= indexDiff&&Math.abs(nums[i] - nums[j]) <= valueDiff);
        }
        while(j<nums.length){
            if(i!=j && Math.abs(nums[i] - nums[j]) <= valueDiff){
                System.out.print(true);
            }
            if(Math.abs(i-j)>=indexDiff){
                i++;
            }
            j++;
        }
        System.out.print(false);
    }
}
