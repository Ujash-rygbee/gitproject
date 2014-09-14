
public class Sort {
	
	String a[]={"ujash","malav","dharmen","nipa"};
	
	public void take()
	{
		
	
	
	}
	
	
    public void sort()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String r=a[i];
					a[i]=a[j];
					a[j]=r;
				}
			}
		}
			 
			 
		   }
		
	
	public void print()
	{
		for(String x:a)
			System.out.println(x);
	}

}
