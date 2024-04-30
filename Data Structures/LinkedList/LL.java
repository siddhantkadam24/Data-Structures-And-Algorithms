
class LL
{
	private Node head;
	private Node tail;
	private int size;
	public void disp()
	{	
		
		Node current = head;
		while(current!=null)
		{
			System.out.println(current.value);
			
			current = current.next;
		}
	}
	public void insertAt(int place, int value)
	{
		
		Node current = head;
		for(int i=0;i<place-1;i++)
		{
			current=current.next;
		}
		int listlength = size-1;
		Node n = new Node(value);
		if(place<listlength)
		{
			Node temp = current.next;
			current.next = n;
			n.next =  temp;
		}
		size++;
	}
	public void addValue(int value)
	{
		Node el = new Node(value);
		if(head == null)
		{
			head = el;
		}
		else{
			el.next = head;
			head = el; 
		}
		size++;
	}
	public Node getTail()
	{	
		Node current = head;
		while(current.next!=null)
		{
			current = current.next;
		}
		tail = current;
		return tail;
	}

	public void addValueAtLast(int value)
	{
		tail = getTail();
		
		Node n = new Node(value);
		if(tail==null)
		{
			addValue(value);
		}
		else{
			tail.next = n;
			tail = n;
		}
		size++;
	}

	public void deleteAtFirst()
	{	
		if( head!=null && head.next!=null  )
			head = head.next;
		else
			head =null;
		size--;
	}

	public void deleteAtLast()
	{
		tail = getTail();
		Node current = head;
		for(int i=0;i<size-2;i++)
		{
			current = current.next;
		}
		current.next = null;
		tail = current; 
	}

	public void deleteAt(int index)
	{	
		Node current = head;
		Node previous = null;
		for(int i=0;i<index;i++)
		{
			current = current.next;
			if(i==(index-2))
			{
				previous = current;
			}
		}
		previous.next = current.next;
	}

	public int search(int find)
	{
		Node current = head;
		int count = 0;
		while(current!=null)
		{
			if(find == current.value)
				{break;}
			else	
			{
				current = current.next;
				count++;
			}
		}
		return count;
	}
	class Node
	{
		private int value;
		private Node next;
		public Node(int value)
		{
			this.value = value;
		}
	}
}
