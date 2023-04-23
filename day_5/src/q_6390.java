public class q_6390 {
    public static void main(String[] args) {
        int[] nums={1,-1,-3,-2,3};
        int k = 3;
        int x = 2;
        int[] result = getSubarrayBeauty(nums,k,x);
        for (int j : result) {
            System.out.println(j);
        }
    }
    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        // 排序数组
        int[] heap = new int[101];
        int[] arr = new int[n - k + 1];
        for (int i = 0; i < n; ++i) {
            ++heap[nums[i] + 50];
            if (i >= k - 1) {
                // 获取 heap 中第 x 小的数
                int xth = smallXth(heap, x);
                arr[i - k + 1] = Math.min(xth, 0);
                --heap[nums[i - k + 1] + 50];
            }
        }
        return arr;
    }
    private static int smallXth(int[] cnt, int x) {
        int sum = 0;
        for (int i = 0; i < cnt.length; ++i) {
            sum += cnt[i];
            if (sum < x) continue;
            return i - 50;
        }
        return 0;
    }
}
