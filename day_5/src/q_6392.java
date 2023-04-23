public class q_6392 {
    public int minOperations(int[] nums) {
        int cnt = 0;
        int gcd_all = 0;
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            gcd_all = gcd(gcd_all, nums[i]);
            if(nums[i]==1){
                ++cnt;
            }
        }
        if(gcd_all > 1){//整个数组最大公约数大1
            return -1;
        }else if (cnt != 0){//有显示最大公约数1
            return n-cnt;
        }else{//数组内没有1,暴力gcd
            int ans = n;
            for (int i = 0; i < n; i++) {
                int g = 0;
                for (int j = i; j < n; j++) {
                    g = gcd(g,nums[j]);
                    if(g == 1){
                        ans = Math.min(j - i + 1, ans);
                        break;
                    }
                }
            }
            return ans + n - 2;
        }
    }
    public int gcd (int a,int b) {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
