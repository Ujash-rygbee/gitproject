package sem3;

public class queue {
	
	public int array[];
	private int capacity;
	private String op="dequeue";
	public int head=0;
	public int tail=0;
			
		queue(int x)
		{
			this.capacity=x;
			array=new int[capacity];
			
		}
		
		public boolean isEmpty()
		{
			return op.equalsIgnoreCase("dequeue") && head==tail;
			
			
		}
		
	
		public void enqueue(int x)
		{
			
			
			if(tail==capacity)
				tail=0;
			
			if(op.equals("dequeue"))
			{
				array[tail++]=x;
			}
				
			
			else if(op.equals("enqueue"))
			{
				if(head!=tail)
					array[tail++]=x;
				
				else
					System.out.println("overflow");
				
			}
			
			op="enqueue";
			
		}
		
		
		public int dequeue()
		{
			
			int x=0;
			if(head==capacity && (!(this.isEmpty())))
				head=0;
			
			
			
			
			if(op.equals("enqueue"))
				head+=1;
			
			else if(op.equals("dequeue") && (!(this.isEmpty())))
			{
				if(head==tail)
					System.out.println("empty");
				
				else
					x=array[head];
					head+=1;
				
			}
			
			
			
			op="dequeue";
			return x;
		}
		
	    
		public void show()
		{
			if(head<tail)
			{
				for(int i=head;i<tail;i++)
					System.out.print(array[i]);
				
				
			}
			
			if(head>tail)
			{
				for(int i=head;i<capacity;i++)
					System.out.print(array[i]);
				
				for(int i=0;i<tail;i++)
					System.out.print(array[i]);
				
			}
			System.out.println();
			
		}
		
		public void reverse(int a,int b)
		{
			int actualhead=head;
			queue q1=new queue(this.capacity);
			while(this.head!=a)
			{
				head+=1;
			}
			while(this.head!=b)
			{
				q1.enqueue(this.dequeue());
				
			}
			q1.enqueue(this.dequeue());
			
			int x=this.head;
			this.head=this.tail;
			this.tail=x;
			
			
		}
		
		  
		  
	  }
	  
	
	
	
	
	


