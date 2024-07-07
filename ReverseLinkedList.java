
class Reverse
{
   

   static Node head;
    static class Node{
    int data;
    Node next;

    Node(int data)
    { 
        this.data= data;
        this.next= null;
    }

}
    
    public Node reverse(Node node)
    {
            Node prev = null;
            Node next = null;
            Node curr = node;

            while(curr != null)
            {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            
            return prev;
    }
    public void show(Node node)
    {
        //Node node= head;

       while(node.next != null)
       {
        
        System.out.print(node.data+" ");
        node=node.next;
       }System.out.print(node.data+" ");

    }


}

public class ReverseLinkedList{
    public static void main(String args[])
    {
        Reverse rev=new Reverse();
       
        rev.head = new Reverse.Node(85);
        rev.head.next = new Reverse.Node(75);
        rev.head.next.next = new Reverse.Node(65);
        rev.head.next.next.next = new Reverse.Node(55);
       

        System.out.println("Given linked list");
        rev.show(rev.head);

        rev.head = rev.reverse(rev.head);

        System.out.println("");

        System.out.println("Reversed linked list ");
        rev.show(rev.head);
    }
}