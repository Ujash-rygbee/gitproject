package lab;

public class stack {
	
	private int top=-1;
	private char m[];
	private boolean a=false;
	
	
	
	
	public stack(int x)
	{
		m=new char[x];
	}
	
	public void push(char a)
	{
		m[++top]=a;
	}
	
	public char pop()
	{
		if(!(this.isEmpty()))
		{
			return m[top--];
		}
		
		else
		return ' ';
		
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
	     a=true;
		   
		return a;
	}
	
	public char top()
	{
		return m[top];
	}
}
