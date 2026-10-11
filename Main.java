
public class Main {
    public static void main(String[] args) {

        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(1, 10);
        cq.enqueue(2, 20);
        cq.enqueue(3, 30);
        cq.enqueue(4, 40);

        System.out.println("\nOriginal Queue:");
        cq.display();

        System.out.println("\nAfter Dequeue:");
        cq.dequeue();
        cq.dequeue();

        System.out.println("\nAfter Insertion:");
        cq.enqueue(5, 50);
        cq.enqueue(6, 60);

        System.out.println("\nFinal Queue:");
        cq.display();
    }
}
