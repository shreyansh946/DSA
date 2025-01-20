package LinkedList;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class CreateLL1 {
    Node1 head;

    // Method to add a new node to the linked list
    public void add(int data) {
        Node1 newnode = new Node1(data);
        if (head == null) {
            head = newnode;
        } else {
            Node1 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // Method to create a cycle at a specific position
    public void createCycle(int pos) {
        if (head == null) return;

        Node1 temp = head;
        Node1 cycleStartNode = null;
        int index = 0;

        // Find the node at the given position
        while (temp.next != null) {
            if (index == pos) {
                cycleStartNode = temp;
            }
            temp = temp.next;
            index++;
        }

        // Create the cycle by linking the last node to the node at 'pos'
        if (cycleStartNode != null) {
            temp.next = cycleStartNode;
        }
    }

    // Method to detect cycle in the linked list using Floyd's cycle detection
    public boolean DC() {
        Node1 slow = head;
        Node1 fast = head;


        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by 1
            fast = fast.next.next; // Move fast pointer by 2

            // If slow and fast meet, cycle is detected
            if (slow == fast) {
                return true;
            }
        }
        return false; // No cycle detected
    }
}




public class DetectCycleINLL {

    public static void main(String args[]) {
        CreateLL1 newnode = new CreateLL1();
        newnode.add(3);
        newnode.add(2);
        newnode.add(0);
        newnode.add(-4);

        // Create a cycle at position 1 (node with value 2)
        newnode.createCycle(1);

        // Display the linked list
        System.out.println("Linked List:");
        newnode.display();

        // Detect cycle
        if (newnode.DC()) {
            System.out.println("\nCycle detected in the linked list.");
        } else {
            System.out.println("\nNo cycle detected in the linked list.");
        }
    }
}
