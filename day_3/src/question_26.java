import java.util.HashMap;

public class question_26 {
    public static void main(String[] args) {
        int[] nums ={1,1,2,2};
        int k = removeDuplicates_official(nums);
        System.out.println(k);
    }
    public static int removeDuplicates(int[] nums) {
       int k=0;
        for (int i = 0; i < nums.length-k-1; i++) {
            int j=i+1;
            int step = 0;
            while(nums[j]==nums[i]){
                step++;
                if(j+1>=nums.length-k) {
                    break;
                }
                else {
                    j++;
                }
            }
            for (;step>0 && j<nums.length-k;j++ ) {
                nums[j-step] = nums[j];
            }
            k+=step;
        }
        return nums.length-k;
    }
    public static int removeDuplicates_official(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
}
