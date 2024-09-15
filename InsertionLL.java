import java.util.List;

public class InsertionLL {
    public class ListNode {
        int val;
        reverseLL.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, reverseLL.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null && headB == null){
            return null;
        }
        ListNode temp1 =headA;
        ListNode temp2 =headB;
        while (temp1!=temp2){
//            temp1 = (temp1 == null) ? headB : temp1.next;
//            temp2 = (temp2 == null) ? headA : temp2.next;
        }
        return temp1;
    }

    public static void main(String[] args) {

    }
}
