package sem3;

public class main1b {

	public static void main(String[] args) 
	{
		queue q=new queue(5);
		for(int i=0;i<7;i++)
		{
			q.enqueue(i);
			q.show();
		}
		
		
		for(int i=0;i<7;i++)
		{
			q.dequeue();
			q.show();
		}
		

	}

}
