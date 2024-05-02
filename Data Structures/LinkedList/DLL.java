public class DLL {
    Node head;
    Node tail;
    int size=1;
    
    class Node{
        private Node prev;
        private Node next;
        private int data;

        Node(int data)
        {
            this.data = data;
        }
    }

   public Node getIndex(int index)
    {
        Node current = head;
        for(int i=0;i<index;i++)
        {
            current = current.next;
        }
        return current;
    }

    public void displayFromStart()
    {
        Node current = head;
        while(current!=null)
        {
            System.out.println(current.data);
            current = current.next;
        }
        
    }

    public void displayFromEnd()
    {
       Node current = tail;
        while(current!=null)
        {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    public void searchElement(int data)
    {
        Node current = head;
        int currentindex = 0;
        while(current!=null)
        {
            if(current.data == data)
            {
                System.out.println(currentindex);
                break;
            }
            else{
                current = current.next;
                currentindex++;
            }
        }
    }
    public void insertAtStart(int data)
    {
        Node n = new Node(data);    
        
        if(head==null)
            head = n;
        
        else{
            n.next = head;
            head.prev = n;
            tail = head;
            head = n;
        }
        size++;
    }

    public void insertAtEnd(int data)
    {
        Node n = new Node(data);   
        //getTail(); 
        if(tail==null)
            tail = n;
        
        else{
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }

    public void insertAtRandom(int data , int index)
    {   if(index<size)
        {
            if(index == 0)
            {
                insertAtStart(data);
            }else if(index == size-1){
                insertAtEnd(data);
            }else{
                Node n = new Node(data);
                Node current = getIndex(index);
                Node temp = current.prev;
                temp.next = n;
                n.prev = temp;
                n.next = current;
                current.prev = n;
            }
        }else{System.out.println("index is greater than size or equal");}
        size++;
    }

    public void deleteAtStart()
    {
        head = head.next;
        head.prev = null;
    }

    public void deleteAtEnd()
    {
        tail = tail.prev;
        tail.next = null;
    }

    public void deleteAt(int index)
    {
        Node current = getIndex(index);
        Node temp = current.prev;
        Node temp2 = current.next;
        temp.next = current.next;
        temp2.prev = temp;
    }

}
