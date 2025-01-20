package LinkedList;

class Node4{
    int data;
    Node4 next;


    Node4(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class CreateLL4{
    Node4 head;

        public void add(int data){
                Node4 newnode = new Node4(data);
        if(head == null)
        {
            head = newnode;
        }
        else
        {
            Node4 temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void display()
    {
        Node4 temp = head;

        while(temp != null)
        {
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void reverseLL()
    {
        Node4 prev = null;
        Node4 curr = head;

        while(curr != null)
        {
            Node4 forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        head = prev;
    }
}



public class ReverseLinkedList {

    public static void main(String args[])
    {
        CreateLL4 ll1 = new CreateLL4();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        ll1.add(5);

        ll1.display();

        ll1.reverseLL();

        ll1.display();

    }

}
