package sem3;

public class stack 
{
	private int array[];
	private int capacity;
	private  int top=-1;
	

	public stack(int x)
	{
		this.capacity=x;
		array=new int[capacity];
	}
	
	
	public boolean isEmpty()
	{
		
		return top==-1;
	}
	
	public boolean isfull()
	{
		
		return top==capacity-1;
	}
	
	public int getTop()
	{
		
		return array[top];
	}
	
	public void push(int x)
	{
		if(!(this.isfull()))
		array[++top]=x;
		
		else
			System.out.println("overflow");
		
	}
	
	
	public int pop()
	{
		int x=0;
		if(!(this.isEmpty()))
        x=array[top--];
		
		else
			System.out.println("empty");
		
		return x;
	}
	
	public void show()
	{
		
	for(int i=0;i<=top;i++)
		System.out.print(array[i]+" ");
	
	System.out.println();	
	}


}
	
	
	
	
	
	
	
