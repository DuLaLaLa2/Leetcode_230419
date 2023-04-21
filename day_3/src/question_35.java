import java.util.HashMap;

public class question_35 {
    public static void main(String[] args) {

    }
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int i = (high+low)/2;
            if(nums[i] == target){
                return i;
            } else if (target < nums[i]) {
                high = i - 1;
            }else {
                low = i + 1;
            }
        }
        return low;
    }
}
