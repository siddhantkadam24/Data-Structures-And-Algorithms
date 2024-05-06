public class DLL {//tuygyuy
    Node head;
    Node tail;
    int size=1;
    
    class Node{ //Node will have 3 properties in dll prev - which holds previous node's address, next - next node's address.
        private Node prev;
        private Node next;
        private int data;

        Node(int data) // initializing value
        {
            this.data = data;
        }
    }

   public Node getIndex(int index)//used in deleting or inserting an element when we need the to get that current node which is indicated by index, if we say i need 4th index we can get throug this method
    {
        Node current = head;
        for(int i=0;i<index;i++)//iterating from head .
        {
            current = current.next;
        }
        return current;
    }

    public void displayFromStart()//it will display from start of the ll
    {
        Node current = head;
        while(current!=null)
        {
            System.out.println(current.data);
            current = current.next;//updating the current node address to next
        }
        
    }

    public void displayFromEnd()//display from end of ll
    {
       Node current = tail;
        while(current!=null)
        {
            System.out.println(current.data);
            current = current.prev;//updating the current node address to previous
        }
    }

    public void searchElement(int data)//searching for the value if it exists or not
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
    public void insertAtStart(int data)//inserting at the start of the ll
    {
        Node n = new Node(data);    
        
        if(head==null)
            head = n;
        
        else{
            n.next = head; // as we inserted at start the former head.prev will have new node's address and new node's address will have old head's address.
            head.prev = n;
            tail = head;//updating the tail and head address.
            head = n;
        }
        size++;
    }

    public void insertAtEnd(int data)//inserting at the end of  ll
    {
        Node n = new Node(data);    
        if(tail==null)
            tail = n;
        
        else{
            tail.next = n;//when adding at end, the former tail.next will have new node's address and new node's prev will have the former tail's address
            n.prev = tail;
            tail = n;//assigning the new node as tail
        }
        size++;
    }

    public void insertAtRandom(int data , int index)//insert at any index
    {   if(index<size)//if index size metnioned is smaller than total length of ll then only do the follwing operation
        {
            if(index == 0)
            {
                insertAtStart(data);
            }else if(index == size-1){
                insertAtEnd(data);
            }else{
                Node n = new Node(data);
                Node current = getIndex(index);// we got the index address.
                Node temp = current.prev;// for dll, when adding new node at a particular index, the former node at that index will be replaced by new node 
                temp.next = n;//we put the former node's address in temp var, then change the temp.next to new node's address then new node's.next has the address of former index and vice-versa. the new node's.prev has the temp's address. 
                n.prev = temp;
                n.next = current;
                current.prev = n;
            }
        }else{System.out.println("index is greater than size or equal");}
        size++;
    }

    public void deleteAtStart()//deleting starting element
    {
        head = head.next;
        head.prev = null;
    }

    public void deleteAtEnd()//deleting last element
    {
        tail = tail.prev;
        tail.next = null;
    }

    public void deleteAt(int index)//delete at any index
    {
        Node current = getIndex(index); //getting mentioned index node
        Node temp = current.prev; //as it is dll we have to change teh index-1's node next and index+1's node, we will be connecting them inshort and also used temp variables for stroing the current index's prev and next address.
        Node temp2 = current.next;
        temp.next = current.next;
        temp2.prev = temp;
    }

}
