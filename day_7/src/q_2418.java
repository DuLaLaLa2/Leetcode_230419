public class q_2418 {
    public static void main(String[] args) {
         String[] na = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
         int[] hi = {3,4,2,5,7,8,6,1};
         sortPeople(na,hi);
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        int tp;
        String tp2;
        for(int i = 0;i < heights.length-1;++i){
            for(int j = 0;j < heights.length-i-1;++j){
                if(heights[j] < heights[j+1]){
                    tp = heights[j+1];
                    tp2 = names[j+1];
                    heights[j+1] = heights[j];
                    names[j+1] = names[j];
                    heights[j] = tp;
                    names[j] = tp2;
                }
            }
        }
        return names;
    }
}
