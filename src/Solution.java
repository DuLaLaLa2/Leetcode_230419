import static java.util.Arrays.parallelPrefix;
import static java.util.Arrays.sort;

//1043_分隔数组以得到最大和
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int sum = 0;
        int t = 0;
        int i,j;

        //排序
        for (int m = 0; m < arr.length - 1; m++){
            for (int n = 0; n < arr.length - m - 1; n++){
                int tp = 0;
                if (arr[n] > arr[n + 1]){
                    tp = arr[n];
                    arr[n] = arr[n + 1];
                    arr[n + 1] = tp;
                }
            }
        }

        //取出arr[]中最大的k的个数，存于temp[]中
        int[] temp = new int[k];
        for(i = arr.length-1,j = 0; i >= arr.length-k && j < k;i--,j++){
            temp[j] = arr[i];
        }

        //装配得到解释数组
        for(i = 0 ; i < k;i++){
            for(j=0;j < k && j+k*t < arr.length;j++){
                arr[j+k*t] = temp[i];
            }
            t++;
        }
        for (int value : arr) {
            System.out.println("arr:" + value);
            sum+=value;
        }
        return sum;
    }
}