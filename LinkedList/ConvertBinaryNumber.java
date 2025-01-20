package LinkedList;

class Node2{

     int data;
     Node2 next;

     Node2(int data)
     {
         this.data = data;
         this.next = null;
     }
}
class create2{
    Node2 head;

    public void add(int data)
    {
        Node2 newnode = new Node2(data);
        if(head == null)
        {
            head = newnode;
        }
        else
        {
            Node2 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void display() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void Binarynumber()
    {
        Node2 temp = head;
        int ans =0;
        while(temp != null)
        {
            ans = (ans<<1) + temp.data;
            temp = temp.next;
        }

        System.out.print(ans);

    }



}

public class ConvertBinaryNumber {

    public static void main(String args[])
    {
        create2 newnode = new create2();
        newnode.add(1);
        newnode.add(0);
        newnode.add(1);

        newnode.display();

        newnode.Binarynumber();

    }
}
