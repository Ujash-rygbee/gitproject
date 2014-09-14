
public class main4 {

	public static void main(String[] args)
	
	{
		linkedlist link=new linkedlist();
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(5);
		link.add(6);
		link_sub_sequence linked=new link_sub_sequence(link);
	    int a[]={1,2,3,4,5,6};
	    link=linked.reverse(a);
	    link.show();
		

	}

}
