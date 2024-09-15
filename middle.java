public class middle {
    public static class ListNode {
        int val;
        LinkL.Node next;

        public ListNode(int data) {
            this.val = data;
            this.next =null;
        }
    }
    public static LinkL.Node head;
    public static LinkL.Node tail;
    public static int size;
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count=0;
        while (temp!=null) {
            count++;
           // temp = temp.next;
        }
        count = (count/2)+1;
        int i = 0;
        while (i<count){
            //head = head.next;
        }
        return head;
    }
}
