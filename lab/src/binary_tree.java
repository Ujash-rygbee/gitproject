import java.util.Queue;
import java.util.LinkedList;

public class binary_tree 
{
   Node rootnode=null;
  private Node current;
  Queue<Node>_q=new LinkedList<Node>();
  
  
  
  
  public void traverse()
  {
	  _q.add(rootnode);
	  while(!(_q.isEmpty()))
	  {
	   Node foo=_q.peek();
	   if(foo.getleftnode()!=null)
	   _q.add(foo.getleftnode());
		  
	   if(foo.getrightnode()!=null)
		   _q.add(foo.getrightnode());

	   _q.remove();
	   System.out.println(foo.getEmployee().getSalary());
	  }
  }
  
  public void insert(Employee x)
  {
	  
	  int tenure=x.getTenure();
	  int salary=x.getSalary();
	  current=rootnode;
	  boolean a=false;
	  Node newnode=new Node(x);
	  if(rootnode==null)
		{
		   rootnode=newnode;
		   System.out.println("inserted at rootnode");
	           
		}
	  
	  
	  else if(rootnode!=null)
	  {
		  while(a==false)
		  {	  
		  
		  if(current.getEmployee().getTenure()<tenure)	 
		  {
			  System.out.println("right");
			  if(current.getrightnode()==null)
			  {
				  current.set_rightnode(newnode);
				  
				  a=true;
			  }
			  
			  else if(current.getrightnode()!=null)
				  current=current.getrightnode();
			  
		  }	
		  
		  if(current.getEmployee().getTenure()>tenure)	 
		  {
			  System.out.println("left");
			 if(current.getleftnode()==null)
			 {
				 current.set_leftnode(newnode);
				 a=true;
			 }
			 
			 else if(current.getleftnode()!=null)
				 current=current.getleftnode();
		  }
		  
		  
		  if(current.getEmployee().getTenure()==tenure)
		  {
			  if(current.getEmployee().getSalary()>=salary)
			  {
				  System.out.println("left");
				  if(current.getleftnode()==null)
					 {
						 current.set_leftnode(newnode);
						 a=true;
					 }
					 
					 else if(current.getleftnode()!=null)
						 current=current.getleftnode();
			  }
			  
			  else if(current.getEmployee().getSalary()<salary)
			  {
				  System.out.println("right");
				  if(current.getrightnode()==null)
					 {
						 current.set_rightnode(newnode);
						 a=true;
					 }
					 
					 else if(current.getrightnode()!=null)
						 current=current.getrightnode();
			  }
		  }
			
		}
	 }
	  
 }  
  
   
  
  
        public void find(int x,int y)
        {
        	boolean a=false;
        	System.out.println();
        	if(rootnode!=null)
        	{
        		current=rootnode;
        		while(current!=null)
        		{	
        		  int tenure=current.getEmployee().getTenure();
        		  int salary=current.getEmployee().getSalary();
        		  
        		  if(x==tenure && y==salary)
        		  {
        			  System.out.print(current.getEmployee().getId()+" ");
        			  current=current.getleftnode();
                       a=true;
        		  }
        		  
        		  if(x<tenure)
        			current=current.getleftnode();
        		  
        		  if(x>tenure)
        			 current=current.getrightnode();
        		  
        		 if(x==tenure)
        		 {
        			 if(y<salary)
        			current=current.getleftnode();
        			 
        			 else if(y>salary)
        			current=current.getrightnode();	 
        		 }
        		 
        	}
        	if(a==false)
        	System.out.print("NOT FOUND");	
        		
        	}
        }
  
  



}
  
  



