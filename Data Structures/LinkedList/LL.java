
class LL
{
	private Node head;	//starting point of the list
	private Node tail;	//ending point of the list
	private int size;	//length of the list
	
	public void disp()	//method for displaying the linked list
	{	
		
		Node current = head; /*here we have assumed that we have a head already initialized, we have taken current variable of type node as it will help in iterating among the other nodes.
		
		so the basic idea of the loop is that execute this loop till current becomes null.here current will become null when current.next has no address further thus becoming null.*/
		while(current!=null)	//loop till current becomes null
		{
			System.out.println(current.value);//print the values
			
			current = current.next; //update the current node to next node.
		}
	}
	public void insertAt(int place, int value) //function to insert elemeent at the desired position.
	{
		
		Node current = head; //current variable of node type 
		for(int i=0;i<place-1;i++) //we are finding the node before the said index by the user as it will be crucial because we also have to update the previousnode.next address.
		{
			current=current.next;
		}
		int listlength = size-1;
		Node n = new Node(value);//new node
		if(place<listlength) //if index is smaller than equals to list length
		{
			Node temp = current.next; //we have stored previousnode.next value in temp
			current.next = n;//then updated the previousnode.next to the new nodeaddress
			n.next =  temp;/*update the new node.next with the node which was after the previousnode*/
		}
		size++; //updates the size
	}
	public void addValue(int value) //adding at inital position
	{
		Node el = new Node(value); //new node
		if(head == null)
		{
			head = el;
		}
		else{	//here when adding new node it will automatically become the new head, to do that we put head in the new node.next and update the head to new node.
			el.next = head;
			head = el; 
		}
		size++;
	}
	public Node getTail() // getting tail with iteration
	{	
		Node current = head;
		while(current.next!=null)
		{
			current = current.next;
		}
		tail = current;
		return tail;
	}

	public void addValueAtLast(int value)//addvalue at last
	{
		tail = getTail();//got the tail node
		
		Node n = new Node(value);//new node
		if(tail==null)
		{
			addValue(value);
		}
		else{ //here update the former tail.next to the new node and then make the new node the tail of the list
			tail.next = n;
			tail = n;
		}
		size++;
	}

	public void deleteAtFirst()//delete element at first of the list
	{	
		if( head!=null && head.next!=null  )//we make the initial head.next value the new the head of the list
			head = head.next;
		
		size--;
	}

	public void deleteAtLast()//delete element at last of list
	{
		tail = getTail(); //we got the tail node
		Node current = head;
		for(int i=0;i<size-2;i++)//we iterated till the second last element as to update its next value and also to make it the new tail of the list
		{
			current = current.next;
		}
		current.next = null;
		tail = current; 
	}

	public void deleteAt(int index) //deletes at desired position
	{	
		Node current = head; 
		Node previous = null; //as we know in single ll we dont have the previous address we iterate to find the previous node before the desired postion as to update its next address
		for(int i=0;i<index;i++)//we iterated to find the previous node and the same time in the end we got the current node which has the address of the next node which is needed for previous node
		{
			current = current.next;
			if(i==(index-2))
			{
				previous = current;
			}
		}
		previous.next = current.next;// weupdated here
	}

	public int search(int find)
	{
		Node current = head; //as we have to go from the start of the list
		int count = 0;
		while(current!=null)// iteration till last null
		{
			if(find == current.value) // if value matches break the loop
				{break;}
			else	
			{
				current = current.next; // iterate and update current value
				count++;
			}
		}
		return count;
	}
	class Node //created node having value and next which is basically address of another node
	{
		private int value;
		private Node next;
		public Node(int value) // will initalize the value when creating object of node
		{
			this.value = value;
		}
	}
}
