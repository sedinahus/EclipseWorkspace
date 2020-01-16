public class TestQueue {
    public static void main(String[] args) {
        java.util.Queue<String> queue = new java.util.LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");
        queue.add("Bahama");



        while (queue.size() > 0)
            System.out.print(queue.remove() + " ");
    }
}

