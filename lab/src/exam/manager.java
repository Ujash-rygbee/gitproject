package exam;
import java.util.Scanner;


public class manager 
  {
	
	private people[][] allocate=new people[8][8];
	private Scanner scan;
	private int rents[]=new int[3];
	manager()
	{
		scan=new Scanner(System.in);
		for(int i=0;i<3;i++)
		rents[i]=scan.nextInt();
	}
	
	
	public void allocate()
	{
	  for(int i=0;i<=7;i++)
	  {
		  for(int j=0;j<=7;j++)
		  {
			  
		 if(!((i==0||i==7) || (j==0 || j==7)))
		 { 
			if((i==1||i==6) || (j==1 || j==6) )
			allocate[i][j]=new people(rents[0],"s");
			
			
			else if((i==2 || i==5) || (j==2 || j==5))
			allocate[i][j]=new people(rents[1],"p");
			
			
			else if((i==3)||(i==4) || (j==3|| j==4))
			allocate[i][j]=new people(rents[2],"b");
		 }	
			
		   else
			{
				allocate[i][j]=new people(0,"0");
			}
		  }
	    }
	  
	  for(int i=1;i<7;i++)
	  {
		  for(int j=1;j<7;j++)
			allocate[i][j].assignNeighbours(allocate, i, j);  
	  }
	  
	 }
	
	
	 
	  public void check_for_max_profit()
	  {
	   int sum[]=new int[4];
		String pattern_storer[][]=new String[4][6];

		//case 1
	    this.subcheck("outer","middle",allocate); 
	    pattern_storer[0]=this.storepattern(allocate);
		sum[0]=this.give_rent_of_pattern(allocate);
		
		
		 //case 2
		  this.subcheck("outer", "inner", allocate);
		  pattern_storer[1]=this.storepattern(allocate);
		  sum[1]=this.give_rent_of_pattern(allocate);
		
		
		//case 3
		  this.subcheck("middle","0",allocate);
		  pattern_storer[2]=this.storepattern(allocate);
		  sum[2]=this.give_rent_of_pattern(allocate);
		
		
		//special case//
	   this.subcheck("inner","0",allocate); 
		
		for(int i=2;i<=5;i++)
		  {
			  for(int j=2;j<=5;j++)
			  {
				if((i==2||i==5) && (j==2 || j==5) )
				{
					allocate[i][j].check();
				}
			  }
		  }
		this.subcheck("outer","0",allocate);
		pattern_storer[3]=this.storepattern(allocate);
		sum[3]=this.give_rent_of_pattern(allocate);
		
	   
		int max=0;
		int index=0;
		for(int i=0;i<=3;i++)
			if(max<sum[i])
			{
				max=sum[i];
				index=i;
			}

		System.out.println(sum[index]);
		for(String x:pattern_storer[index])
			System.out.println(x);
		
	}
	  
	  public void subcheck(String x,String y,people[][]z)
	  {
		int b[]=this.findmatch(x);
		//b[0]=start index;
		//b[1]=stop index;
		
		for(int i=b[0];i<=b[1];i++)
	   {
		   for(int j=b[0];j<=b[1];j++)
		   {
			   if((i==b[0] || i==b[1]) || (j==b[0] || j==b[1]))
				   z[i][j].check();
		   }
	   }
		
		if(!(y.equals("0")))
	  {			
		b=this.findmatch(y);

	     for(int i=b[0];i<=b[1];i++)
		   {
			   for(int j=b[0];j<=b[1];j++)
			   {
				   if((i==b[0] || i==b[1]) || (j==b[0] || j==b[1]))
					   z[i][j].check();
			   }
		   }		
	}
	  }
	   
	  public int[] findmatch(String x)
	  {
		  int start=1;
			int stop=6;
		   if(x.equalsIgnoreCase("inner"))
		   {
			   start=3;
			   stop=4;
			}
		   
		   else if(x.equalsIgnoreCase("middle"))
		   {
			   start=2;
			   stop=5;
			}
		   
		   else if(x.equalsIgnoreCase("outer"))
				   {
			        start =1;
			        stop=6;
				   }
		   int a[]={start,stop};
           return a;
	  }
	  
	  
	public int give_rent_of_pattern(people[][] x)//calculate the rent
	{
		int sum=0;
		for(int i=1;i<x.length-1;i++)
			for(int j=1;j<x[0].length-1;j++)
		    sum+=x[i][j].getRent();
		
	this.allocate();	
	return sum;
	}
	
	public String[] storepattern(people[][] x)
	{
		String a[]=new String[x.length-2];
		for(int i=1;i<7;i++)
		{
			a[i-1]=new String();
			for(int j=1;j<7;j++)
			{
			 a[i-1]=a[i-1]+" "+x[i][j].getType();//here a[i-1] because i starts with 1 and we we want to store in String[0]
			}
		}
		return a;
	}
}