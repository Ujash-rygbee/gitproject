package sem3;

public class queue1
{
	private stack s1;
	private stack s2;
	
	public queue1(int x)
	{
		
		s1=new stack(x);
		s2=new stack(x);
	}
	
	public void enqueue(int x)
	{
		if(!(s1.isfull()))
			s1.push(x);
		
		else
			System.out.println("queue is full");
		
	}
	
	
	public int dequeue()
	{
		int x=0;
        if(!(s1.isEmpty()))
        {
        	while(!(s1.isEmpty()))
        		s2.push(s1.pop());
        	
        	x=s2.pop();
        	while(!(s2.isEmpty()))
        		s1.push(s2.pop());
        }
        
        
        else
        	System.out.println("empty");
		
		
		
		
		return x;
	}
  
	 public void show()
	 {
		 s1.show();
	 }
   
   
   
  
}
   
	
	
	
	
	


