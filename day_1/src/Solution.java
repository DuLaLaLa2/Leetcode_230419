import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] res = twoSum(arr,22);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }


}

