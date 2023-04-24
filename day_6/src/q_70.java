/*
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
----递归迭代-会超时
 */
public class q_70 {

    //超时
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            return climbStairs(n-1)+climbStairs(n-2);
        }
    }
    public int climbStairs2(int n) {
        int f1 = 0,f2 = 0,f3 = 1;
        for (int i = 1; i <= n; i++) {
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        return f3;

    }

}
