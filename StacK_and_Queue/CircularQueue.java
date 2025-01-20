package StacK_and_Queue;

public class CircularQueue {
    private int[] arr;  // Array to store queue elements
    private int size;   // Maximum size of the queue
    private int front;  // Index of the front element
    private int rear;   // Index of the rear element

    // Constructor
    public CircularQueue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    // Push (enqueue) an element into the queue
    public void push(int element) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot push " + element);
            return;
        }

        if (front == -1) {
            front = 0;  // Initialize front if the queue is empty
        }

        // Update rear and insert element
        rear = (rear + 1) == size ? 0 : rear + 1;  // Circular behavior without modulus
        arr[rear] = element;
    }

    // Pop (dequeue) an element from the queue
    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot pop.");
            return;
        }

        arr[front] = 0;

        // If there is only one element left, reset the queue
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // Update front index in a circular way
            front = (front + 1) == size ? 0 : front + 1;
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
        return front == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return (rear + 1 == front);
    }

    // Display the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Queue: ");
        int i = front;
        while (i != rear) {
            System.out.print(arr[i] + " ");
            i = (i + 1) == size ? 0 : i + 1; // Circular behavior without modulus
        }
        System.out.println(arr[rear]); // Print the last element
    }

    // Main method for testing
    public static void main(String[] args) {
        CircularQueue myQueue = new CircularQueue(5);

        // Test 1: Add elements to the queue
        myQueue.push(10);
        myQueue.push(20);
        myQueue.push(30);
        myQueue.display(); // Output: Queue: 10 20 30

        // Test 2: Get front element
        System.out.println("Front element: " + myQueue.getFront()); // Output: Front element: 10

        // Test 3: Pop elements and test the circular nature
        myQueue.pop();
        myQueue.display(); // Output: Queue: 20 30

        // Add more elements to test circular behavior
        myQueue.push(40);
        myQueue.push(50);
        myQueue.push(60); // Queue is full message
        myQueue.display(); // Output: Queue: 20 30 40 50

        // Pop and push elements to test wraparound behavior
        myQueue.pop();
        myQueue.push(70);
        myQueue.display(); // Output: Queue: 30 40 50 70

        // Test with only one element left
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
        myQueue.display(); // Output: Queue: 70
        System.out.println("Front element: " + myQueue.getFront()); // Output: Front element: 70
    }
}
