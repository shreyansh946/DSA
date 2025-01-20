package LinkedList;

import java.util.LinkedList;

class Node5 {
    int data;
    Node5 next;

    Node5(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NextGreaterINLL {

    Node5 head;

    public void add(int data) {
        Node5 newNode = new Node5(data);
        if (head == null) {
            head = newNode;
        } else {
            Node5 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node5 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

   public void nextlargestNode()
    {

    }

}

class NextLL {

    public static void main(String[] args) {
        NextGreaterINLL ll = new NextGreaterINLL();

        ll.add(2);
        ll.add(1);
        ll.add(5);

        ll.display();
        ll.nextlargestNode();

    }
}
