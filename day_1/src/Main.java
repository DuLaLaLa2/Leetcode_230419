// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] res = twoSum(arr,9);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        boolean flag = true;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for(int j = i;j< nums.length;j++){
                if(target == nums[i]+nums[j]){
                    result[0] = nums[i];
                    result[1] = nums[j];
                    flag = false;
                }
            }
            if(!flag){
                break;
            }
        }

        return result;
    }
}