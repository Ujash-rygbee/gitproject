package sem3;

public class main1c {

	public static void main(String[] args) 
	{
		queue1 q1=new queue1(5);
		 q1.enqueue(1);
		 q1.show();
		 q1.enqueue(2);
		 q1.show();
		 q1.enqueue(3);
		 q1.show();
		 q1.enqueue(4);
		 q1.show();
		 q1.enqueue(5);
		 q1.show();
		 q1.enqueue(6);
		 q1.show();
		
		 q1.dequeue();
		 q1.show();
		 q1.dequeue();
		 q1.show();
		 q1.dequeue();
		 q1.show();
		 q1.dequeue();
		 q1.show();
		 q1.dequeue();
		 q1.show();
		 q1.dequeue();
		 q1.show();

	}

}
