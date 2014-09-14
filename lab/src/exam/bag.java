package exam;
import java.util.Queue;
import java.util.LinkedList;

public class bag
{
   private int capacity;
	private int i=0;
	private double[] time=new  double[3];
	private Vegetables[] array;
	bag(int x)
	{
	 setCapacity(x);
	 array=new Vegetables[x];
	}
	
	public double removeVegetables()
	{
		double sum=0;
		for(int j=0;j<i;j++)
		{
			if(array[j].getType().equalsIgnoreCase("sp")) 
			sum=sum+time[2];
			
			if(array[j].getType().equalsIgnoreCase("Ca"))
				sum+=time[0];
			
			if(array[j].getType().equalsIgnoreCase("car"))
				sum+=time[1];
			
			System.out.print(array[j].getType()+" ");
			
		}
		System.out.println();
		return sum;
	}
	
	
	
	public void addVegetables(Vegetables x)
	{
	 if(i<capacity)
	 {
		 array[i]=x;
		 ++i;
	 }
   }
	
	public boolean isfull()
	{
		return (i==capacity);
	}

   public double[] getTime()
    {
		return time;
	}
	
	public void setTime(double[] time) {
		this.time = time;
		}
	
	public int getCapacity()
	{
		return this.capacity;
	}
	
   public void setCapacity(int x)
   {
	   this.capacity=x;
   }
	
	
}
