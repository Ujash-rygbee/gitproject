
public class permur {

	public static void main(String[] args)
	{
	 String x="abcdf";
	 permute(x);

	}
	
	
	public static void permute(String s)
	{
		int m=0;
		char k=0;
		int i=0;
		int x=s.length();
        int j=0;
        char we[]=new char[s.length()];
        we=s.toCharArray();
        
		for(j=0;j<=m;j++)
		{
			
			while(i<x)
			{
				k=we[i];
				we[i]=we[j];
				we[j]=k;
				System.out.println(we);
				k=we[i];
				we[i]=we[j];
				we[j]=k;
				
				i++;
			}
		    
		}
			
			
			
			
		
	}

}
