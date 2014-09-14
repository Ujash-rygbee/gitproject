
public class linksublist
{
    private linkedlist newlink;
    
    public linksublist(linkedlist x)
    {
    	this.newlink=x;
    }
    
    
    
    
    public void sublist_reverse(int a,int b)
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
    	
    	int i=0;
    	Node current3=current1;
    	while(current3.key!=b)
    	{
    		current3=current3.getNext();
    		i++;
    		
    	}
    	System.out.println(i);
    	int j=0;
    	i=i/2;
    	while(j<=i)
    	{
    		int m=current1.key;
    		current1.key=current2.key;
    		current2.key=m;
    		current1=current1.getNext();
    		current2=current2.getPrevious();
    		j++;
    		
    	}
    			
    	newlink.show();
    	
    	
    }
    
	
	
	
}
