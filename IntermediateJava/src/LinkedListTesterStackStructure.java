import java.util.LinkedList;

public class LinkedListTesterStackStructure {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.push(100);
        list.push(200);
        list.push(300);
        System.out.println(list);     //[300, 200, 100]
        System.out.println(list.pop());     //300
        System.out.println(list);     //[200, 100]
        System.out.println(list.peek());     //200
        System.out.println(list);     //[200, 100]

    }
}