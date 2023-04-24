import java.util.HashMap;

public class q_83 {
    public static ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ListNode check = head;
        ListNode tp = head;
        while (check!=null){
            if(!hashMap.containsKey(check.val)){
                hashMap.put(check.val,check.val);
                check = check.next;
            }
        }
        for (Integer val:hashMap.values()) {
            tp.val = val;
            tp = tp.next;
        }
        return head;
    }
    public static ListNode deleteDuplicates2(ListNode head) {
        ListNode cur = head;
        while (cur!=null && cur.next!=null){
            if(cur.val==cur.next.val){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return head;
    }
}
