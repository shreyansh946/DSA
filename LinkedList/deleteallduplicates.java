package LinkedList;

class Node3{

    int data;
    Node3 next;

    Node3(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class create3{
    Node3 head;
    public void add(int data)
    {
        Node3 newnode = new Node3(data);
        if(head == null)
        {
            head = newnode;
        }
        else
        {
            Node3 temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void display()
    {
        Node3 temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void duplicate()
    {
        Node3 curr = head;

        while((curr != null) && (curr.next != null) ) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }

}


public class deleteallduplicates {

    public static void main(String args[]) {
        create3 newnode = new create3();
        newnode.add(1);
        newnode.add(1);
        newnode.add(2);
        newnode.add(3);
        newnode.add(3);
        newnode.display();

        newnode.duplicate();
        newnode.display();
    }


}
