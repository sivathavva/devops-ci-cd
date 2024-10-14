import java.util.Arrays;
import java.util.HashMap;

public class leetcode1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int reqNum = target - nums[i];
            if (hm.containsKey(reqNum) && hm.get(reqNum) != i) {
                return new int[]{i, hm.get(reqNum)};
            }

        }
        return null;
    }
}
