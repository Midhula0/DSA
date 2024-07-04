class Node{
    int data;
    Node next;
}
class LinkedList
{
    Node head;

    public void insert(int data)
    {
        Node node=new Node();
        node.data = data;
        node.next= null;

        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }temp.next = node;
        }
        
    }
    public void show()
    {
        Node node= head;
        while(node.next != null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }

}


public class Main{
    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.show();
    }
}