public class test_1 {
    public static void main(String[] args) {

//        int i = sumOfMultiples(40);
//        System.out.println(i);
        int[] r = new int[4];
        int[] num = {1,-1,-3,-2,3};
        r = getSubarrayBeauty(num,3,2);
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
    }
    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] res = new int[nums.length-k+1];
        int[] tp = new int[k];
        for (int i = 0; i < nums.length-k+1; i++) {
            for(int e=0;e<k;e++){
                tp[e] = nums[e+i];
            }
            //遍历子数组
            for (int j = i; j < k+i; j++) {
                int val = sort(tp,x);
                if(val<0){
                    res[i] = val;
                }else {
                    res[i] = 0;
                }
            }
        }
        return res;
    }
    public static int sort(int[] arr,int x){
        for(int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[x-1];
    }




    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime)%24;
    }
    public static int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            if(i%3==0||i%5==0||i%7==0){
                sum += i;
            }
        }
        return sum;
    }
}
