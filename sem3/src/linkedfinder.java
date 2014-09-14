
public class linkedfinder 
{
   private linkedlist link;
   
   public linkedfinder(linkedlist x)
   {
	   this.link=x;
   }
	
	public linkedlist find(int x)
	{
		linkedlist newlink=new linkedlist();
		Node current=link.getFirst();
		while(current!=null)
		{
			if(current.key==x)
			{
				
				newlink.add(x);
			}
			current=current.getNext();
			
		}
		
		
		
		return newlink;
	}
	
	
	
}
