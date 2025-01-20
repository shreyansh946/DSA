package StacK_and_Queue;

public class Deque {
    private int[] arr;  // Array to store deque elements
    private int size;   // Maximum size of the deque
    private int front;  // Index of the front element
    private int rear;   // Index of the rear element
    private int count;  // Current number of elements in the deque

    // Constructor
    public Deque(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = -1;  // Indicates that deque is empty
        this.rear = -1;   // Indicates that deque is empty
        this.count = 0;   // No elements in the deque
    }

    // Add an element at the front
    public void addFront(int element) {
        if (isFull()) {
            System.out.println("Deque is full! Cannot add to the front.");
            return;
        }

        if (front == -1) {  // Deque is empty, first element is added
            front = 0;
            rear = 0;
        } else if (front == 0) {  // Move front to the last index if it is 0
            front = size - 1;
        } else {  // Move front to the previous index
            front = front - 1;
        }

        arr[front] = element;
        count++;
    }

    // Add an element at the rear
    public void addRear(int element) {
        if (isFull()) {
            System.out.println("Deque is full! Cannot add to the rear.");
            return;
        }

        if (rear == -1) {  // Deque is empty, first element is added
            front = 0;
            rear = 0;
        } else if (rear == size - 1) {  // Move rear to the first index if it is at the last index
            rear = 0;
        } else {  // Move rear to the next index
            rear = rear + 1;
        }

        arr[rear] = element;
        count++;
    }

    // Remove an element from the front
    public void removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot remove from the front.");
            return;
        }

        arr[front] = 0;  // Optional: Reset the removed element (for visualization)

        if (front == rear) {  // Only one element left, reset both pointers
            front = -1;
            rear = -1;
        } else if (front == size - 1) {  // If front was at the last index, reset to 0
            front = 0;
        } else {  // Move front to the next index
            front = front + 1;
        }

        count--;
    }

    // Remove an element from the rear
    public void removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot remove from the rear.");
            return;
        }

        arr[rear] = 0;  // Optional: Reset the removed element (for visualization)

        if (front == rear) {  // Only one element left, reset both pointers
            front = -1;
            rear = -1;
        } else if (rear == 0) {  // If rear was at the first index, reset to the last index
            rear = size - 1;
        } else {  // Move rear to the previous index
            rear = rear - 1;
        }

        count--;
    }

    // Get the front element
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty! No front element.");
            return -1;
        }
        return arr[front];
    }

    // Get the rear element
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty! No rear element.");
            return -1;
        }
        return arr[rear];
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Check if the deque is full
    public boolean isFull() {
        return count == size;
    }

    // Display the elements of the deque
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }

        System.out.print("Deque: ");
        int i = front;
        while (i != rear) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % size;  // Wrap around if necessary
        }
        System.out.println(arr[rear]);  // Print the last element
    }

    // Main method for testing
    public static void main(String[] args) {
        Deque myDeque = new Deque(5);

        // Test 1: Add elements to the front and rear
        myDeque.addFront(10);
        myDeque.addRear(20);
        myDeque.addFront(5);
        myDeque.addRear(25);
        myDeque.display(); // Output: Deque: 5 10 20 25

        // Test 2: Remove elements from the front and rear
        myDeque.removeFront();
        myDeque.removeRear();
        myDeque.display(); // Output: Deque: 10 20

        // Test 3: Add elements again
        myDeque.addFront(15);
        myDeque.addRear(30);
        myDeque.display(); // Output: Deque: 15 10 20 30

        // Test 4: Full deque
        myDeque.addFront(40); // Deque is full
        myDeque.display(); // Output: Deque: 15 10 20 30
    }
}
