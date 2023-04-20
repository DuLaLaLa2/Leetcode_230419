import org.junit.Test;

import java.util.HashMap;

public class test {
    @Test
    public void demo(){
        int[] arr = {2,7,11,15};
        HashMap<Integer, Integer> hash = new HashMap<>();
        if (hash.containsKey(arr[1]))
            System.out.println(hash.get(arr[3]));
    }
}
