public class q_69 {
    public static void main(String[] args) {

    }
    public static int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        double C = x;
        double cur_x = x;
        double minimum = 1e-7;
        while(true){
            double next_x = (cur_x+C/cur_x)/2;
            if(cur_x-next_x < minimum)
                break;
            cur_x = next_x;
        }
        return (int) cur_x;
    }

}
