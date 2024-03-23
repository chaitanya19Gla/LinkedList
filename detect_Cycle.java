public class detect_Cycle {
    public static class Node{
        int data ;
        Linklist.Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Linklist.Node head ;
    public static Linklist.Node tail;
    public static int size;
    public void addFirst(int data){
        Linklist.Node NewNode= new Linklist.Node(data);
        size++;
        if(head == null){
            head = tail = NewNode;
            return;
        }
        NewNode.next = head;
        head = NewNode;
    }
    public void addLast(int data){
        Linklist.Node NewNode = new Linklist.Node(data);
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
        Linklist.Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println( );
    }
    public static boolean DetectCycle(){
        Linklist.Node slow = head;
        Linklist.Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
       // detect_Cycle ll = new detect_Cycle();
        head = new Linklist.Node(1);
        head.next = new Linklist.Node(2);
        head.next.next = new Linklist.Node(1);
       // head.next.next.next = head;
        System.out.println(DetectCycle());
    }
}
