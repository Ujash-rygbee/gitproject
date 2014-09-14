package exam;

import java.util.Scanner;

import java.io.*;
import java.util.*;

public class shopkeeper {
	
	Queue<Vegetables>_rack=new LinkedList<Vegetables>();
	
    private bag[] Bags=new bag[3];
    private int _rack_capacity;
	private Vegetables[] array;
	private double d[][]=new double[3][3];
	
    
    public void get_Input(String x,int m,int n)throws IOException
	{
		double c[][]=new double[3][3];
		Scanner scan=new Scanner(new File(x));
	    this._rack_capacity=m;
		array=new Vegetables[_rack_capacity];
	
        for(int i=0;i<array.length;i++)
        array[i]=new Vegetables(scan.next());
       
        
        for(int i=0;i<Bags.length;i++)
        {
        	Bags[i]=new bag(n);
        	System.out.println("input times");
        	 scan=new Scanner(System.in);
        	
        	for(int j=0;j<3;j++)
        	{
        		c[i][j]=scan.nextDouble();
        		d[i][j]=c[i][j];
        	}
        		 
       		 Bags[i].setTime(c[i]);
         }
        
        
          scan.close();
          }
	
	
	public void sort_veggies()
	
	{
		int n=Bags[0].getCapacity();
		int[] count={0,0,0};
	    double[] b=new double[_rack_capacity];	
	    double[][] e=new double[3][];
	   double[][] c=new double[3][3];
	    
	   for(int i=0;i<Bags.length;i++)
	     {
	     	e[i]=Bags[i].getTime();
	     }
	   
	   
	   for(int i=0;i<3;i++)
		   for(int j=0;j<3;j++)
			   c[i][j]=e[i][j];
	   
	
	   
	   for(int i=0;i<c[0].length;i++)
	   {
		   double m;
		   for(int j=0;j<c.length-1;j++)
		   {
			   for(int k=j+1;k<c.length;k++)
			   {
				   if(c[j][i]>c[k][i])
				   {
					   m=c[j][i];
					   c[j][i]=c[k][i];
					   c[k][i]=m;
				   }
			   }
			   
		   }
	   }
	   
	   for(int i=0;i<array.length;i++) 
	   {
		   int j=0;
		   if(array[i].getType().equalsIgnoreCase("Car"))
		   {
			   j=1;
			   count[j]++;
		   }
		   
		   else if(array[i].getType().equalsIgnoreCase("Sp"))
			   {
			    j=2;
			    count[j]++;
			   }
		   
		   else{
			   count[j]++;
		      }
		   
		   if(count[j]<=n)
			  b[i]=c[0][j]; 
		   
		   if(count[j]>n && count[j]<=2*(n))
			   b[i]=c[1][j];
		   
		   if(count[j]>2*n)
			   b[i]=c[2][j];
	   }
	     
	    Vegetables veggy; 
	    for(int i=0;i<b.length-1;i++)
	   {
		 double y;
	     for(int j=i+1;j<b.length;j++)
	     {
		   if(b[i]>b[j])
		   {
		  	 veggy=array[i];
		  	 array[i]=array[j];
		     array[j]=veggy;
		     
		     y=b[i];
		     b[i]=b[j];
		     b[j]=y;
	    	}
		  }
	     }
	    for(int i=0;i<9;i++)
	    {
	    	System.out.print(array[i].getType()+" ");
	    	System.out.println(b[i]+" ");
	    }
	    
	    
	    double sum=0;
	    for(int i=0;i<3*Bags[0].getCapacity();i++)
	    	sum=sum+b[i];
	    
	    System.out.println(sum);
	 }
	
	
	  public void store_veggies()
	  {
		  for(int i=0;i<3*Bags[0].getCapacity();i++)
			 _rack.add(array[i]); 
	        	     
	  }
	  
	  
	  public void put_into_bag()
	  {
		  double c[][]=new double[3][3];
	      for(int i=0;i<3;i++)
	    	  for(int j=0;j<3;j++)
	    		  c[i][j]=d[i][j];
      
      
        
        while(!(_rack.isEmpty()))
        {
        	Vegetables veggy;
        	veggy=_rack.remove();
        	int j=0;
			if(veggy.getType().equalsIgnoreCase("Ca"))
        	 j=0;
			
			if(veggy.getType().equalsIgnoreCase("Car"))
	        	 j=1;
			
			if(veggy.getType().equalsIgnoreCase("Sp"))
	        	 j=2;
			
	
			
			int b[]=find(c,j);
			
			
			
			for(int x:b)
				System.out.print(x+" ");
			
			System.out.println();

			if(!(Bags[b[0]].isfull()))
			{
			System.out.println("done1");
				Bags[b[0]].addVegetables(veggy);
			}
			else if(Bags[b[0]].isfull())
			{
				System.out.println("done2");
			 Bags[b[1]].addVegetables(veggy);	
			}
			else
			{
				System.out.println("done3");
			Bags[b[2]].addVegetables(veggy);	
			}
        }
      double sum= Bags[0].removeVegetables()+
       Bags[1].removeVegetables()+
       Bags[2].removeVegetables();
      System.out.print(sum);
      
      
       
       }
	  
	   public int[] find(double[][] c,int j)
	   {
		       int a[]=new int[3];
		       double mid=0;
		       double max=0;
		       double min=100;
		       int m=0;
		       int n=0;
		       int o=0;
		       
		       for(int i=0;i<c.length;i++)
		       {
		    	 if(c[i][j]<min)
		    		 {
		    		  min=c[i][j];
		    		  m=i;
		    		 }
		       
		       
		       if(c[i][j]>max)
		    	   {
		    	   max=c[i][j];
		    	   o=i;
		    	   }
		       
		       }
		       
		       for(int i=0;i<c.length;i++)
		       {
		    	   if(i!=m && i!=o)
		    	   {
		    		   mid=c[i][j];
		    		   n=i;
		    	   }
		      }
		       
		       
		 //    System.out.println("min " +min);
		   //  System.out.println("mid "+mid);
		   //  System.out.println("max "+max);
		   
		   double worse=0;  
		   int index=0;
		   
		   if(min==mid)
		  {
			for(int i=0;i<c.length;i++)
			{
			  for(int k=0;k<c[0].length;k++)
			  {
				if((i!=o || k!=o) && (c[i][k]>worse) )
					{
					  worse=c[i][k];
					  index=i;
					}
			   }
			}
			
			System.out.println("index "+index);
			if(index!=m)
			{
				int u;
			    u=m;
				m=n;
				n=u;
			}
		  }	
		   worse =0;
			if(max==mid)
			  {
				for(int i=0;i<c.length;i++)
				{
				  for(int k=0;k<c[0].length;k++)
				  {
					if((i!=m || k!=m) && (c[i][k]>worse) )
						{
						  worse=c[i][k];
						  index=i;
						}
				   }
				}
				if(index!=n)
				{
					System.out.println("done");
					int u;
				    u=n;
					n=o;
					o=u;
				}
				
				
			
				
				
				
			
		    }
		   a[0]=m;
		   a[1]=n;
		   a[2]=o;
		
		   return a;
	   }
	  
   }
