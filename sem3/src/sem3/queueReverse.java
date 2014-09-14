package sem3;

public class queueReverse
{

	public queue q1;
	public queue q2;
	public queue q3;
	private int capacity;
	
	public queueReverse(int x)
	{
		this.capacity=x;
		q1=new queue(x);
		q2=new queue(x);
		q3=new queue(x);
		
	}
	
	public void queueReverse(int a,int b)
	{
		int x=0;
		while(x!=a)
		
		{
			x=q1.dequeue();
			q2.enqueue(x);
			
		}
		q3.enqueue(1);
		q1.show();
		q2.show();
		q3.show();
	    
		while(x!=b)
		{
			x=q1.dequeue();
			q3.enqueue(x);
			
		}
		q1.show();
		q2.show();
		int z=q3.head;
		q3.head=q3.tail;
		q3.tail=z;
		q3.show();
		
	      x=q2.dequeue();
	      int y=x;
	      while(!(q2.isEmpty()))
	      {
	    	  q1.enqueue(x);
	    	  x=q2.dequeue();
	    	  
	      }
		
	      while(!(q3.isEmpty()))
	      {
	    	  q1.enqueue(q3.dequeue());
	    	  
	      }
	      
	      x=0;
	      while(x!=y)
	      {
	    	  x=q1.head;
	    	  if(x!=y)
	    	  {
	    		  q1.enqueue(q1.dequeue());
	    	  }
	    	  
	      }
		
		
	}
	
	
	
	
}
