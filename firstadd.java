public class firstadd {

    public static class NODE{
        int data;
        NODE next;

        public NODE(int data) {

        }

        public void Node(int data , NODE next ){
            this.data = data;
            this.next = null ;
        }
    }
    public static NODE head;
    public static NODE tail;

    public void addFirst(int data){
        NODE newNode = new NODE(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

       // NODE newNode = new NODE(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        NODE newNode = new NODE(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        NODE temp = head;
        while (temp != null) {
            //System.out.println(temp.data);
        }
    }
    public static void main (String[] args) {
        firstadd ll = new firstadd();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);




    }
}
