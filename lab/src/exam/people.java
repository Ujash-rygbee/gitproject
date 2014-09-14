package exam;

public class people
{
	
	people(int x,String y)
	{
		this.rent=x;
		this.type=y;
		
	}
    
   private int rent;
   private String type;
    people[] Neighbours=new people[8];
   
   public void assignNeighbours(people[][] x,int i,int j)
   {
	Neighbours[0]=x[i-1][j-1];
	Neighbours[1]=x[i-1][j];
	Neighbours[2]=x[i-1][j+1];
	Neighbours[3]=x[i][j-1];
    Neighbours[4]=x[i][j+1];
    Neighbours[5]=x[i+1][j-1];
    Neighbours[6]=x[i+1][j];
    Neighbours[7]=x[i+1][j+1];

 }
 
   public void check()
   {
	   
	   int count1=0;
	   int count2=0;
	   int count=0;
	   people e1;
	   e1=null;
	  
    for(int i=0;i<Neighbours.length;i++)
    {
      if(!((Neighbours[i].getType().equals("0") && Neighbours[i].getType().equals(this.getType()))))
    		  {
    	        count++;
    	        if(count==1)
    	        {
    	        	e1=Neighbours[i];
    	        	count1++;
    	        }
    	        
    	        else if((Neighbours[i].getType().equals(e1.getType())) && count>1)
    	       	count1++;
    	        
    	        
    	        else if(!(Neighbours[i].getType().equals(e1.getType())))
    	        {
    	        	count2++;
    	        }
    	        
    	        
    	        if(count1==2 || count2==2)
    	        {
    	        	this.setRent(0);
    	        	this.setType("0");
    	        	break;
    	        }
    	  
    		  }
     
     }
  }
   
public int getRent()
{
	return rent;
}
public void setRent(int rent)
{
	this.rent = rent;
}

public String getType() 
{
	return type;
}

public void setType(String type)
{
	this.type = type;
}
}
