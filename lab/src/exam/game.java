package exam;

public class game {
	
	private int time;
	game()
	{
	 this.time=0;	
	}
	
	public void changetime(int x)
	{
		this.time=this.time+x;
	}
	
	public int gettime()
	{
		return this.time;
	}
	
    public void reset()
    {
    	time=0;
    }
}
