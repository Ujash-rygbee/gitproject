package exam;

public class student {
	
	private int position;
	private int Rollno;
	
	student(int x,int y)
	{
	
		this.setPosition(x);
		this.setRollno(y);
		
	}
	public int getPosition()
	{
		return position;
	}
	
	public void setPosition(int position)
	{
		this.position = position;
	}
	 
	public int getRollno() 
	{
		return Rollno;
	}
	
	public void setRollno(int rollno) 
	{
		Rollno = rollno;
	}
	
	public void changePosition(student[] x)
	{
		int position=this.getPosition();
		position-=2;
		if(position<1)
		position+=x.length;
		
		this.setPosition(position);
	}
	
	
	
    }
