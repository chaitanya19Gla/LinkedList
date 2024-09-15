
  public class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        while (temp!=null){
            if (temp.val>temp.next.val){
                temp.next = null;
            }
            else {
                temp=temp.next;
            }

        }
        return head;

    }

    public static void main(String[] args) {
        ListNode s = new ListNode();
        Solution s= new Solution();
        s.removeNodes()
    }
}