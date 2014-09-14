package sem3;

public class QueueNode 
{

	private Node head;
	private Node tail;
	
	public QueueNode()
	{
		head=null;
		tail=null;
		
	}
	
	public void enqueue(int x)
	{
		Node newnode=new Node(x);
		if(head==tail)
		{
			if(head==null)
			{
				head=newnode;
				tail=newnode;
			}
			
			else
			 tail.setNext(newnode);
			
		}
		
		tail=newnode;
		System.out.println("Enqueued is "+tail.getData());
		
	}
	
	
	public int dequeue()
	{
		Node foo=new Node(0);
		if(!(this.isEmpty()))
		{	
	     foo=new Node(head.getData());
		 head=head.getNext();
		 System.out.println("Dequeued is "+foo.getData());
		}
		else
			System.out.println("empty");
		return foo.getData();
	}
	
	
	
	public boolean isEmpty()
	{
		
		return head==null;
		
	}
	
	
	
	
	
}
