package sem3;
import java.util.*;

public class strings 
{
    private Scanner scan=new Scanner(System.in);
    private String a;
    private String b;
    int x[]=new int[26];
    int y[]=new int[26];
    QueueNode queue[][]=new QueueNode[2][26];
    QueueNode queue1[]=new QueueNode[26]; 
    
    
	public void scan()
	{
		a=scan.nextLine();
		b=scan.nextLine();
	for(int j=0;j<2;j++)
	{	
		for(int i=0;i<queue.length;i++)
		{
			
			queue[j][i]=new QueueNode();
		}
	}	
		System.out.println(a);
		System.out.print(b);
		
	}
	
	 public void occurences()
	 {
		 
		 
		 
		 for(int i=0;i<a.length();i++)
		 {
			 int m=(int)a.charAt(i);
			 m=m-97;
			 x[m]++;
			 queue[0][m].enqueue(i);
			 
			 
			 m=(int)b.charAt(i);
			 m=m-97;
			 y[m]++;
			 queue[1][m].enqueue(i);
			 
			 queue1[i]=new QueueNode();
		 }
		 
		 
		 
		 
	 }
	
	private int findminimum(int a,int b)
	{
	  	if(a>=b)
	  		return b;
		
		
	  	else 
	  		return a;
	}
	
	private int findmax(int a,int b)
	{
		if(a>=b)
	  		return a;
		
		
	  	else 
	  		return b;
		
		
	}
	
	public void findCommon()
	{
		for(int i=0;i<x.length;i++)
		{
			int a=this.findminimum(x[i],y[i]);
			x[i]=a;
			for(int j=0;j<a;j++)
			{
				queue1[j].enqueue(this.findmax(queue[0][i].dequeue(),queue[1][i].dequeue()));
				
		    }
			
		}
		
		
		
	}
	
	
	
}
