package StacK_and_Queue;

public class Qeueue {
    private int[] arr;  // Array to store queue elements
    private int size;   // Maximum size of the queue
    private int front;  // Index of the front element
    private int rear;   // Index of the rear element

    // Constructor
    public Qeueue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = 0;
        this.rear = 0;
    }

    // Push (enqueue) an element into the queue
    public void push(int element) {
        if (rear == size) {
            System.out.println("Queue is full! Cannot push " + element);
            return;
        }

        arr[rear] = element;
        rear++;
    }

    // Pop (dequeue) an element from the queue
    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot pop.");
            return;
        }

        arr[front] = -1; // Optional: Reset the popped element to 0 for clarity
        front++;

        // Reset front and rear when the queue becomes empty
        if (front == rear) {
            front = 0;
            rear = 0;
        }
    }

    // Get the front element of the queue
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No front element.");
            return -1;
        }
        return arr[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    // Display the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) { // Corrected loop condition
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        Qeueue myQueue = new Qeueue(5);

        myQueue.push(10);
        myQueue.push(20);
        myQueue.push(30);
        myQueue.display(); // Output: Queue: 10 20 30

        System.out.println("Front element: " + myQueue.getFront()); // Output: Front element: 10

        myQueue.pop();
        myQueue.display(); // Output: Queue: 20 30

        myQueue.push(40);
        myQueue.push(50);
        myQueue.push(60); // Output: Queue is full! Cannot push 60
        myQueue.display(); // Output: Queue: 20 30 40 50
    }
}
