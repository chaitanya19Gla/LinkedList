import java.util.LinkedList;
public class LinkedListJCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);

    }
}
