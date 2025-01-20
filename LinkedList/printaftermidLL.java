package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class printaftermidLL {

    public static void main(String args[])
    {
            CreateLL Linkedlist = new CreateLL();
            Linkedlist.add(1);
            Linkedlist.add(2);
            Linkedlist.add(3);


            Linkedlist.display();

            Linkedlist.printaftermiddle();

    }

    static class CreateLL
    {
        Node head;
        public void add(int data)
        {
            Node newnode = new Node(data);
            if(head == null)
            {
                head = newnode;
            }
            else
            {
                Node temp = head;
                while(temp.next != null)
                {
                    temp = temp.next;
                }
                temp.next = newnode;
            }
        }

        public void display()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }

            System.out.print("null");
        }

        public void printaftermiddle()
        {
            if(head == null)
            {
                System.out.print("list is empty");
                return;
            }

            Node slow  = head;
            Node fast =  head;

            while(slow.next != null && fast.next != null )
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println("Nodes after the middle:");
            while(slow != null)
            {
                System.out.print(slow.data +"->");
                slow = slow.next;
            }

        }


    }
}
