package lab;
import java.util.*;
import java.io.*;
public class residentAccess {
	
	
	private int totalResidents=0;
	residents Resident[];
	ArrayList<residents> list1=new ArrayList<residents>();
	Scanner y;
	String a[]=new String[1000];
	
	
	
	public void readData() throws IOException
	{
		
		y=new Scanner(new File("C:\\Users\\ujash\\Desktop\\records.dat"));
	     int z=4;
		 while(z>0)
		 {
			String x=y.nextLine();
			a[totalResidents]=x;
			if(x.isEmpty())
			{
				z=0;
			}
			 totalResidents++;
			}
		Resident =new residents[totalResidents/5];
		for(int i=0,j=0;j<Resident.length;i=i+5,j++)
		{
		   String x=a[i+1].substring(10,a[i+1].length());
		    y=new Scanner(a[i+3]);
		    int m=y.nextInt();
			Resident[j]=new residents(a[i],x,a[i+2],m,a[i+4]);
			list1.add(new residents(a[i],x,a[i+2],m,a[i+4]));
		}
    }				
	    	 
	     
	public void find_howmany_elder()
   {
		int m=0;
		int y = 1;
		
	for(int x=0;x<Resident.length;x++)	
	 {
		
		if(Resident[x].getAuthority().equals("yes") &&  Resident[x].getSex().equals("female "))
		{
		    y=x;
			int max=Resident[x].getAge();
			for(int i=0;i<Resident.length;i++)
			{
				
				if(Resident[i].getAge()>max)
				{
	               m=m+1;
	               
				}
			}
		}
	  }
    	System.out.println("Number of people elder then "+Resident[y].getName()+" are/is "+m);
		
	  }
	
	public void find_eldest()
	{
		
        int max=-1;	
        int y=0;
		for(int x=0;x<Resident.length;x++)	
		 {
		  if(Resident[x].getAuthority().equals("yes") &&  Resident[x].getSex().equals("male "))
		  {
			  for(int i=0;i<Resident.length;i++)
			  {
				  if(Resident[i].getAge()>max)
				  {
					  max=Resident[i].getAge();
					  y=i;
				  }
			  }
		  }
	   }
	System.out.println("the age of eldest person is "+max+" and his name is "+ Resident[y].getName());
   	}
	
	 public void findbyaddress()
	 {
		 int b=0;
		 for(int i=0;i<Resident.length;i++)
		 {
			 System.out.println("Press "+i+ " for "+Resident[i].getAddress() );
		 }
		 
		y=new Scanner(System.in);
		b=y.nextInt();
	
		System.out.println(Resident[b].getName()); 
		 
	 }
	
}



