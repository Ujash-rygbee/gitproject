package sem3;

public class stackq
{
   public queue q1;
   public queue q2;
   
   stackq(int x)
   {
	   
	   q1=new queue(x);
	   q2=new queue(x);
   }
	
   
   public int pop()
   {
	   int y=0;
	   int x=0;
	   if(!(q1.isEmpty()))
	   {   
	   while(!(q1.isEmpty()))
	   {
	   	   q2.enqueue(q1.dequeue());
		    y++;
		  
	   }
	   while(y!=1)
	   {
		   q1.enqueue(q2.dequeue());
		   y--;
	   }
		   x=q2.dequeue();
		   q1.show();
	   }
	   
	   
	   else
		   System.out.println("empty");
	   
	   return x;
	   
	   
	   
   }
   
   public void push(int x)
   {
	   
	   q1.enqueue(x);
	   
   }
	
	
	
}
