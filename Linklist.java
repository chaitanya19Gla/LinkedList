import com.sun.source.tree.NewArrayTree;

public class Linklist {
    public static class Node{
        int data ;
        Node next;

//        public Node(int data) {
//            this.data = data;
//        }
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head ;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node NewNode= new Node(data);
         size++;
        if(head == null){
            head = tail = NewNode;
            return;
        }
        NewNode.next = head;
        head = NewNode;
    }
    public void addLast(int data){
        Node NewNode = new Node(data);
        size++;
        if(head == null){
            head = tail = NewNode;
            return;
        }
        tail.next = NewNode;
        tail = NewNode;
    }
    public void print(){
        if(head == null){
            System.out.println("Linked LIst is empty");
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println( );
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        head = prev;
    }
    public static Node FindMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static boolean CheckPlaindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node mideNode = FindMid(head);
        Node prev = null;
        Node curr = mideNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev ;
             prev = curr;
             curr = next;

        }
        Node right = prev;
        Node left = head;

        while (right != null){
            if (left.data != right.data){
                return false;
            }
            left  = left.next;
            right = right.next;

        }
        return true;

    }
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;

    }

    public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.addFirst(5);
        ll.addFirst(9);
        ll.addFirst(10);
        ll.addFirst(28);
        //ll.reverse();
        ll.print();
        ll.removeFirst();
        ll.print();



    }
}
