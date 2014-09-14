package exam; 


public class Mother
{
	
   private int Son_rollno;
   private student[] students;
   private game x;
   private int position;
   
   
    public int getSon_rollno() 
    {
	 return Son_rollno;
    }

    public void setSon_rollno(int son_rollno)
    {
	Son_rollno = son_rollno;
    }
    
    public int getPosition()
    {
	 return position;
    }
  
    public void setPosition(int position) 
    {
	 this.position = position;
    }
    
    Mother(student[] x,int y,game z)
    {
    	this.students=x;
    	this.x=z;
    	this.setSon_rollno(y);
    	
        this.setPosition(1);    	
    }
	
    public void find()
    {
    	int position=this.getPosition();//mother's position
    	int son_rollno=this.getSon_rollno();
    	
        boolean a=false;
        while(a!=true)
        {
        	int x=this.students[position-1].getRollno();
        
        	if(x==son_rollno)
        	{
        		
        		a=true;
        		System.out.println("John is found at position "+ position);
        		System.out.println("time taken is"+this.x.gettime());
                this.x.changetime(2);
        	}
        	
        	else
        	{
        		this.x.changetime(2);
        		int difference=son_rollno-x;
        		position=position+difference;
        		
        		if(position>23)
        			position=position%23;
        		
        		else if(position<1)
        			position=position+23;
        		
        		this.setPosition(position);
        	}
         }
        
       }
    
       
     boolean a=false;
       public void find1(int startindex,int endindex)
       {
    	   int key=this.getSon_rollno();
    	   int position=0;
    	   
    	   {  
    	  if(startindex<endindex)
    	  {
    	    
    	    int middleindex=0;
    		this.x.changetime(2);   
    	   
    	   int difference=endindex+startindex;
    	   
    	  middleindex=difference/2;
    	  
    	   
    	   if(students[middleindex].getRollno()==key )
    	   {
    		   
    		   this.x.changetime(2);
    		   position=middleindex+1;
    		   System.out.println("found");
    		  // System.out.println(position);
    		   System.out.println("time taken="+this.x.gettime());
    		   position=position-((this.x.gettime()/4)*2);
    		   if(position<1)
    			   position+=students.length;
    		   
    		   System.out.println("John is found at position "+position);
    		   return;
    	   }
    	  
    	   
    	     if(students[startindex].getRollno()<students[middleindex].getRollno())
    		   {
    			    if(key>=students[startindex].getRollno() && key<students[middleindex].getRollno())
    			    find1(startindex,middleindex);
    			   
    			   else
    			   {
    				 
    				find1(middleindex,endindex);   
    			   }    			   
    		   }
    		   
    		   else if(students[startindex].getRollno()>students[middleindex].getRollno())
    		   {
    			  
    			  if(key>=students[startindex].getRollno() || students[middleindex].getRollno()>=key)
    			    find1(startindex,middleindex);
    		   
    			  else
    			  find1(middleindex,endindex);
    			}
    	     
    		   }
    	     }
   
    	   }
    	   
    
       
	
	


}