import java.util.LinkedList;

public class LInkedListTesterQueueStructure {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.offer(100);
        list.offer(200);
        list.offer(300);
        System.out.println(list);     //[100, 200, 300]
        System.out.println(list.poll());     //100
        System.out.println(list);     //[200, 300]
        System.out.println(list.peek());     //200
        System.out.println(list);     //[200, 300]
    }
}
