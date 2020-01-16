import java.util.LinkedList;
import java.util.Queue;

public class TestQueueException {

    public static void main(String[] args) throws IllegalStateException  {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(753434);
        queue.add(435343);
        queue.add(2147483647);

        try{
            queue.add(10);
        }
        catch(Exception e){
            System.out.println("Exception: " + e);
        }

        System.out.println("Queue: " + queue);
    }
}
