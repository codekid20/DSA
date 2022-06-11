package Stack_and_Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);

        queue.insert(4);
        queue.insert(65);
        queue.insert(75);
        queue.insert(89);
        queue.insert(44);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(155);
        queue.display();

    }
}
