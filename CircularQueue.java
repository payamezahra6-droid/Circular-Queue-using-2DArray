
public class CircularQueue {
    int[][] queue;
    int front;
    int rear;
    int size;
    int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity][2];
        front = -1;
        rear = -1;
        size = 0;
    }

    public void enqueue(int id, int data) {
        if (size == capacity) {
            System.out.println("Queue is full!");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % capacity;

        queue[rear][0] = id;
        queue[rear][1] = data;

        size++;

        System.out.println("Inserted: ID = " + id + ", Data = " + data);
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Removed: ID = " + queue[front][0]
                + ", Data = " + queue[front][1]);

        if (size == 1) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("ID\tData");

        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;

            System.out.println(
                    queue[index][0] + "\t" + queue[index][1]
            );
        }
    }
}
