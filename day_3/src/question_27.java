public class question_27 {
    public static void main(String[] args) {
        int[] nums ={3,2,2,3};
        int i = removeElement(nums, 3);
        System.out.println(i);

    }
    public static int removeElement(int[] nums, int val) {
        int slow;
        if (nums.length!=0 && nums[0]!=val){
            slow = 1;
        }
        else {
            slow = 0;
        }
        for (int fast = 1; fast < nums.length; fast++) {
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
