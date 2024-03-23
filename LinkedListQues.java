public class LinkedListQues {

    public static class Node {
        int data;
        LinkL.Node next;

        public Node(int data) {
            this.data = data;
            this.next =null;
        }
    }
    public static LinkL.Node head;
    public static LinkL.Node tail;
    public static int size;

    //ADD AT FIRST

    public void addFirst(int data ){
        LinkL.Node newNode = new LinkL.Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // ADD AT LAST
    public void addLast(int data){
        LinkL.Node newNode = new LinkL.Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("Linked LIst is empty");
            return;
        }
        LinkL.Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println( );
    }
    //ADD AT MIDDLE.
    public void add(int idx , int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        LinkL.Node newNode = new LinkL.Node(data);
        size++;
        LinkL.Node temp = head;
        int i = 0;

        while (i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public void deleteNthNodeFromEnd(int n){
        int sz = 0 ;
        LinkL.Node temp = head;
        while (temp != null){
            temp = temp.next;
            sz++;
        }
        if (n == sz){
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz - n;
        LinkL.Node prev = head;
        while (i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        LinkedListQues ll = new LinkedListQues();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(7);
       // ll.add(2,9);
       // ll.deleteNthNodeFromEnd(2);
        ll.add(3,7);
        ll.print();





    }
}
