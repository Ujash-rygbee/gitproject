
public class main3
{
	
	public static void main(String[] args)
	{
		linkedlist link=new linkedlist();
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(5);
		link.add(6);
		linksublist  m=new linksublist(link);
		
		m.sublist_reverse(2, 4);
		
		
	}
       
	
	
	
}
