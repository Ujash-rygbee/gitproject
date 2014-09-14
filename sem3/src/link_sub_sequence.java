
public class link_sub_sequence 
{
     private linkedlist newlink;
     
     public link_sub_sequence(linkedlist x)
     {
     	this.newlink=x;
     }
	
	
	private linkedlist sub_reverse_list_method1(int a,int b)
    {
    	Node current1=newlink.getFirst();
    	Node current2=newlink.getTail();
    	
    	while(current1.key!=a)
    	{
    		current1=current1.getNext();
    	}
    	
    	while(current2.key!=b)
    	{
    		
    		current2=current2.getPrevious();
        }
    	
    	int y=current1.key;
    	current1.key=current2.key;
    	current2.key=y;
    	
    /*	if(current1!=newlink.getFirst() && current2!=newlink.getTail())
    	{		
    	  Node previous_one=current1.getPrevious();
    	  Node previous_two=current2.getPrevious();
    	  Node next_one=current1.getNext();
    	  Node next_two=current2.getNext();
    	  
    	  previous_one.setNext(current2);
    	  current2.setPrevious(previous_one);
    	  
    	  next_one.setPrevious(current2);
    	  current2.setNext(next_one);
 
    	  
          current1.setNext(next_two);
          next_two.setPrevious(current1);
          
          current1.setPrevious(previous_two);
          previous_two.setNext(current1);
    	}
    	
    	
    	*/
    	return newlink;
    }
        
	
	public linkedlist reverse(int a[])
	{
		for(int x=0;x<(a.length/2);x++)
		{
			
			this.sub_reverse_list_method1(a[x], a[a.length-x-1]);
			
			
		}
		
		return newlink;
	}
	
	
	
	
	
	
}
