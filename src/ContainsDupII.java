import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDupII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        int i=0; int j = 0;
        Set<Integer> map = new HashSet<>(nums.length);
        if(k<1){
            System.out.print(false);
        }
        if (nums.length == 2) {
            System.out.print(nums[0] == nums[1]);
        }
        while (j < nums.length) {
            if (map.contains(nums[j])) {
                System.out.print(true);
            }
            map.add(nums[j]);

            if (j - i >= k) {
                map.remove(nums[i]);
                i++;
            }

            j++;
        }
        System.out.println(false);
    }
}
